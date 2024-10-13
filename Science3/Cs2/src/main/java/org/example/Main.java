package org.example;

import org.example.service.AddInformation;
import org.example.service.ChangeInformation;
import org.example.service.CheckInformation;
import org.example.service.DeleteInformation;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        int ch;
        while(true){
            System.out.println("请输入你需要的服务");
            System.out.println("1:查看联系人，2：添加联系人，3：更改联系人，4：删除联系人");
            Scanner scanner=new Scanner(System.in);
            ch=scanner.nextInt();
            switch (ch){
                case 1:new CheckInformation().showInformation();continue;
                case 2:new AddInformation().AddInfo();continue;
                case 3:new ChangeInformation().ChangeInfo();continue;
                case 4:new DeleteInformation().DeleteInfo();
            }
        }

    }
}
