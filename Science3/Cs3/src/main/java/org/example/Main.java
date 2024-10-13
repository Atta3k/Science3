package org.example;

import jakarta.annotation.PostConstruct;
import org.example.generator.controller.MailListController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {
    @Autowired
    private MailListController mailListController;
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
    @PostConstruct
    public void run(){
        int ch;
        while(true){
            System.out.println("请输入你需要的服务");
            System.out.println("1:查看联系人，2：添加联系人，3：更改联系人，4：删除联系人");
            Scanner scanner=new Scanner(System.in);
            ch=scanner.nextInt();
            mailListController.MailListControl(ch);
        }
    }
}
