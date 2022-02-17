package com.coderv.presentation.domain

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : CrudRepository<Customer, Long> {
    @Query("""
        SELECT
            *
        FROM customer c
        WHERE c.first_name like :firstName
            AND c.last_name like :lastName
    """)
    fun findByFirstNameAndLastName(firstName: String, lastName: String): Optional<Customer>
}