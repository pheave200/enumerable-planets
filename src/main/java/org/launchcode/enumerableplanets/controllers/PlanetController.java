package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.launchcode.enumerableplanets.Planets;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model) {
        model.addAttribute("displayName", Planets.values());
        return "index";
    }
}
