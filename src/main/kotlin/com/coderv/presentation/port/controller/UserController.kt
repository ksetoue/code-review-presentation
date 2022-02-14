package com.coderv.presentation.port.controller

import com.coderv.presentation.application.UserApplicationService
import com.coderv.presentation.domain.Customer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userApplicationService: UserApplicationService
) {
    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): Customer? {
        return userApplicationService.getById(id)
    }
}