package com.github.kuripasanda.pathfinderlib.api.model

import kotlinx.serialization.Serializable

/**
 * パスノードのIDを表すデータクラス。
 * このクラスは、エリアIDとノードIDを保持します。
 *
 * @param areaId ノードが属するエリアの一意の識別子。
 * @param nodeId ノードの一意の識別子。
 */
@Serializable
data class PathNodeId(
    var areaId: String,
    var nodeId: String,
) {

    fun isMatch(areaId: String, nodeId: String): Boolean {
        return this.areaId == areaId && this.nodeId == nodeId
    }

    fun isMatch(node: PathNode): Boolean {
        return this.areaId == node.areaId && this.nodeId == node.id
    }

}