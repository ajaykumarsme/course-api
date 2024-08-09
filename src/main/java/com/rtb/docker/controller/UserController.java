package com.rtb.docker.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

   //@Autowired
   // private UserService userService;

    @GetMapping
    public String apiStatusI() {
        return "course-api is working fine";
    }
}
