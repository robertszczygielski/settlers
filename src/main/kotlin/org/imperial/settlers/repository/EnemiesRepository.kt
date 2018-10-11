package org.imperial.settlers.repository

import org.imperial.settlers.entities.EnemyEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EnemiesRepository: CrudRepository<EnemyEntity, Long>