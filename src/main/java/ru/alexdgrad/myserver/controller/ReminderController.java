package ru.alexdgrad.myserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/remaind")
public class ReminderController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public  String getReminder(ModelMap model){
        return "Hello World";
    }
}
