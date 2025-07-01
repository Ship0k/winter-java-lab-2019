package com.epam.training.spring.controller;

import com.epam.training.spring.service.ActorService;
import com.epam.training.spring.service.SpectacleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SpectacleController {
    @Autowired
    private SpectacleService spectacleService;

    @Autowired
    private ActorService actorService;

    @GetMapping("/spectacles")
    public String getAllSpectacle(Model model) {
        model.addAttribute("spectacles", spectacleService.getAll());
        return "spectacles";
    }

    @GetMapping("/actors/{id}/{play}")
    public String updateUser(@PathVariable int id, Model model, @PathVariable String play) {
        model.addAttribute("actors", actorService.getActorsOfTheSpectacle(id));
        model.addAttribute("playName", play);
        return "actorOfSpectacle";
    }
}