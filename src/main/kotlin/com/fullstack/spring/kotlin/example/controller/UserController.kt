package com.fullstack.spring.kotlin.example.controller

import com.fullstack.spring.kotlin.example.model.User
import com.fullstack.spring.kotlin.example.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class UserController {

    @Autowired
    lateinit var userRepository: UserRepository;

    @PostMapping("/saveUser")
    fun saveUser(@RequestBody user: User): String {
        userRepository.save(user);
        return "User saved successfully."
    }

    @GetMapping("/getUser/{name}")
    fun getUser(@PathVariable name: String): User {
        return userRepository.findByName(name);
    }

    @GetMapping("/getUsers")
    fun getUsers(): List<User> {
        return userRepository.findAll();
    }

    @DeleteMapping("/deleteUser/{id}")
    fun deleteUser(@PathVariable id: Integer): String {
        userRepository.deleteById(id);
        return "User deleted successfully."
    }
}