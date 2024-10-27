package org.pad.documentmanagement.service

import org.pad.documentmanagement.domain.Document
import org.pad.documentmanagement.repository.DocumentRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class DocumentService {

    @Autowired
    private lateinit var documentRepository: DocumentRepository

    fun list(): List<Document> {
        return documentRepository.findByName("padou")
    }

    fun helloWorld(): String {
        return "Hello World"
    }
}
