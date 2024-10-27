package org.pad.documentmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DocumentManagementApplication

fun main(args: Array<String>) {
    runApplication<DocumentManagementApplication>(*args)
}
