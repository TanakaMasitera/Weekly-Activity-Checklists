fun main() {
    // Print messages
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
    println()

    // Fix compile error
    println("New chat message from a friend")
    println()

    // String templates
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
    println()

    // String concatenation
    val numberOfAdults = 20
    val numberOfKids = 30
    val totalPartySize = numberOfAdults + numberOfKids
    println("The total party size is: $totalPartySize")
    println()

    // Message formatting
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    println()

    // Basic math operations
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    println("$firstNumber + $secondNumber = ${add(firstNumber, secondNumber)}")
    println("$firstNumber + $thirdNumber = ${add(firstNumber, thirdNumber)}")
    println("$firstNumber - $secondNumber = ${subtract(firstNumber, secondNumber)}")
    println("$firstNumber - $thirdNumber = ${subtract(firstNumber, thirdNumber)}")
    println()

    // Default parameters
    println(displayAlertMessage(emailId = "user_one@gmail.com"))
    println(displayAlertMessage("Windows", "user_two@gmail.com"))
    println(displayAlertMessage("Mac OS", "user_three@gmail.com"))
    println()

    // Pedometer
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun add(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun subtract(number1: Int, number2: Int): Int {
    return number1 - number2
}

fun displayAlertMessage(
    operatingSystem: String = "Unknown OS",
    emailId: String
): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
