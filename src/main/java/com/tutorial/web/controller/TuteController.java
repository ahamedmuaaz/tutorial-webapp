package com.tutorial.web.controller;

import com.tutorial.web.service.TutorialService;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;




@Controller
public class TuteController {


    private static Logger log = Logger.getLogger(TuteController.class);

    @Resource(name="TutorialService")
    private TutorialService TuteService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String index(Model model){
        return "index";

    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String viewAllTutes(Model modal){
        List tutelist= TuteService.getAll();
        modal.addAttribute("tutelist",tutelist);
        return "list";
    }

    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String save(){
        return "form";
    }

    @RequestMapping(value="/edit",method=RequestMethod.GET)
    public String edittute(@RequestParam(value="id", required=true) int id, Model model){
        model.addAttribute("userAttr",TuteService.findTuteId(id));
        return "form";
    }



}
