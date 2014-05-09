package com.loia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/resourceb")
public class MyController {

    @RequestMapping(method = RequestMethod.GET)
    public String getResourceB() {
        return "Resource B";
    }
}
