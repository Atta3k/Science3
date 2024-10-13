package org.example.service;

import org.example.util.GetConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteInformation {
    Connection connection= GetConnect.getConnect();
    public void DeleteInfo ()throws SQLException {
        String query="delete from personaltelephone where id=?";
        System.out.println("请输入要删除联系人的id");
        Scanner scanner=new Scanner(System.in);
        int id=scanner.nextInt();
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.execute();
        System.out.println("成功删除联系人");
    }
}
