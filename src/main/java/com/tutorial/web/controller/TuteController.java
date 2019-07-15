package com.tutorial.web.controller;

import com.tutorial.web.data.Tutorial;
import com.tutorial.web.service.TutorialRepository;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
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

        model.addAttribute("today", new Date());
        return "index";

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String viewAllTutes(Model modal){


        List<Tutorial> listtut=repository.findAll();
        modal.addAttribute("tutelist",listtut);

        return "viewlist";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("userAttr") Tutorial tut) {

        repository.save(tut);


        return "redirect:list";
    }

    @RequestMapping(value="/edit",method=RequestMethod.GET)
    public String edittute(@RequestParam(value="id", required=true) int id, Model model){

        model.addAttribute("userAttr",repository.findById(id));

        return "form";
    }

    @RequestMapping(value = "/addTut", method = RequestMethod.POST)
    public String addTute(@ModelAttribute("addAttr") Tutorial tut) {
        repository.save(tut);


        return "redirect:add";
    }

   @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addForm(Model modal) {
        modal.addAttribute("addAttr",new Tutorial());
        return "add";
    }

    @RequestMapping(value = "/deleteTut", method = RequestMethod.POST)
    public String delete(HttpServletRequest req, HttpServletResponse resp) {
       int value = Integer.valueOf(req.getParameter("id"));

        repository.deleteTutorialById(value);
        //TuteService.edit(tut);


        return "redirect:list";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteTut(Model model) {

        return "delete";
    }



}
