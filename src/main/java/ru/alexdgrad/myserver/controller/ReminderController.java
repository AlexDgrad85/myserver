package ru.alexdgrad.myserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.alexdgrad.myserver.entity.Remind;
import ru.alexdgrad.myserver.repository.RemindRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/remaind")
public class ReminderController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(){
        List<Remind> list=remindRepository.findAll();
        return createMockRemind();
    }

    private Remind createMockRemind() {
        Remind remind = new Remind();
        remind.setId(Long.valueOf(1));
        remind.setRemaindDate(new Date());
        remind.setTitle("MyFirst Remind");
        return  remind;
    }
}
