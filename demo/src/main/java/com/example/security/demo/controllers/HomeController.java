package com.example.security.demo.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return
                "<h1>Page d'accueil</h1><p>Accessible après connexion.</p>";
    }

    @GetMapping("/user/dashboard")
    @ResponseBody
    public String userDashboard() {
        return
                "<h2>Espace utilisateur</h2><p>Accessible aux rôles USER et ADMIN.</p>";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return
                "<h2>Espace administrateur</h2><p>Réservé au rôle ADMIN.</p>";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}