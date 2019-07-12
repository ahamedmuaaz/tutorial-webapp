package com.tutorial.web.controller;

import com.tutorial.web.data.Tutorial;
import com.tutorial.web.service.TutorialRepository;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class TuteController {

    private static Logger log = Logger.getLogger(TuteController.class);
    @Autowired
    private TutorialRepository repository;

    //@Resource(name="TutorialService")
    //private TutorialService TuteService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String index(Model model){

        repository.save(new Tutorial(1,"Java","Muaaz","it is a java tutorial for beginners","https://www.tutorialspoint.com/java/"));

        return "index";

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String viewAllTutes(Model modal){


        List<Tutorial> listtut=repository.findAll();
        modal.addAttribute("tutelist",listtut);

        return "viewlist";
    }





}
