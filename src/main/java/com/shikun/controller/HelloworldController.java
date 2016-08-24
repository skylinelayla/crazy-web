package com.shikun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by SHIKUN on 2016/8/23.
 */
@Controller
@RequestMapping(value = "/helloworld")

public class HelloworldController {
    @RequestMapping(value = {"/index", "/hello"}, method = {RequestMethod.GET})

    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Hello shikun");
        modelAndView.setViewName("index");

        return modelAndView;
    }

    @RequestMapping(value = "detail/{id}", method = {RequestMethod.GET})
    public ModelAndView getDetail(@PathVariable(value = "id") Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.setViewName("detail");
        return modelAndView;
    }

    @RequestMapping(value = "/*", method = {RequestMethod.GET})
    public ModelAndView urlTest() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("urlTest");
        return modelAndView;
    }


}



