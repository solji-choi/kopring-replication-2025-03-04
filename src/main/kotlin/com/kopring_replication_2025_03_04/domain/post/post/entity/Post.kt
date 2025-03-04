package com.kopring_replication_2025_03_04.domain.post.post.entity

import com.kopring_replication_2025_03_04.global.jpa.entity.BaseTime
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Post(
    @Column(length = 100)
    var title: String,

    @Column(columnDefinition = "TEXT")
    var content: String
) : BaseTime()