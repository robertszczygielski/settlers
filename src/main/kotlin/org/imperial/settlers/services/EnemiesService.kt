package org.imperial.settlers.services

import org.imperial.settlers.dtos.Enemy
import org.imperial.settlers.entities.EnemyEntity
import org.imperial.settlers.repository.EnemiesRepository
import org.springframework.stereotype.Service

@Service
class EnemiesService(val enemyRepository: EnemiesRepository) {

    fun saveEnemies(enemies: List<Enemy>) {
        for (enemy in enemies) {
            val e = EnemyEntity(enemy.name, enemy.value, enemy.resource)
            enemyRepository.save(e)
        }
    }
}