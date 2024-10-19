package com.goudurixx.composemp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform