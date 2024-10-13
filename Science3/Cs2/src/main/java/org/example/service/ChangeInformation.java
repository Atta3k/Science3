package org.example.service;

import org.example.pojo.MailList;
import org.example.util.GetConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ChangeInformation {
    Connection connection= GetConnect.getConnect();
    public void ChangeInfo()throws SQLException {
        String query="update personaltelephone set name=?,number=?,address=? where id=?";
        Scanner scanner=new Scanner(System.in);
        MailList mailList=new MailList();
        System.out.println("请输入你要修改的联系人的id");
        mailList.setId(scanner.nextInt());
        System.out.println("请输入想要修改为的姓名，电话，地址");
        mailList.setName(scanner.next());
        mailList.setNumber(scanner.next());
        mailList.setAddress(scanner.next());
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,mailList.name);
        preparedStatement.setString(2,mailList.number);
        preparedStatement.setString(3,mailList.address);
        preparedStatement.setInt(4,mailList.id);
        preparedStatement.execute();
        System.out.println("修改成功");
    }
}
