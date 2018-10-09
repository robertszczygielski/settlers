package org.imperial.settlers.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/enemies")
class EnemiesController {

    @PostMapping("/create")
    fun createEnemies(@RequestBody enemies: List<String>) {
        println("silly logger ${enemies.size}")
    }

}