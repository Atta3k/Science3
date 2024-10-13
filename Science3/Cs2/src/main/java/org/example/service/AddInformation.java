package org.example.service;

import org.example.pojo.MailList;
import org.example.util.GetConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddInformation {
    Connection connection= GetConnect.getConnect();
    public void AddInfo()throws SQLException {
        String query="insert into personaltelephone set name=?,number=?,address=?";
        System.out.println("请输入姓名，手机号，地址");
        Scanner scanner=new Scanner(System.in);
        MailList mailList=new MailList();
        mailList.setName(scanner.next());
        mailList.setNumber(scanner.next());
        mailList.setAddress(scanner.next());
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,mailList.name);
        preparedStatement.setString(2,mailList.number);
        preparedStatement.setString(3,mailList.address);
        preparedStatement.execute();
        System.out.println("成功添加新联系人");

    }
}
