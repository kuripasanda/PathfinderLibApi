package com.github.kuripasanda.pathfinderlib.api.exception

/**
 * すでに同じ場所に存在している場合にスローされる例外です。
 * 例えば、エンティティがすでに特定の位置に存在している場合などに使用されます。
 */
class AlreadyLocationException(override val message: String?): Exception()