package com.kopring_replication_2025_03_04.domain.post.post.controller

import com.kopring_replication_2025_03_04.domain.post.post.entity.Post
import com.kopring_replication_2025_03_04.domain.post.post.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/posts")
class ApiV1PostController(
    private val postService: PostService
) {
    @GetMapping
    fun getItems() = postService.findAll()

    @GetMapping("/write")
    fun write(
        title: String,
        content: String
    ): Post {
        return postService.write(title, content)
    }
}