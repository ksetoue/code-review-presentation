package com.coderv.presentation.port.controller

import com.coderv.presentation.application.UserApplicationService
import com.coderv.presentation.domain.Customer
import com.coderv.presentation.domain.UserDataDto
import com.coderv.presentation.domain.common.ResourceNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    private val userApplicationService: UserApplicationService
) {
    /***
     *
     * Endpoint para buscar e retornar um usuário
     */
    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): ResponseEntity<Customer> {
        try {
            return ResponseEntity(userApplicationService.getById(id), HttpStatus.OK)
        } catch (e: ResourceNotFoundException) {
            return ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
    
    @PostMapping
    fun createUser(@RequestBody userData: UserDataDto): ResponseEntity<Customer> {
        return ResponseEntity(userApplicationService.createUser(userData), HttpStatus.CREATED)
    }
}