package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.InstanceInfo;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static com.pandalu.workloadservice.db.Tables.INSTANCE_INFO;

@Service("InstanceService")
public class InstanceServiceImpl implements InstanceService{
    @Override
    public List<InstanceInfo> getInstanceInfoList() {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        List<InstanceInfo> list=new ArrayList<InstanceInfo>();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(INSTANCE_INFO).fetch();
            recordResult.forEach(record -> {
                InstanceInfo i=new InstanceInfo();
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
    public InstanceInfo getInstanceInfo(String id) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        InstanceInfo i=new InstanceInfo();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(INSTANCE_INFO).where(INSTANCE_INFO.INSTANCEID.eq(id)).fetch();
            recordResult.get(0).into(i);
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
    public Boolean postInstanceInfo(InstanceInfo instance) {
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
            dslContext.insertInto(INSTANCE_INFO,INSTANCE_INFO.INSTANCEID,INSTANCE_INFO.TOTALCPU,INSTANCE_INFO.TOTALMEM,
                            INSTANCE_INFO.TOTALDISK,INSTANCE_INFO.USEDCPU,INSTANCE_INFO.USEDMEM,INSTANCE_INFO.USEDDISK,
                            INSTANCE_INFO.VMIMAGEID,INSTANCE_INFO.RREQUESTNUM,
                            INSTANCE_INFO.WREQUESTNUM,INSTANCE_INFO.READBYTES,INSTANCE_INFO.WRITEBYTES,INSTANCE_INFO.TIMESTAMP)
                    .values(instance.getInstanceid(),instance.getTotalcpu(),instance.getTotalmem(),instance.getTotaldisk(),
                            instance.getUsedcpu(),instance.getUsedmem(),instance.getUseddisk(),instance.getVmimageid(),
                            instance.getRrequestnum(),instance.getWrequestnum(),instance.getReadbytes(),instance.getWritebytes(),instance.getTimestamp())
                    .execute();
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return false;
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            return false;
        }
        return true;
    }

    @Override
    public Boolean putInstanceInfo(String id, InstanceInfo instance) {
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
            dslContext.update(INSTANCE_INFO)
                    .set(INSTANCE_INFO.VMIMAGEID,instance.getVmimageid())
                    .set(INSTANCE_INFO.TOTALCPU,instance.getTotalcpu())
                    .set(INSTANCE_INFO.TOTALMEM,instance.getTotalmem())
                    .set(INSTANCE_INFO.TOTALDISK,instance.getTotaldisk())
                    .set(INSTANCE_INFO.USEDCPU,instance.getUsedcpu())
                    .set(INSTANCE_INFO.USEDMEM,instance.getUsedmem())
                    .set(INSTANCE_INFO.USEDDISK,instance.getUseddisk())
                    .set(INSTANCE_INFO.RREQUESTNUM,instance.getRrequestnum())
                    .set(INSTANCE_INFO.WREQUESTNUM,instance.getWrequestnum())
                    .set(INSTANCE_INFO.READBYTES,instance.getReadbytes())
                    .set(INSTANCE_INFO.WRITEBYTES,instance.getWritebytes())
                    .set(INSTANCE_INFO.TIMESTAMP,instance.getTimestamp())
                    .where(INSTANCE_INFO.INSTANCEID.eq(instance.getInstanceid()))
                    .execute();
            conn.close();
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return false;
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            return false;
        }
        return true;
    }

    @Override
    public Boolean deleteInstanceInfo(String id) {
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
            dslContext.delete(INSTANCE_INFO)
                    .where(INSTANCE_INFO.INSTANCEID.eq(id))
                    .execute();
            conn.close();
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return false;
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            return false;
        }
        return true;
    }
}
