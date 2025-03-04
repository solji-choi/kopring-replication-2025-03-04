package com.kopring_replication_2025_03_04

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class KopringReplication20250304Application

fun main(args: Array<String>) {
	runApplication<KopringReplication20250304Application>(*args)
}
