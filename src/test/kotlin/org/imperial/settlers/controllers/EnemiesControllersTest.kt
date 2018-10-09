package org.imperial.settlers.controllers

import junit.framework.Assert.assertNotNull
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
        val result = testRestTemplate.postForEntity(urlEnemies + urlCreate, null, String::class.java,
                emptyList<Objects>())

        assertNotNull(result)
        assertEquals(HttpStatus.OK, result.statusCode)
    }
}