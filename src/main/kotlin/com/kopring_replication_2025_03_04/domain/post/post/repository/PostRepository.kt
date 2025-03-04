package com.kopring_replication_2025_03_04.domain.post.post.repository

import com.kopring_replication_2025_03_04.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>