package org.pad.documentmanagement.repository

import org.pad.documentmanagement.domain.Document
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DocumentRepository : JpaRepository<Document, UUID> {

    @Query("select p from Document p where p.title = :name")
    fun findByName(name: String): List<Document>
}
