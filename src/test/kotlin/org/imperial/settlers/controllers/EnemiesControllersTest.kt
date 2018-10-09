package org.imperial.settlers.controllers

import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EnemiesControllersTest {

    val urlEnemies: String = "/enemies"
    val urlCreate: String = "/create"

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun shouldCheckIfUrlForCreatingEnemyIsCorrect() {
        val result = testRestTemplate.getForEntity(urlEnemies + urlCreate, String::class.java)

        assertNotNull(result)
    }
}