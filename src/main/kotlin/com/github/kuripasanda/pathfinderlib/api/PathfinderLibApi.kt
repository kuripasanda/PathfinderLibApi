package com.github.kuripasanda.pathfinderlib.api

import com.github.kuripasanda.pathfinderlib.api.client.NavigationHelper
import com.github.kuripasanda.pathfinderlib.api.fiding.AStartPathfinder
import com.github.kuripasanda.pathfinderlib.api.model.PathArea
import com.github.kuripasanda.pathfinderlib.api.model.PathNode
import com.github.kuripasanda.pathfinderlib.api.model.PathNodeId

interface PathfinderLibApi {

    companion object {
        val MOD_ID = "pathfinderlib"
    }

    /** A*アルゴリズムを使用してパスを見つけるためのパスファインダを取得します。 */
    fun getAStartPathfinder(): AStartPathfinder

    /**
     * ナビゲーションシステムのヘルパーを取得します。
     * このヘルパーは、クライアント側でのみ利用可能です。サーバー側で呼び出された場合、IllegalStateExceptionがスローされます。
     * @return ナビゲーションシステムのヘルパー
     * @throws IllegalStateException クライアント側でない場合
     */
    @Throws(IllegalStateException::class)
    fun getClientNavigationHelper(): NavigationHelper


    fun addPathArea(area: PathArea): PathArea
    fun addPathNode(node: PathNode): PathNode

    fun deletePathArea(areaId: String): PathArea?
    fun deletePathNode(areaId: String, nodeId: String): PathNode?
    fun deletePathNode(nodeId: PathNodeId): PathNode?

    fun getPathArea(areaId: String): PathArea?
    fun getPathNode(areaId: String, nodeId: String): PathNode?
    fun getPathNode(nodeId: PathNodeId): PathNode?

    fun getAllPathAreas(): List<PathArea>

}