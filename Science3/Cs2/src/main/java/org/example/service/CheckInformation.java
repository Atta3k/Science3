package org.example.service;

import org.example.pojo.MailList;
import org.example.util.GetConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CheckInformation {
    Connection connection= GetConnect.getConnect();
    public void showInformation() throws SQLException {
        String query="SELECT * FROM personaltelephone";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(query);
        List<MailList> phones=new ArrayList<>();
        while(resultSet.next()){
            MailList mailList=new MailList();
        String address=resultSet.getString("address");
        String name=resultSet.getString("name") ;
        String number=resultSet.getString("number");
        int id=resultSet.getInt("id");
            mailList.setAddress(address);
            mailList.setName(name);
            mailList.setNumber(number);
            mailList.setId(id);
            System.out.println(mailList);
        }

    }
}
