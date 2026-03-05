package com.github.kuripasanda.pathfinderlib.api.model

import com.github.kuripasanda.pathfinderlib.api.location.NodePos
import kotlin.properties.Delegates

/**
 * パスノードを表すデータクラス。
 * このクラスは、ノードのID、位置、および接続されているノードのIDのリストを保持します。
 * ※
 *
 * @param id_ ノードの一意の識別子。
 * @param areaId_ ノードが属するエリアのID。
 * @param pos ノードの位置を表すBlockPosオブジェクト。
 * @param radius ノードの半径。ノードの中心からこの半径内にいるエンティティは、このノードに接続されているとみなされます。
 * @param connectedNodes このノードに接続されている他のノードのIDのリスト。
 */
class PathNode(
    id_: String,
    areaId_: String,
    var pos: NodePos,
    var radius: Int,
    var connectedNodes: MutableList<PathNodeId>,
) {

    var id: String by Delegates.observable(id_) { property, oldValue, newValue -> nodeId.nodeId = newValue }
    var areaId: String by Delegates.observable(areaId_) { property, oldValue, newValue -> nodeId.areaId = newValue }

    private var nodeId = PathNodeId(areaId, id)

    fun getNodeId(): PathNodeId = PathNodeId(areaId, id)

    /** このノードと他のノードとの距離の二乗を計算します。 */
    fun distSqr(other: PathNode): Double {
        val d: Double = (this.pos.x - other.pos.x).toDouble()
        val e: Double = (this.pos.y - other.pos.y).toDouble()
        val f: Double = (this.pos.z - other.pos.z).toDouble()
        return d * d + e * e + f * f
    }

    /** このノードと指定された位置との距離の二乗を計算します。 */
    fun distSqr(otherPos: NodePos): Double {
        val d: Double = (this.pos.x - otherPos.x).toDouble()
        val e: Double = (this.pos.y - otherPos.y).toDouble()
        val f: Double = (this.pos.z - otherPos.z).toDouble()
        return d * d + e * e + f * f
    }

    /** エリアと位置のハッシュコードを計算して返します。 */
    fun getLocHashCode(): Int {
        var result = areaId.hashCode()
        result = 31 * result + pos.hashCode()
        return result
    }

    fun copy(
        id_: String = this.id,
        areaId_: String = this.areaId,
        pos_: NodePos = this.pos,
        radius_: Int = this.radius,
        connectedNodes_: MutableList<PathNodeId> = this.connectedNodes
    ): PathNode {
        return PathNode(id_, areaId_, pos_, radius_, connectedNodes_)
    }

}