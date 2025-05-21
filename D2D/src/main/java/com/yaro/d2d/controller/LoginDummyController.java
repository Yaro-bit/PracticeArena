package com.yaro.d2d.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginDummyController {

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {

        if (email.equals("admin@admin.ad") && password.equals("admin")) {
            session.setAttribute("user", email);
            return "redirect:/dashboard.html"; // <-Success: forward to dashboard 
        }

        model.addAttribute("error", "Invalid credentials");
        return "redirect:/login.html"; // Error: back to Login link
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/login.html";
    }
}
