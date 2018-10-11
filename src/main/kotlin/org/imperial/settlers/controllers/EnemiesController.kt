package org.imperial.settlers.controllers

import org.imperial.settlers.dtos.Enemy
import org.imperial.settlers.services.EnemiesService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/enemies")
class EnemiesController(val enemiesService: EnemiesService) {

    @PostMapping("/create",
            produces = arrayOf("application/json"),
            consumes = arrayOf("application/json"))
    fun createEnemies(@RequestBody enemies: List<Enemy>) {
        enemiesService.saveEnemies(enemies)
    }

}