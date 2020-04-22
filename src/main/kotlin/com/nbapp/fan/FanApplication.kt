package com.nbapp.fan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FanApplication

fun main(args: Array<String>) {
    runApplication<FanApplication>(*args)
}
