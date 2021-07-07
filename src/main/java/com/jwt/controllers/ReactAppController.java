package com.jwt.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class containers a controller that will route any mapping 
 * not already defined in Spring to React's router.
 * So, if Spring does not have the mapping for a url,
 * then React will take care of that routing.
 * Spring routing takes priority over Reacts.
 */
@Controller
public class ReactAppController {

	//holy regex
    @RequestMapping(value = { "/", "/{x:[\\w\\-]+}", "/{x:^(?!api$).*$}/**/{y:[\\w\\-]+}" })
    public String getIndex(HttpServletRequest request) {
        return "/index.html";
    }

}