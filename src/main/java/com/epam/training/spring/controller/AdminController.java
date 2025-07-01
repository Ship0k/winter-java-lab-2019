package com.epam.training.spring.controller;

import com.epam.training.spring.entity.NewSpectacle;
import com.epam.training.spring.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/new-spectacle")
    public String createSpectacle(Model model) {
        model.addAttribute("genres", adminService.getGenres());
        model.addAttribute("directors", adminService.getDirectors());
        model.addAttribute("actors", adminService.getActors());
        model.addAttribute("amplois", adminService.getAmplios());
        return "newSpectacle";
    }

    @PostMapping("/new-spectacle")
    public String addSpectacle(@ModelAttribute("newSpectacle") NewSpectacle newSpectacle) {
        adminService.addSpectacle(newSpectacle);
        return "redirect:/user/spectacles";
    }

    @ExceptionHandler(DuplicateKeyException.class)
    public ModelAndView handleIOException(DuplicateKeyException exception) {
        return new ModelAndView("exception");
    }
}