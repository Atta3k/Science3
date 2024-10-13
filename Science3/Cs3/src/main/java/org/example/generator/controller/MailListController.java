package org.example.generator.controller;

import org.example.generator.service.PersonaltelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MailListController {
    @Autowired
    private PersonaltelephoneService personaltelephoneService;

    public void MailListControl(int ch){
        switch (ch){
            case 1:personaltelephoneService.showInfo();break;
            case 2:personaltelephoneService.addInfo();break;
            case 3:personaltelephoneService.changeInfo();break;
            case 4:personaltelephoneService.deleteInfo();break;
        }

    }


}
