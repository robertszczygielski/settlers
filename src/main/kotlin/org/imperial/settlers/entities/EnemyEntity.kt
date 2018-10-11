package org.imperial.settlers.entities

import javax.persistence.*

@Entity
@Table(name = "enemy")
data class EnemyEntity(
        @Id
        @GeneratedValue
        @Column(name = "id")
        var id: Long,

        @Column(name = "name")
        var name: String,

        @Column(name = "value")
        var value: Int,

        @Column(name = "resource")
        var resource: String) {

        constructor(): this(0, "", 0, "")
        constructor(name: String, value: Int, resource: String): this(0, name, value, resource)
}