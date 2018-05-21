package com.jk.controller.gzw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/GzwController")
public class GzwController {

    @RequestMapping("/getInfoAll")
    @ResponseBody
    public Map<String, Object> getInfoAll(){
        return null;
    }
}
