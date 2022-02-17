package com.coderv.presentation.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class UserDataDto(
    @JsonProperty("first_name")
    val firstName: String,
    
    @JsonProperty("last_name")
    val lastName: String,
) {
    fun toCustomer(): Customer = Customer(id = null, firstName = firstName, lastName = lastName)
}