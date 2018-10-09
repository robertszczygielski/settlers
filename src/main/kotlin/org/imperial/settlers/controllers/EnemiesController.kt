package org.imperial.settlers.controllers

import org.imperial.settlers.dtos.Enemy
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/enemies")
class EnemiesController {

    @PostMapping("/create",
            produces = arrayOf("application/json"),
            consumes = arrayOf("application/json"))
    fun createEnemies(@RequestBody enemies: List<Enemy>) {
        println("silly logger ${enemies.size}")
    }

}