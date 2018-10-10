package org.imperial.settlers.controllers

import junit.framework.Assert.assertNotNull
import org.imperial.settlers.dtos.Enemy
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EnemiesControllersTest {

    val urlEnemies: String = "/enemies"
    val urlCreate: String = "/create"

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun shouldCheckIfUrlForCreatingEnemyIsCorrect() {
        val result = testRestTemplate.postForEntity(urlEnemies + urlCreate, listOf(Enemy("A", 1, "B")), String::class
                .java)

        assertNotNull(result)
        assertEquals(HttpStatus.OK, result.statusCode)
    }

}