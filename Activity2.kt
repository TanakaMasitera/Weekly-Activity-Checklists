fun main() {
    // Activity 2 - practising Kotlin variables and data types

    val studentName = "Tanaka"
    val courseName = "DGL 114"
    var completedActivities = 1

    println("Student: $studentName")
    println("Course: $courseName")
    println("Activities completed: $completedActivities")

    // I can update this because completedActivities uses var.
    completedActivities++
    println("After this activity, I will have completed $completedActivities activities.")

    // Practising Int values and calculations.
    val practiceMinutes = 35
    val readingMinutes = 20
    val totalStudyMinutes = practiceMinutes + readingMinutes
    println("I spent $totalStudyMinutes minutes studying Kotlin today.")

    // Practising a Double value.
    val coffeePrice = 4.75
    println("My coffee cost $$coffeePrice.")

    // Practising a Boolean value.
    val activityFinished = true
    println("Is Activity 2 finished? $activityFinished")
}
