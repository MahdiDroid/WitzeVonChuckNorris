package com.mahdidroid.witze.controller;


import com.mahdidroid.witze.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Joke {


    private JokeService jokeService;
    @Autowired
    public Joke(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping("/")
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chuckNorris";

    }
}
