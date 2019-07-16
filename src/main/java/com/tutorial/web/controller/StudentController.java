package com.tutorial.web.controller;

import com.tutorial.web.data.Tutorial;
import com.tutorial.web.service.TutorialRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private TutorialRepository repository;

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public  String index(Model modal){
        List<Tutorial> listtut=repository.findAll();
        modal.addAttribute("tutelist",listtut);
        modal.addAttribute("today", new Date());

        return "StudentView/viewlist";

    }

    @RequestMapping(value = "/client/view", method = RequestMethod.GET)
    public String viewtute(@RequestParam(value="id", required=true) int id, Model model){
        model.addAttribute("tute",repository.findById(id));

        model.addAttribute("today",new Date());
        return "StudentView/tutorial";
    }


}