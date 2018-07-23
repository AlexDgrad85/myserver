package ru.alexdgrad.myserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.alexdgrad.myserver.entity.Remind;
import ru.alexdgrad.myserver.service.ReminderService;

import java.util.List;
import java.util.Optional;

@RestController
public class ReminderController {

    @Autowired
    private ReminderService service;
    @RequestMapping(value = "/reminders",method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getALLReminders(){
        return service.getAll();
    }
    @RequestMapping(value = "/reminders/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Optional<Remind> getReminder(@PathVariable("id") long Id){
        return service.getById(Id);
    }
    @RequestMapping(value = "/reminders",method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind){
        return service.save(remind);
    }
    @RequestMapping(value = "/reminder/{id}",method = RequestMethod.POST)
    @ResponseBody
    public void delete(@PathVariable("id") long id){
        service.remove(id);
    }



    /*private Remind createMockRemind() { --заглушка с тестовыми данными
        Remind remind = new Remind();
        remind.setId(Long.valueOf(1));
        remind.setRemaindDate(new Date());
        remind.setTitle("MyFirst Remind");
        return  remind;
    }*/
}
