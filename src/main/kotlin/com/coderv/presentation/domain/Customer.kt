package com.coderv.presentation.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.OffsetDateTime

@Table("customer")
data class Customer(
    @Id
    val id: Long?,
    
    val firstName: String,
    
    val lastName: String,
    
    val createdAt: OffsetDateTime = OffsetDateTime.now(),
)