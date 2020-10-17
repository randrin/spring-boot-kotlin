package com.fullstack.spring.kotlin.example.controller

import com.fullstack.spring.kotlin.example.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UserController {

    @GetMapping("/getUser")
    fun getUser() = User(1, "Nzeukang Nimpa Randrin", 2000.0)

    @GetMapping("/listUsers")
    fun listUsers(): List<User> {
        val users = listOf(User(1, "Nzeukang Nimpa Randrin", 2000.0), User(2, "Takou Tsapmene Vanessa", 4500.0))
        return users
    }
}