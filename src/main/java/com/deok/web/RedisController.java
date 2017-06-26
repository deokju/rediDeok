package com.deok.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class RedisController {

    @RequestMapping({ "/session", "/stats" })
    public String showSession(HttpSession session, Model model) {
        if (session.getAttribute("id") == null) {
            return "redirect:/login";
        }

        model.addAttribute("sessionId",     session.getId());
        model.addAttribute("sessionNew",    session.isNew());
        model.addAttribute("name", 		    session.getAttribute("username"));
        return "session";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpSession session, Model model) {
        System.out.println(session.getAttribute("id"));
        System.out.println(session.getAttribute("username"));
        if (session.getAttribute("id") == null)
            return "redirect:/Login";
        return "home";
    }
}
