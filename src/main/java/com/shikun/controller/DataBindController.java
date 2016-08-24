package com.shikun.controller;

import com.shikun.dao.AccountModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
/**
 * Created by SHIKUN on 2016/8/23.
 */

@Controller
@RequestMapping(value = "/databind")

public class DataBindController {

    @RequestMapping(value = "/parambind", method = {RequestMethod.GET})
    public ModelAndView parambind() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("parambind");
        return modelAndView;
    }

    @RequestMapping(value = "/parambind", method = {RequestMethod.POST})
    public ModelAndView parambind(HttpServletRequest request, @RequestParam("urlParam") String urlParam, @RequestParam("formParam")
            String formParam, @RequestParam("formFile") MultipartFile formFile) {


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("urlParam", urlParam);
        modelAndView.addObject("formParam", formParam);
        modelAndView.addObject("formFileName", formFile.getOriginalFilename());

        modelAndView.setViewName("parambindresult");
        return modelAndView;

    }

    @RequestMapping(value="/modelautobind", method = {RequestMethod.GET})
    public String modelAutoBind(HttpServletRequest request, Model model){

        model.addAttribute("accountmodel", new AccountModel());
        return "modelautobind";
    }

    @RequestMapping(value="/modelautobind", method = {RequestMethod.POST})
    public String modelAutoBind(HttpServletRequest request, Model model, AccountModel accountModel){

        model.addAttribute("accountmodel", accountModel);
        return "modelautobindresult";
    }

}

