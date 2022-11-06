package com.khch.explain.ast

import com.khch.explain.ast.interfaces.Expression
import com.khch.explain.ast.interfaces.Node
import com.khch.explain.token.Token

class Identifier(val value: String, private val token: Token) : Expression, Node {
    override fun expressionNode() {
    }

    override fun tokenLiteral(): String {
        return token.literal!!
    }
}