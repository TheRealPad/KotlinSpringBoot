package org.pad.documentmanagement.domain.error

data class ErrorResponse(
    val status: Int,
    val error: String,
    val message: String,
    val timestamp: Long
)