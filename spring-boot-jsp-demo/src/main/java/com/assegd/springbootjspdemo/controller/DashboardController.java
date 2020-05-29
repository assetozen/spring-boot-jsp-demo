package com.assegd.springbootjspdemo.controller;

import com.assegd.springbootjspdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class DashboardController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView model = new ModelAndView();
        model.setViewName("welcome");
        return model;
    }


    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {

        ModelAndView model = new ModelAndView();
        model.addObject("users", getUsers());
        model.setViewName("dashboard");
        return model;
    }

    private List getUsers() {
        User user = new User();
        user.setName("Assegd Assefa");
        user.setAddress("Utbremer Ring 999, Bremen");
        user.setEmail("aa@aa.com");

        User user1 = new User();
        user1.setName("Sara Moges");
        user1.setAddress("Utbremer Ring 888, Hamburg");
        user1.setEmail("sm@sm.com");

        User user2 = new User();
        user2.setName("Noah Assegd");
        user2.setAddress("Utbremer Ring 777, Hannover");
        user2.setEmail("na@na.com");

        User user3 = new User();
        user3.setName("Noah_2 Assegd");
        user3.setAddress("Utbremer Ring 555, Hannover");
        user3.setEmail("na_2@na_2.com");

        return Arrays.asList(user, user1, user2, user3);
    }
}
