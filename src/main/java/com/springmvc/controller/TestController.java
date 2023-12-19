package com.springmvc.controller;

import com.springmvc.domain.DataBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


    @Controller
    public class TestController {
        @GetMapping("/test1")
        public String test1(DataBean bean, Model model) {

            String [] check_list = {"data1", "data3"};
            bean.setA3(check_list);
            bean.setA4(check_list);
            bean.setA5(check_list);

            return "test1";
        }
    }
