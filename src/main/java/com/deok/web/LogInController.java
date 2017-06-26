package com.deok.web;

import com.deok.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class LogInController {

    @Inject
    AuthService authService;

 
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Locale locale, Model model) {
        return "login";
    }
 
 @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
 public String loginCheck(@RequestParam String username, @RequestParam String password, HttpSession session) {


  if (authService.isUserCheck(username, password)) {
   session.setAttribute("id",       username);
   session.setAttribute("username", username);
   return "home";
  }
  return "login";
 }
}