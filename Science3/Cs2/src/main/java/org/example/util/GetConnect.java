package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnect {
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");			//加载mysql驱动
            String str="jdbc:mysql://localhost:3306/softwarescience3";				//目标数据库地址
            String name="root";
            String password="520430";
            Connection con= DriverManager.getConnection(str,name,password);		//connection连接，生成连接对象
            return con;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
