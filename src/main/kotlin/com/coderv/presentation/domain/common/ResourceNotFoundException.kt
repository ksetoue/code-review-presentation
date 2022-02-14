package com.coderv.presentation.domain.common

class ResourceNotFoundException(entity: String, code: String = "resource-not-found")
    : BusinessException("$entity not found", code)