package org.example.generator.controller;

import org.example.generator.domain.Personaltelephone;
import org.example.generator.results.Result;
import org.example.generator.service.PersonaltelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("mail")
public class MailListController {
    @Autowired
    PersonaltelephoneService personaltelephoneService;

    @RequestMapping("show")
    public Result show(){
        Result result=personaltelephoneService.showInfo();
        return result;
    }
    @PostMapping("add")
    public Result add(@RequestBody Personaltelephone personaltelephone){
        Result result=personaltelephoneService.addInfo(personaltelephone);
        return result;
    }
    @PostMapping ("delete")
    public Result delete(@RequestParam("id") int id){
        Result result=personaltelephoneService.deleteInfo(id);
        return result;
    }
    @PostMapping("change")
    public Result update(@RequestBody Personaltelephone personaltelephone){
        Result result=personaltelephoneService.ChangeInfo(personaltelephone);
        return result;
    }


}
