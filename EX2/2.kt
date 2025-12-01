fun main() {
    val numbers = (1..100).toList()

    // Filter: even numbers
    val evens = numbers.filter { it % 2 == 0 }

    val squares = numbers.map { it * it }

    val sum = numbers.reduce { acc, n -> acc + n }

    println("Evens:")
    println(evens)

    println("\nSquares:")
    println(squares)

    println("\nSum:")
    println(sum)
}
