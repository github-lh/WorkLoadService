package com.pandalu.workloadservice;
import java.sql.*;
public class MysqlHelper {
    private static volatile MysqlHelper mysqlHelper;

    private MysqlHelper() {
    }
    public static MysqlHelper Instance() {
        // Double-Check idiom
        if (mysqlHelper == null) {
            synchronized (MysqlHelper.class) {       // 1
                // 只需在第一次创建实例时才同步
                if (mysqlHelper == null) {       // 2
                    mysqlHelper = new MysqlHelper();      // 3
                }
            }
        }
        return mysqlHelper;

    }
    private String DB_URL = "jdbc:mysql://127.0.0.1:3307/comp_net_fusion?useSSL=false";
    private  Connection conn = null;
    private  Statement stmt = null;
    private  final  String USER="root";
    private  final  String PWD="root";
    private  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";


}
