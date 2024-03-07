package com.itgenius.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class SampleApplication

//@RestController
//@RequestMapping("/")
//
//class HomeController{
//
//	@GetMapping("/hello")
//	fun hello():String{
//		return "Spring 555"
//	}
//}

fun main(args: Array<String>) {
	runApplication<SampleApplication>(*args)
}
