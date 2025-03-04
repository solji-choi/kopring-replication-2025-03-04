package com.kopring_replication_2025_03_04.global.initData

import com.kopring_replication_2025_03_04.domain.post.post.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.transaction.annotation.Transactional

@Configuration
class BaseInitData(
    private val postService: PostService
) {
    @Autowired
    @Lazy
    private lateinit var self: BaseInitData

    @Bean
    fun baseInitDataApplicationRunner(): ApplicationRunner {
        return ApplicationRunner {
            self.work1()
            self.work2()
        }
    }

    @Transactional
    fun work1() {
        if (postService.count() > 0) return

        postService.write("title 1", "content 1")
        postService.write("title 2", "content 2")
    }

    @Transactional(readOnly = true)
    fun work2() {
        postService.findAll()
            .forEach { println(it.id) }
    }
}