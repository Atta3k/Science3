package org.example.generator.service;

import org.example.generator.domain.Personaltelephone;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.generator.domain.Personaltelephone;
import org.springframework.stereotype.Service;

/**
* @author dell
* @description 针对表【personaltelephone】的数据库操作Service
* @createDate 2024-10-12 13:01:24
*/
@Service
public interface PersonaltelephoneService extends IService<Personaltelephone> {



    void showInfo();

    void addInfo();

    void changeInfo();

    void deleteInfo();
}
