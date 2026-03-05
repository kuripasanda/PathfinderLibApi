package com.github.kuripasanda.pathfinderlib.api.fiding

import com.github.kuripasanda.pathfinderlib.api.model.PathNode
import com.github.kuripasanda.pathfinderlib.api.model.PathNodeId

interface AStartPathfinder {

    fun findPath(startId: PathNodeId, goalId: PathNodeId): List<PathNode>

}