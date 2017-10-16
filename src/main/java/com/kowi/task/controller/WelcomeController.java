package com.kowi.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController extends AbstractController {

    @RequestMapping("/")
    String allCategories(Model model) {
        model.addAttribute("cockBooks", cockBookService.getAll());
        model.addAttribute("programBooks", programBookService.getAll());
        model.addAttribute("esotericBooks", esotericBookService.getAll());
        model.addAttribute("disks", diskService.getAll());
        return "shop";
    }
}
