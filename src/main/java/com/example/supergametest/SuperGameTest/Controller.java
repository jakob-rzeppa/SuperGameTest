package com.example.supergametest.SuperGameTest;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/player-creation-infos")
    public String playerCreationInfos() {
        return "hi";
    }
}