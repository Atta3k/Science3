package org.example.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.example.generator.domain.Personaltelephone;
import org.example.generator.service.PersonaltelephoneService;
import org.example.generator.mapper.PersonaltelephoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.util.Scanner;

/**
* @author dell
* @description 针对表【personaltelephone】的数据库操作Service实现
* @createDate 2024-10-12 13:01:24
*/
@Service
public class PersonaltelephoneServiceImpl extends ServiceImpl<PersonaltelephoneMapper, Personaltelephone>
    implements PersonaltelephoneService{
@Autowired
private PersonaltelephoneMapper personaltelephoneMapper;

    @Override
    public void showInfo() {
        System.out.println(personaltelephoneMapper.selectList(null));
    }

    @Override
    public void addInfo() {
        System.out.println("请输入姓名，手机号，地址");
        Scanner scanner=new Scanner(System.in);
        Personaltelephone personaltelephone = new Personaltelephone();
        personaltelephone.setName(scanner.next());
        personaltelephone.setNumber(scanner.next());
        personaltelephone.setAddress(scanner.next());
        personaltelephoneMapper.insert(personaltelephone);
        System.out.println("成功添加新联系人");
    }

    @Override
    public void changeInfo() {
        Scanner scanner=new Scanner(System.in);
        Personaltelephone personaltelephone=new Personaltelephone();
        System.out.println("请输入你要修改的联系人的id");
        personaltelephone.setId(scanner.nextInt());
        System.out.println("请输入想要修改为的姓名，电话，地址");
        personaltelephone.setName(scanner.next());
        personaltelephone.setNumber(scanner.next());
        personaltelephone.setAddress(scanner.next());
        personaltelephoneMapper.updateById(personaltelephone);
        System.out.println("修改成功");

    }

    @Override
    public void deleteInfo() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除联系人的id");
        personaltelephoneMapper.deleteById(scanner.nextInt());
        System.out.println("成功删除联系人");
    }
}




