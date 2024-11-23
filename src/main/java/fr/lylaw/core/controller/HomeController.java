package fr.lylaw.core.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.List;

/**
 * @author Snowtyy
 **/
@Controller("/")
public class HomeController {
    
    @Get("/helloworld")
    public List<String> helloWorld() {
        
        return List.of("null");
    }
    
}
