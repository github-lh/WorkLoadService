package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.VmInfo;
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

import static com.pandalu.workloadservice.db.Tables.VM_INFO;

@Service("VMInfoService")
public class VMInfoServiceImpl implements VMInfoService {
    @Override
    public List<VmInfo> getVMInfoList() {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        List<VmInfo> list=new ArrayList<VmInfo>();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(VM_INFO).fetch();
            recordResult.forEach(record -> {
                VmInfo i=new VmInfo();
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
    public VmInfo getVMInfo(String id) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        VmInfo vmInfo=new VmInfo();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(VM_INFO).where(VM_INFO.VMID.eq(id)).fetch();
            recordResult.forEach(record -> {
                record.into(vmInfo);
            });
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return null;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return null;
        }
        return vmInfo;
    }

    @Override
    public Boolean postVMInfo(VmInfo vmInfo) {
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

            dslContext.insertInto(VM_INFO,VM_INFO.UUID,VM_INFO.VMID,VM_INFO.PMID,VM_INFO.VMIMAGEID,VM_INFO.VMNAME,VM_INFO.STATUS,
                                  VM_INFO.TOTALCPU,VM_INFO.TOTALMEM,VM_INFO.TOTALDISK,VM_INFO.TOTALBAND,VM_INFO.USEDCPU,
                                  VM_INFO.USEDMEM,VM_INFO.USEDDISK,VM_INFO.USEDBAND,VM_INFO.TIMESTAMP)
                    .values(vmInfo.getUuid(),vmInfo.getVmid(),vmInfo.getPmid(),vmInfo.getVmimageid(),vmInfo.getVmname(),vmInfo.getStatus(),
                            vmInfo.getTotalcpu(),vmInfo.getTotalmem(),vmInfo.getTotaldisk(),vmInfo.getTotalband(),vmInfo.getUsedcpu(),
                            vmInfo.getUsedmem(),vmInfo.getUseddisk(),vmInfo.getUsedband(),vmInfo.getTimestamp())
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
    public Boolean putVMInfo(String id, VmInfo vmInfo) {
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

            dslContext.update(VM_INFO)
                    .set(VM_INFO.UUID,vmInfo.getUuid())
                    .set(VM_INFO.VMID,vmInfo.getVmid())
                    .set(VM_INFO.PMID,vmInfo.getPmid())
                    .set(VM_INFO.VMIMAGEID,vmInfo.getVmimageid())
                    .set(VM_INFO.VMNAME,vmInfo.getVmname())
                    .set(VM_INFO.STATUS,vmInfo.getStatus())
                    .set(VM_INFO.TOTALCPU,vmInfo.getTotalcpu())
                    .set(VM_INFO.TOTALMEM,vmInfo.getTotalmem())
                    .set(VM_INFO.TOTALDISK,vmInfo.getTotaldisk())
                    .set(VM_INFO.TOTALBAND,vmInfo.getTotalband())
                    .set(VM_INFO.USEDCPU,vmInfo.getUsedcpu())
                    .set(VM_INFO.USEDMEM,vmInfo.getUsedmem())
                    .set(VM_INFO.USEDDISK,vmInfo.getUseddisk())
                    .set(VM_INFO.USEDBAND,vmInfo.getUsedband())
                    .set(VM_INFO.TIMESTAMP,vmInfo.getTimestamp())
                    .where(VM_INFO.VMID.eq(id))
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
    public Boolean deleteVMInfo(String id) {
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

            dslContext.delete(VM_INFO)
                    .where(VM_INFO.VMID.eq(id))
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

}
