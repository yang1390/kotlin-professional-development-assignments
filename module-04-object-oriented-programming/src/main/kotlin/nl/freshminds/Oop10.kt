package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Create value classes for all fields of the [Book] and [Ebook] data classes. Move validation logic to
 * the respective value classes.
 */

@JvmInline
value class Title(private val s: String) {
    init {
        require(s.isNotBlank()) { "title cannot be blank" }
    }
}

@JvmInline
value class Isbn(private val s: String) {
    init {
        require(s.length == 10) { "isbn should have a length of 10" }
    }
}
@JvmInline
value class Format(private val s: String) {
    init {
        require(s.isNotBlank()) { "format cannot be blank" }
    }
}

@JvmInline
value class Publisher(private val s: String) {
    init {
        require(s.isNotBlank()) { "publisher cannot be blank" }
    }
}

@JvmInline
value class Type(private val s: String) {
    init {
        require(s.isNotBlank()) { "type cannot be blank" }
    }
}

data class Book(
    val title: Title,
    val isbn: Isbn,
    val publisher: Publisher,
    val type: Type = Type("hardcover")
)

data class Ebook(
    val title: Title,
    val isbn: Isbn,
    val publisher: Publisher,
    val format: Format = Format(".epub")
)
