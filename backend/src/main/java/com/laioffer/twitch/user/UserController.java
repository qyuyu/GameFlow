package com.laioffer.twitch.user;

import com.laioffer.twitch.model.RegisterBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public void register(@RequestBody RegisterBody body) {
        userService.register(body.username(), body.password(), body.firstName(), body.lastName());
    }
}
