package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.K8sNodeInfo;
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

import static com.pandalu.workloadservice.db.Tables.K8S_NODE_INFO;

@Service("NodeService")
public class NodeServiceImpl implements NodeService{
    @Override
    public List<K8sNodeInfo> getNodeInfoList() {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        List<K8sNodeInfo> list=new ArrayList<K8sNodeInfo>();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(K8S_NODE_INFO).fetch();
            recordResult.forEach(record -> {
                K8sNodeInfo i=new K8sNodeInfo();
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
    public K8sNodeInfo getNodeInfo(String name) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        K8sNodeInfo node=new K8sNodeInfo();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(K8S_NODE_INFO).where(K8S_NODE_INFO.NAME.eq(name)).fetch();
            recordResult.forEach(record -> {
                record.into(node);
            });
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return null;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return null;
        }
        return node;
    }

    @Override
    public Boolean postNodeInfo(K8sNodeInfo node) {
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

            dslContext.insertInto(K8S_NODE_INFO,K8S_NODE_INFO.UID,K8S_NODE_INFO.NAME,K8S_NODE_INFO.CITY,K8S_NODE_INFO.IP,
                                  K8S_NODE_INFO.MAXPODS,K8S_NODE_INFO.USEDPODS,K8S_NODE_INFO.MAXCPU,K8S_NODE_INFO.USEDCPU,
                                  K8S_NODE_INFO.MAXMEMORY,K8S_NODE_INFO.USEDMEMORY,K8S_NODE_INFO.TIMESTAMP)
                    .values(node.getUid(),node.getName(),node.getCity(),node.getIp(),node.getMaxpods(),node.getUsedpods(),
                            node.getMaxcpu(),node.getUsedcpu(),node.getMaxmemory(),node.getUsedmemory(),node.getTimestamp())
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
    public Boolean putNodeInfo(String name, K8sNodeInfo node) {
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

            dslContext.update(K8S_NODE_INFO).set(K8S_NODE_INFO.UID,node.getUid()).set(K8S_NODE_INFO.NAME,node.getName())
                    .set(K8S_NODE_INFO.CITY,node.getCity()).set(K8S_NODE_INFO.IP,node.getIp()).set(K8S_NODE_INFO.MAXPODS,node.getMaxpods())
                    .set(K8S_NODE_INFO.USEDPODS,node.getUsedpods()).set(K8S_NODE_INFO.MAXCPU,node.getMaxcpu()).set(K8S_NODE_INFO.USEDCPU,node.getUsedcpu())
                    .set(K8S_NODE_INFO.MAXMEMORY,node.getMaxmemory()).set(K8S_NODE_INFO.USEDMEMORY,node.getUsedmemory()).set(K8S_NODE_INFO.TIMESTAMP,node.getTimestamp())
                    .where(K8S_NODE_INFO.NAME.eq(name)).execute();
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
    public Boolean deleteNodeInfo(String name) {
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

            dslContext.delete(K8S_NODE_INFO).where(K8S_NODE_INFO.NAME.eq(name)).execute();
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
