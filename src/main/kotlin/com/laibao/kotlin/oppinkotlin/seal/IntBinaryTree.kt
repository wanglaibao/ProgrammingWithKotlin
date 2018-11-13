package com.laibao.kotlin.oppinkotlin.seal

/**
 * @author laibao wang
 */
sealed class IntBinaryTree {
    class EmptyNode : IntBinaryTree()

    class IntBinaryTreeNode(val left: IntBinaryTree, val value: Int, val right: IntBinaryTree) : IntBinaryTree()
}