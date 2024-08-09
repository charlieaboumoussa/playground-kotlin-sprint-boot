package com.playground.kotlinspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinspringbootApplication

fun main(args: Array<String>) {
	runApplication<KotlinspringbootApplication>(*args)
}
