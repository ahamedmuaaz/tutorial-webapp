package com.tutorial.web.controller;

import com.tutorial.web.data.Tutorial;
import com.tutorial.web.service.API_Repository;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class StudentController {

    private static Logger log = Logger.getLogger(TuteController.class);

    @RequestMapping(value ="/student", method = RequestMethod.GET)
    public String index(Model modal) {
        List<Tutorial> listtut = API_Repository.View();
        modal.addAttribute("tutelist", listtut);
        modal.addAttribute("today", new Date());

        return "StudentView/viewlist";

    }

    @RequestMapping(value = "/student/view", method = RequestMethod.GET)
    public String viewtute(@RequestParam(value = "id", required = true) int id, Model model) {
        model.addAttribute("tute", API_Repository.findOneById(id));

        model.addAttribute("today", new Date());
        return "StudentView/tutorial";
    }

    @RequestMapping(value = "/student/about-us", method = RequestMethod.GET)
    public String viewtute(Model model) {
        model.addAttribute("today", new Date());
        return "StudentView/aboutUs";
    }

    @RequestMapping(value = "/student/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("today", new Date());
        return "StudentView/home";
    }


}