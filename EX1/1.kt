fun main() {

    val primes = mutableListOf<Int>()
    var num = 2

    fun isPrime(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }

    while (primes.size < 50) {
        if (isPrime(num)) {
            primes.add(num)
        }
        num++
    }

    println("First 50 primes:")
    println(primes)

    val evens = List(50) { (it + 1) * 2 }

    primes.addAll(evens)
    println("\nCombined list (primes + evens):")
    println(primes)
}
