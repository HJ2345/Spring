package kr.co.sboard.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "/index"})
    public String index(Authentication auth){

        if (auth == null ){
            //로그인을 성공 했을 때
            return "forward:/article/list";
        }
        return "/index";
    }

}
