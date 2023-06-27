package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.K8sContainerInfo;
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

import static com.pandalu.workloadservice.db.Tables.K8S_CONTAINER_INFO;


@Service("ContainerService")
public class ContainerServiceImpl implements ContainerService{
    public List<K8sContainerInfo> getK8sContainerInfoList() {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        List<K8sContainerInfo> list=new ArrayList<K8sContainerInfo>();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(K8S_CONTAINER_INFO).fetch();
            recordResult.forEach(record -> {
                K8sContainerInfo i=new K8sContainerInfo();
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

    public K8sContainerInfo getK8sContainerInfo(String name) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        K8sContainerInfo i=new K8sContainerInfo();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(K8S_CONTAINER_INFO).where(K8S_CONTAINER_INFO.NAME.eq(name)).fetch();
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

    public Boolean postK8sContainerInfo(K8sContainerInfo container) {
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

            dslContext.insertInto(K8S_CONTAINER_INFO,K8S_CONTAINER_INFO.NAME,K8S_CONTAINER_INFO.OWNERPOD,K8S_CONTAINER_INFO.MINCPU,
                                  K8S_CONTAINER_INFO.MINMEMORY,K8S_CONTAINER_INFO.MAXCPU,K8S_CONTAINER_INFO.MAXMEMORY,K8S_CONTAINER_INFO.TIMESTAMP)
                    .values(container.getName(),container.getOwnerpod(),container.getMincpu(),container.getMinmemory(),container.getMaxcpu(),container.getMaxmemory(),container.getTimestamp())
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

    public Boolean putK8sContainerInfo(String name, K8sContainerInfo container) {
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

            dslContext.update(K8S_CONTAINER_INFO).set(K8S_CONTAINER_INFO.NAME,container.getName())
                    .set(K8S_CONTAINER_INFO.OWNERPOD,container.getOwnerpod())
                    .set(K8S_CONTAINER_INFO.MINCPU,container.getMincpu())
                    .set(K8S_CONTAINER_INFO.MINMEMORY,container.getMinmemory())
                    .set(K8S_CONTAINER_INFO.MAXCPU,container.getMaxcpu())
                    .set(K8S_CONTAINER_INFO.MAXMEMORY,container.getMaxmemory())
                    .set(K8S_CONTAINER_INFO.TIMESTAMP,container.getTimestamp())
                    .where(K8S_CONTAINER_INFO.NAME.eq(name))
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

    public Boolean deleteK8sContainerInfo(String name) {
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

            dslContext.delete(K8S_CONTAINER_INFO).where(K8S_CONTAINER_INFO.NAME.eq(name)).execute();
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
