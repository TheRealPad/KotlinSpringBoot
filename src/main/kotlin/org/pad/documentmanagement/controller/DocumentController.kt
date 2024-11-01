package org.pad.documentmanagement.controller

import org.pad.documentmanagement.domain.Document
import org.pad.documentmanagement.service.DocumentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController(value = "document controller")
class DocumentController {

    @Autowired
    private lateinit var documentService: DocumentService

    @GetMapping("/hello")
    fun getDocxFile(): Document {
        return documentService.helloWorld()
    }

}
