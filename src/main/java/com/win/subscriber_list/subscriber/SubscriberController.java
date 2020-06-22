package com.win.subscriber_list.subscriber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Designates this class as a Controller
@Controller
public class SubscriberController {
    // Tells our application what template to return at a specific URL
    @GetMapping
    public String index(Subscriber subscriber){       
        return "subscriber/index";
    }
}