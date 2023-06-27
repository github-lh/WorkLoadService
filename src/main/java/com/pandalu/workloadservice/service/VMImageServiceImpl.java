package com.pandalu.workloadservice.service;

import com.pandalu.workloadservice.db.tables.pojos.Vmimages;
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

import static com.pandalu.workloadservice.db.Tables.*;

@Service("VMImageService")
public class VMImageServiceImpl implements VMImageService{
    @Override
    public List<Vmimages> getVMImageList() {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        List<Vmimages> list=new ArrayList<Vmimages>();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(VMIMAGES).fetch();
            recordResult.forEach(record -> {
                Vmimages vmI=new Vmimages();
                record.into(vmI);
                list.add(vmI);
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
    public Vmimages getVMImage(String id) {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
        Connection conn = null;
        Statement stmt = null;
        final  String USER="root";
        final  String PWD="root";
        Vmimages vmi=new Vmimages();
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("开始连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PWD);
            DSLContext dslContext = DSL.using(conn, SQLDialect.MYSQL);

            Result<Record> recordResult = dslContext.select().from(VMIMAGES).where(VMIMAGES.VMIMAGEID.eq(id)).fetch();
            recordResult.get(0).into(vmi);
            conn.close();

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            return null;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return null;
        }
        return vmi;
    }

    @Override
    public Boolean postVMImage(Vmimages vmImage) {
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
            dslContext.insertInto(VMIMAGES,VMIMAGES.VMIMAGEID,VMIMAGES.IMGSIZE,VMIMAGES.IMGCPU,VMIMAGES.IMGMEM,
                            VMIMAGES.IMGDISK,VMIMAGES.IMGOS,VMIMAGES.NETWORKADAPTER,VMIMAGES.TIMESTAMP)
                    .values(vmImage.getVmimageid(),vmImage.getImgsize(),vmImage.getImgcpu(),vmImage.getImgmem(),
                            vmImage.getImgdisk(),vmImage.getImgos(),vmImage.getNetworkadapter(),vmImage.getTimestamp())
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
    public Boolean putVMImage(String id, Vmimages vmImage) {
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
            dslContext.update(VMIMAGES).set(VMIMAGES.IMGSIZE,vmImage.getImgsize())
                    .set(VMIMAGES.IMGCPU,vmImage.getImgcpu())
                    .set(VMIMAGES.IMGMEM,vmImage.getImgmem())
                    .set(VMIMAGES.IMGDISK,vmImage.getImgdisk())
                    .set(VMIMAGES.IMGOS,vmImage.getImgos())
                    .set(VMIMAGES.NETWORKADAPTER,vmImage.getNetworkadapter())
                    .set(VMIMAGES.TIMESTAMP,vmImage.getTimestamp())
                    .where(VMIMAGES.VMIMAGEID.eq(vmImage.getVmimageid()))
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
    public Boolean deleteVMImage(String id) {
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
            dslContext.delete(VMIMAGES)
                    .where(VMIMAGES.VMIMAGEID.eq(id))
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
