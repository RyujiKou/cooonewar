package dev.cooeeu.war.cooone.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "龍の仮想王国　総務省"
        return "index"
    }
}