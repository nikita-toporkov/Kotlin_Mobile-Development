
open class Employee(
    protected val name: String,
    protected val baseSalary: Double
) {
    open fun calculateSalary(): Double {
        return baseSalary
    }
}


class FullTimeEmployee(
    name: String,
    baseSalary: Double,
    private val bonus: Double
) : Employee(name, baseSalary) {

    override fun calculateSalary(): Double {
        return baseSalary + bonus
    }
}

class PartTimeEmployee(
    name: String,
    baseSalary: Double,
    private val hourlyRate: Double,
    private val hoursWorked: Int
) : Employee(name, baseSalary) {

    override fun calculateSalary(): Double {
        return baseSalary + (hourlyRate * hoursWorked)
    }
}

fun main() {
    val emp1 = FullTimeEmployee("Alice", 3000.0, 500.0)
    val emp2 = FullTimeEmployee("Bob", 3200.0, 750.0)
    val emp3 = PartTimeEmployee("Charlie", 0.0, 20.0, 60)
    val emp4 = PartTimeEmployee("Diana", 0.0, 18.5, 40)
    
    val employees = mapOf(
        emp1.name to emp1.calculateSalary(),
        emp2.name to emp2.calculateSalary(),
        emp3.name to emp3.calculateSalary(),
        emp4.name to emp4.calculateSalary()
    )
    for ((name, salary) in employees) {
        println("$name's Salary: $$salary")
    }
}
