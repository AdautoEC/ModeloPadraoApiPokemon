package com.adauto.shared_domain.common

open class ServiceErrorModel(
    var httpCode: Int = 0,
    var throwable: Throwable? = null
)