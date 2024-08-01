package dio_RestAPI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyfirstController {

    @GetMapping
    public String welcomeController(){
        return "Welcome to Brazil by my first Controller";
    }

}
