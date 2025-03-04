package com.kopring_replication_2025_03_04.domain.post.post.service

import com.kopring_replication_2025_03_04.domain.post.post.entity.Post
import com.kopring_replication_2025_03_04.domain.post.post.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository
) {
    fun findAll() = postRepository.findAll()

    fun write(title: String, content: String): Post {
        val post = Post(
            title = title,
            content = content
        )
        return postRepository.save(post)
    }

    fun count() = postRepository.count()
}