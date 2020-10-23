package com.fullstack.spring.kotlin.example.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class User (
        @Id
        @GeneratedValue
        val id: Int = 0,
        val name: String = "",
        val salary: Double = 0.0,
        val profession: String = "",
        val department: String = ""
)