package org.example.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.generator.domain.Personaltelephone;
import org.example.generator.mapper.PersonaltelephoneMapper;
import org.example.generator.results.Result;
import org.example.generator.service.PersonaltelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public Result showInfo() {
        List<Personaltelephone> personaltelephones=personaltelephoneMapper.selectList(null);
        return Result.ok(personaltelephones);
    }

    @Override
    public Result addInfo(Personaltelephone personaltelephone) {
        personaltelephoneMapper.insert(personaltelephone);
        return Result.ok(null);
    }

    @Override
    public Result deleteInfo(int id) {
        personaltelephoneMapper.deleteById(id);
        return Result.ok(null);
    }

    @Override
    public Result ChangeInfo(Personaltelephone personaltelephone) {
        personaltelephoneMapper.updateById(personaltelephone);
        return Result.ok(null);
    }
}




