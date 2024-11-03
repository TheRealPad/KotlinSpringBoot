package org.pad.documentmanagement.controller.auth

import org.pad.documentmanagement.service.auth.UserContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController(value = "admin controller")
class AdminController {

    @Autowired
    private lateinit var userContext: UserContext

    @GetMapping("/admin")
    fun isAdmin(): String {
        println(userContext.getCurrentUsername())
        println(userContext.getCurrentUserDetails())
        println(userContext.getCurrentUser())
        return "Welcome, admin! You have access to this restricted endpoint."
    }

}
