package org.imperial.settlers.controllers

import org.imperial.settlers.dtos.Enemy
import org.imperial.settlers.services.EnemiesService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/enemies")
class EnemiesController(val enemiesService: EnemiesService) {

    @PostMapping("/create",
            produces = arrayOf("application/json"),
            consumes = arrayOf("application/json"))
    fun createEnemies(@RequestBody enemies: List<Enemy>) = enemiesService.saveEnemies(enemies)

    @GetMapping("/allEnemies")
    fun getAllEnemies(): List<Enemy> = enemiesService.getEnemies()

}