package nl.freshminds

import java.util.Collections.singletonList

/**
 * There are no tests available for this assignment.
 *
 * 1. Define a sealed class [FileSystemNode] with two subclasses, [File] and [Directory].
 *
 * The [FileSystemNode] class should have a property name that represents the [name] of the node.
 *
 * The [File] data class extends [FileSystemNode] and should have a property [content] that represents
 * the content of the file.
 *
 * The [Directory] data class extends [FileSystemNode]. The Directory class should have a property children
 * that represents a list of child nodes, which can be either files or directories (so a list of [FileSystemNode]).
 *
 * 2. Add a main function and create an instance of [Directory] that represents the root of your file system.
 * Add several files and directories as child nodes to the root directory.
 *
 * 3. Implement a method [printFileSystem()] that takes a [FileSystemNode] as input and prints out the entire
 * file system making use of the 'when' statement and recursion.
 */

fun main() {
    val innerChildren = singletonList( nl.freshminds.File("jpg", "innerTest"))

    val children = listOf(Directory(innerChildren, "folder with child"),
        nl.freshminds.File("jpg", "test"),
        nl.freshminds.File("jpg", "test2")
    )

    val root = Directory(children, "root")
    printFileSystem(root)
}

fun printFileSystem(node: FileSystemNode, indent : Int = 0) {
    when (node) {
        is File -> println(" ".repeat(indent) + "File: ${node.name}.${node.content}")
        is Directory -> {
            println(" ".repeat(indent) + "Folder: ${node.name}")
            node.children.forEach { child -> printFileSystem(child, indent + 1) }
        }
    }
}

class Directory(val children: List<FileSystemNode>, name: String) : FileSystemNode(name)

class File(val content: String, name: String) : FileSystemNode(name)

sealed class FileSystemNode(val name: String)
