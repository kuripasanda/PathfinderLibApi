package com.github.kuripasanda.pathfinderlib.api.location

import kotlinx.serialization.Serializable

@JvmRecord
@Serializable
data class Identifier(
    val namespace: String,
    val path: String
)