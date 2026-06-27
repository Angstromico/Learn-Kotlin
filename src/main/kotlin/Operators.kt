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

    //Increase and decrease
    println("\n--- Increase and Decrease Examples ---")

    var number = 8
    number = number + 2  // Standard reassignment
    number += 1          // Augmented assignment shortcut (equivalent to number = number + 1)

    println("Initially number is 8 but now is $number") // Prints 11

    /* * Example 4: Decrement Assignment Shortcut (-=)
     * It subtracts a value from the variable and saves it back instantly.
     * Works exactly like += but for subtraction.
     */
    number -= 3 // Equivalent to: number = number - 3 (11 - 3)
    println("After number -= 3, the value is: $number") // Prints 8

    /* * Example 5: Postfix Increment (number++) vs Prefix Increment (++number)
     * This is highly important for operator precedence!
     * * Postfix (number++): Evaluates the current expression FIRST, then increments the variable.
     * Prefix (++number): Increments the variable FIRST, then evaluates the expression.
     */
    println("\n--- Postfix vs Prefix Breakdown ---")

    // Resetting number to 10 for clean math
    number = 10

    /* Postfix Example:
     * 1. Kotlin passes the current value (10) to the println function.
     * 2. Right after printing, 'number' is incremented to 11 in memory.
     */
    println("Using postfix (number++): ${number++}") // Prints 10, but 'number' becomes 11 right after
    println("The value in memory is now: $number")    // Prints 11

    /* Prefix Example:
     * 1. 'number' is instantly incremented in memory from 11 to 12.
     * 2. Kotlin then passes that new value (12) to the println function.
     */
    println("Using prefix (++number): ${++number}") // Increments to 12 first, then prints 12

    /* * Example 6: Multiplicative Assignment Shortcuts (*=, /=)
     * You can use these to quickly multiply or divide a variable in place.
     */
    println("\n--- Multiplicative Shortcuts ---")
    var multiplier = 4
    multiplier *= 2 // Equivalent to: multiplier = multiplier * 2 (4 * 2)
    println("After multiplier *= 2: $multiplier") // Prints 8

    var divider = 20
    divider /= 5 // Equivalent to: divider = divider / 5 (20 / 5)
    println("After divider /= 5: $divider") // Prints 4

    // --- New Section: Comparison Operators ---
    println("\n--- Comparison Operators Examples ---")

    /* * Example 7: Relational Comparisons (>, <, >=, <=)
     * These compare numbers and return a Boolean (true or false).
     * Note: In operator precedence, math operations (+, -, *, /) are executed
     * BEFORE comparison operators.
     */
    val isGreater = x > y  // Is 5 greater than 8?
    val isLess = x < y     // Is 5 less than 8?

    println("Is x > y? $isGreater") // Prints false
    println("Is x < y? $isLess")    // Prints true

    // Mixing math operations with comparisons:
    // 1. Math runs first: x + 4 evaluation yields 9
    // 2. Comparison runs last: Is 9 greater than or equal to y (8)?
    val isGreaterOrEqual = (x + 4) >= y
    println("Is (x + 4) >= y? $isGreaterOrEqual") // Prints true because 9 >= 8

    val isLessOrEqual = x <= 5 // Is 5 less than or equal to 5?
    println("Is x <= 5? $isLessOrEqual") // Prints true

    /* * Example 8: Equality and Inequality Operators (==, !=)
     * == checks if two values are structurally equal.
     * != checks if two values are NOT equal.
     */
    val isEqual = x == y  // Is 5 equal to 8?
    val isNotEqual = x != y  // Is 5 not equal to 8?

    println("Is x == y? $isEqual")    // Prints false
    println("Is x != y? $isNotEqual") // Prints true

    // Testing equality directly with values
    val conditionCheck = (x * 2) == 10 // Does 5 * 2 equal 10?
    println("Result of (x * 2) == 10 is: $conditionCheck") // Prints true

    // --- New Section: Logical Operators ---
    println("\n--- Logical Operators Examples ---")

    /* * Example 9: The Logical AND Operator (&&)
     * Returns true ONLY if both sides evaluate to true.
     */
    val isSunny = true
    val isWarm = false

    // true && false evaluates to false
    val goGroupHiking = isSunny && isWarm
    println("Will we go hiking? (AND check): $goGroupHiking") // Prints false

    // Mixing comparisons with logical operators
    // Math and comparisons happen BEFORE logical operations.
    // (5 < 8) is true AND (5 == 5) is true -> true && true
    val complexAnd = (x < y) && (x == 5)
    println("Result of '(x < y) && (x == 5)': $complexAnd") // Prints true

    /* * Example 10: The Logical OR Operator (||)
     * Returns true if at least ONE of the conditions is true.
     */
    val hasCash = false
    val hasCard = true

    // false || true evaluates to true
    val canBuyCoffee = hasCash || hasCard
    println("Can I buy coffee? (OR check): $canBuyCoffee") // Prints true

    /* * Operator Precedence Hint:
     * In Kotlin, the Logical AND (&&) has a higher precedence than Logical OR (||).
     * Execution order below:
     * 1. (x > y) && isSunny is evaluated first -> (false && true) = false
     * 2. Then, that result is OR'd with hasCard -> false || true = true
     */
    val mixedLogical = (x > y) && isSunny || hasCard
    println("Result of mixed logical precedence: $mixedLogical") // Prints true

    // --- New Section: Text from boolean ---
    println("\n--- Text from boolean ---")

    val condition = false
    val text = if(condition) {
        "Is real"
    } else "Is false"

    println(text)
}
