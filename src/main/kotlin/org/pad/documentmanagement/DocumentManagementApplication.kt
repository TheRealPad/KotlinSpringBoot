package org.pad.documentmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
class DocumentManagementApplication

fun main(args: Array<String>) {
    runApplication<DocumentManagementApplication>(*args)
}
