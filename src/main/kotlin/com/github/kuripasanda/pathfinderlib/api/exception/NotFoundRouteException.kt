package com.github.kuripasanda.pathfinderlib.api.exception

class NotFoundRouteException(
    override val message: String = "ルートが見つかりませんでした。スタートノードとゴールノードの接続を確認してください。"
): Exception()