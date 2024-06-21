package com.example.supergametest.SuperGameTest.PlayerCreation;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playerCreation/")
public class PlayerCreationController {
    @GetMapping
    public String getPlayerCreationInfo() {
        return PlayerCreationInfo.getJSON();
    }

    @PostMapping
    public ResponseEntity<String> postNewPlayer(@RequestBody String json) {
        try {
            Player player = Player.fromJSON(json);
            return ResponseEntity.ok().body(player.toJSON());
        } catch (JsonSyntaxException e) {
            return ResponseEntity.badRequest().body(e.toString());
        }
    }
}
