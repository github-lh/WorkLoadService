package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.K8sPodInfo;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.pandalu.workloadservice.db.Tables.K8S_POD_INFO;

@Service("PodService")
public class PodServiceImpl implements PodService{
    @Override
    public List<K8sPodInfo> getK8sPodInfoList() {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        List<K8sPodInfo> list=new ArrayList<K8sPodInfo>();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(K8S_POD_INFO).fetch();
            recordResult.forEach(record -> {
                K8sPodInfo i=new K8sPodInfo();
                record.into(i);
                list.add(i);
            });
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return null;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return null;
        }
        return list;
    }

    @Override
    public K8sPodInfo getK8sPodInfo(String name) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        K8sPodInfo i=new K8sPodInfo();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(K8S_POD_INFO).where(K8S_POD_INFO.NAME.eq(name)).fetch();
            recordResult.forEach(record -> {
                record.into(i);
            });
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return null;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return null;
        }
        return i;
    }

    @Override
    public Boolean postK8sPodInfo(K8sPodInfo pod) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            dslContext.insertInto(K8S_POD_INFO,K8S_POD_INFO.UID,K8S_POD_INFO.NAME,K8S_POD_INFO.IP,K8S_POD_INFO.OWNERNODE,
                                  K8S_POD_INFO.USEDCPU,K8S_POD_INFO.USEDMEMORY,K8S_POD_INFO.TIMESTAMP)
                    .execute();
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return false;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return false;
        }
        return true;
    }

    @Override
    public Boolean putK8sPodInfo(String name, K8sPodInfo pod) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            dslContext.update(K8S_POD_INFO).set(K8S_POD_INFO.UID,pod.getUid())
                    .set(K8S_POD_INFO.NAME,pod.getName())
                    .set(K8S_POD_INFO.IP,pod.getIp())
                    .set(K8S_POD_INFO.OWNERNODE,pod.getOwnernode())
                    .set(K8S_POD_INFO.USEDCPU,pod.getUsedcpu())
                    .set(K8S_POD_INFO.USEDMEMORY,pod.getUsedmemory())
                    .set(K8S_POD_INFO.TIMESTAMP,pod.getTimestamp())
                    .where(K8S_POD_INFO.NAME.eq(name)).execute();
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return false;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return false;
        }
        return true;

    }

    @Override
    public Boolean deleteK8sPodInfo(String name) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            dslContext.delete(K8S_POD_INFO).where(K8S_POD_INFO.NAME.eq(name)).execute();
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return false;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return false;
        }
        return true;

    }
}
