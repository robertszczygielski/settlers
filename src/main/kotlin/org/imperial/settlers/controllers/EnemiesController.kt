package org.imperial.settlers.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/enemies")
class EnemiesController {

    @PostMapping()
    fun createEnemies() {

    }

}