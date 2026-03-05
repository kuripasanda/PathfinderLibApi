package com.github.kuripasanda.pathfinderlib.api.client

import com.github.kuripasanda.pathfinderlib.api.exception.NotFoundRouteException
import com.github.kuripasanda.pathfinderlib.api.model.PathNode
import com.github.kuripasanda.pathfinderlib.api.model.PathNodeId

interface NavigationHelper {

    /**
     * 経路を初期化するメソッド。
     * @throws NotFoundRouteException 経路が見つからなかった場合にスローされます。
     */
    @Throws(NotFoundRouteException::class)
    fun initRoute(startNode: PathNodeId, endNode: PathNodeId, onReached: (goal: PathNode) -> Unit = {})

    /** 経路をリセットするメソッド */
    fun resetRoute()

}