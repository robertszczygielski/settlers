package org.imperial.settlers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SettlersApplication

fun main(args: Array<String>) {
    runApplication<SettlersApplication>(*args)
}
