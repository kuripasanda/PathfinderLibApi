package com.github.kuripasanda.pathfinderlib.api.model

import com.github.kuripasanda.pathfinderlib.api.location.Identifier

/**
 * [PathNode]の集合を表すクラス。
 *
 * @param areaId エリアの一意の識別子。
 * @param world エリアが存在するワールドの名前。
 * @param nodes エリア内のノードのリスト。
 */
data class PathArea(
    var areaId: String,
    var world: Identifier,
    var nodes: MutableList<PathNode>
)