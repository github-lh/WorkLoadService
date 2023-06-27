package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.PmInfo;

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

import static com.pandalu.workloadservice.db.Tables.PM_INFO;

@Service("PMInfoService")
public class PMInfoServiceImpl implements PMInfoService{
    @Override
    public List<PmInfo> getPMInfoList() {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        List<PmInfo> list=new ArrayList<PmInfo>();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(PM_INFO).fetch();
            recordResult.forEach(record -> {
                PmInfo i=new PmInfo();
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
    public PmInfo getPMInfo(String id) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        PmInfo i=new PmInfo();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(PM_INFO).where(PM_INFO.PMID.eq(id)).fetch();
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
    public Boolean postPMInfo(PmInfo pmInfo) {
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

            dslContext.insertInto(PM_INFO,PM_INFO.UUID,PM_INFO.PMID,PM_INFO.PMNAME,PM_INFO.STATE,PM_INFO.CITY,PM_INFO.PMIP,PM_INFO.TOTALCPU,PM_INFO.TOTALMEM,
                                  PM_INFO.TOTALBAND,PM_INFO.TOTALDISK,PM_INFO.USEDCPU,PM_INFO.USEDMEM,PM_INFO.USEDBAND,PM_INFO.USEDDISK,PM_INFO.NVMS,PM_INFO.TIMESTAMP)
                    .values(pmInfo.getUuid(),pmInfo.getPmid(),pmInfo.getPmname(),pmInfo.getState(),pmInfo.getCity(),pmInfo.getPmip(),pmInfo.getTotalcpu(),pmInfo.getTotalmem(),
                            pmInfo.getTotalband(),pmInfo.getTotaldisk(),pmInfo.getUsedcpu(),pmInfo.getUsedmem(),pmInfo.getUsedband(),pmInfo.getUseddisk(),pmInfo.getNvms(),pmInfo.getTimestamp())
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
    public Boolean putPMInfo(String id, PmInfo pmInfo) {
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

            dslContext.update(PM_INFO).set(PM_INFO.UUID,pmInfo.getUuid()).set(PM_INFO.PMID,pmInfo.getPmid()).set(PM_INFO.PMNAME,pmInfo.getPmname()).set(PM_INFO.STATE,pmInfo.getState())
                    .set(PM_INFO.CITY,pmInfo.getCity()).set(PM_INFO.PMIP,pmInfo.getPmip()).set(PM_INFO.TOTALCPU,pmInfo.getTotalcpu()).set(PM_INFO.TOTALMEM,pmInfo.getTotalmem())
                    .set(PM_INFO.TOTALBAND,pmInfo.getTotalband()).set(PM_INFO.TOTALDISK,pmInfo.getTotaldisk()).set(PM_INFO.USEDCPU,pmInfo.getUsedcpu()).set(PM_INFO.USEDMEM,pmInfo.getUsedmem())
                    .set(PM_INFO.USEDBAND,pmInfo.getUsedband()).set(PM_INFO.USEDDISK,pmInfo.getUseddisk()).set(PM_INFO.NVMS,pmInfo.getNvms()).set(PM_INFO.TIMESTAMP,pmInfo.getTimestamp())
                    .where(PM_INFO.PMID.eq(id)).execute();
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
    public Boolean deletePMInfo(String id) {
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

            dslContext.delete(PM_INFO).where(PM_INFO.PMID.eq(id)).execute();
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
