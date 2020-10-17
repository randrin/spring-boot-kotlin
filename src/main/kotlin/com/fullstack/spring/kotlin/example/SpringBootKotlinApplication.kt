package com.fullstack.spring.kotlin.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinApplication>(*args)
	println("************* First Example with Kotlin *************")
}
