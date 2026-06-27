package main.kotlin

fun main() {
    val x = 5
    val y = 8

    val sum = x + y
    val subtraction = x - y
    val multiplication = x * y
    val division: Float = x.toFloat() / y
    val module = x % y

    println("The sum is $sum")
    println("The subtraction is $subtraction")
    println("The multiplication is $multiplication")
    println("The division is $division")
    println("The module is $module")

    println("\n--- Operator Precedence Examples ---")

    /* * Example 1: Multiplicative operators (*, /, %) have higher precedence than additive ones (+, -).
     * Execution order:
     * 1. x * y is evaluated first (5 * 8 = 40)
     * 2. Then, sum is added to the result (13 + 40 = 53)
     */
    val precedence1 = sum + x * y
    println("Result of 'sum + x * y' is: $precedence1") // Prints 53

    /* * Example 2: Parentheses () have the highest precedence and force the order of evaluation.
     * Execution order:
     * 1. (sum + x) is evaluated first inside parentheses (13 + 5 = 18)
     * 2. Then, that result is multiplied by y (18 * 8 = 144)
     */
    val precedence2 = (sum + x) * y
    println("Result of '(sum + x) * y' is: $precedence2") // Prints 144

    /* * Example 3: Operators with the same precedence level are evaluated from left to right (Associativity).
     * Since * and % share the same precedence:
     * 1. x * y is evaluated first (5 * 8 = 40)
     * 2. Then 40 % 3 is evaluated (40 divided by 3 leaves a remainder of 1)
     * 3. Finally, the subtraction is handled: sum - 1 (13 - 1 = 12)
     */
    val precedence3 = sum - x * y % 3
    println("Result of 'sum - x * y % 3' is: $precedence3") // Prints 12
}
