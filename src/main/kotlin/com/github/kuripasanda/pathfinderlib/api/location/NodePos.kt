package com.github.kuripasanda.pathfinderlib.api.location

import kotlinx.serialization.Serializable

@Serializable
data class NodePos(
    var x: Int,
    var y: Int,
    var z: Int,
)