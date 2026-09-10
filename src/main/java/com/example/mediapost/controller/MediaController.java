package com.example.mediapost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MediaController {

    // Vises når man går ind på /create-post i browseren (GET-request)
    @GetMapping("/create-post")
    public String createPost() {
        return "create-post"; // finder templates/create-post.html
    }

    // Køres når formularen sendes (POST-request via submit-knappen)
    @PostMapping("/create-post")
    public String getData(@RequestParam String title,
                          @RequestParam String content,
                          @RequestParam String date,
                          @RequestParam String visibility) {

        // Her printer vi bare dataen i konsollen, så du kan se det virker
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Date: " + date);
        System.out.println("Visibility: " + visibility);

        return "create-post"; // viser siden igen bagefter
    }
}