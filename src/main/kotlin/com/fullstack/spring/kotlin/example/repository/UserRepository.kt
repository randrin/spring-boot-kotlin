package com.fullstack.spring.kotlin.example.repository

import com.fullstack.spring.kotlin.example.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Integer> {
    fun findByName(name: String): User
}