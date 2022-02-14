package com.coderv.presentation.application

import com.coderv.presentation.domain.Customer
import com.coderv.presentation.domain.UserRepository
import com.coderv.presentation.domain.common.ResourceNotFoundException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class UserApplicationService(
    private val userRepository: UserRepository
) {
    private val logger = LoggerFactory.getLogger(this::class.java)
    
    fun getById(id: Long): Customer? {
        logger.info("Searching for user: $id")
        return userRepository.findById(id)
            .orElseThrow { ResourceNotFoundException("Link") }
    }
}