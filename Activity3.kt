fun main() {
    // Activity 3 - practising functions in Kotlin

    showWelcomeMessage()

    println(courseMessage("DGL 114"))

    println(
        activitySummary(
            activityName = "Kotlin Functions",
            minutesSpent = 45
        )
    )

    // Using the default activity name
    println(activitySummary(minutesSpent = 30))
}

// A simple function with no return value
fun showWelcomeMessage() {
    println("I am practising Kotlin functions.")
}

// A function with a parameter and a return value
fun courseMessage(courseName: String): String {
    return "I am currently learning Kotlin in $courseName."
}

// A function with multiple parameters and a default argument
fun activitySummary(
    activityName: String = "Kotlin Practice",
    minutesSpent: Int
): String {
    return "I worked on $activityName for $minutesSpent minutes."
}
