package com.tutorial.web.controller;

import com.tutorial.web.data.Tutorial;
import com.tutorial.web.service.API_Repository;
import com.tutorial.web.service.TutorialRepository;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;


@Controller
public class TuteController {



    private static Logger log = Logger.getLogger(TuteController.class);
    @Autowired
    private TutorialRepository repository;


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public  String index(Model modal){

        List<Tutorial> listtut=API_Repository.View();
        modal.addAttribute("tutelist",listtut);
        modal.addAttribute("today", new Date());


        return "AdminView/viewlist";

    }

    @RequestMapping(value = "/admin/list", method = RequestMethod.GET)
    public String viewAllTutes(Model modal){


        List<Tutorial> listtut=API_Repository.View();
        modal.addAttribute("tutelist",listtut);
        modal.addAttribute("today", new Date());

        return "AdminView/viewlist";
    }

    @RequestMapping(value = "/admin/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("userAttr") Tutorial tut) {
          repository.save(tut);

        return "redirect:list";
    }

    @RequestMapping(value="/admin/edit",method=RequestMethod.GET)
    public String edittute(@RequestParam(value="id", required=true) int id, Model model){
        model.addAttribute("userAttr",repository.findById(id));
        model.addAttribute("today",new Date());

        return "AdminView/form";
    }

    @RequestMapping(value="/admin/tut",method=RequestMethod.GET)
    public String viewtute(@RequestParam(value="id", required=true) int id, Model model){
        model.addAttribute("tute",repository.findById(id));

        model.addAttribute("today",new Date());
        return "AdminView/tutorial";
    }

    @RequestMapping(value = "/admin/addTut", method = RequestMethod.POST)
    public String addTute(@ModelAttribute("addAttr") Tutorial tut) {
        repository.save(tut);

        return "redirect:/admin/add";
    }

    @RequestMapping(value = "/admin/add", method = RequestMethod.GET)
    public String addForm(Model modal) {
        modal.addAttribute("today",new Date());
        modal.addAttribute("addAttr",new Tutorial());

        return "AdminView/add";
    }

    @RequestMapping(value = "/admin/deleteTut",method=RequestMethod.GET)
    public String delete(@RequestParam(value="id", required=true) int id) {

        API_Repository.delete(id);
        return "redirect:/admin/list";
    }

}
