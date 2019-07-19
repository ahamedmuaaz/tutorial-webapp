package com.tutorial.web.controller;

import com.tutorial.web.data.Tutorial;
import com.tutorial.web.service.API_Repository;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Date;
import java.util.List;


@Controller
public class TuteController {


    private static Logger log = Logger.getLogger(TuteController.class);


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index(Model modal) {

        List<Tutorial> listtut = API_Repository.View();
        modal.addAttribute("tutelist", listtut);
        modal.addAttribute("today", new Date());


        return "AdminView/viewlist";

    }

    @RequestMapping(value = "/admin/list", method = RequestMethod.GET)
    public String viewAllTutes(Model modal) {


        List<Tutorial> listtut = API_Repository.View();
        modal.addAttribute("tutelist", listtut);
        modal.addAttribute("today", new Date());

        return "AdminView/viewlist";
    }

    @RequestMapping(value = "/admin/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("userAttr") Tutorial tut) {
        API_Repository.add(tut);

        return "redirect:list";
    }

    @RequestMapping(value = "/admin/edit", method = RequestMethod.GET)
    public String edittute(@RequestParam(value = "id", required = true) int id, Model model) {

        model.addAttribute("userAttr", API_Repository.findOneById(id));
        model.addAttribute("today", new Date());

        return "AdminView/form";
    }

    @RequestMapping(value = "/admin/tut", method = RequestMethod.GET)
    public String viewtute(@RequestParam(value = "id", required = true) int id, Model model) {

        model.addAttribute("tute", API_Repository.findOneById(id));

        model.addAttribute("today", new Date());
        return "AdminView/tutorial";
    }

    @RequestMapping(value = "/admin/addTut", method = RequestMethod.POST)
    public String addTute(@ModelAttribute("addAttr") Tutorial tut) {

        API_Repository.add(tut);

        return "redirect:/admin/add";
    }

    @RequestMapping(value = "/admin/add", method = RequestMethod.GET)
    public String addForm(Model modal) {
        modal.addAttribute("today", new Date());
        modal.addAttribute("addAttr", new Tutorial());

        return "AdminView/add";
    }

    @RequestMapping(value = "/admin/deleteTut", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "id", required = true) int id) {

        API_Repository.delete(id);
        return "redirect:/admin/list";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model modal) {

        modal.addAttribute("today", new Date());
        return "AdminView/login";

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginCheck(@RequestParam (value = "user")String user,@RequestParam (value = "pass")String pass) {

       if(user.equalsIgnoreCase("admin")&& pass.equalsIgnoreCase("1234")){
        return "redirect:/admin";
       }
        else if(user.equalsIgnoreCase("student")&&pass.equalsIgnoreCase("1234")){

            return "redirect:/student";

        }
        else {

            return "redirect:/";
       }

    }

}
