package KotlinFiles

//package KotlinFiles
//
//import android.widget.EditText
//
///**
// * Kinematic Equation Solver to solve equations.
// */
//class KinematicEquationSolver {
//
//    /**
//     * solveLinearMotionNoDis is created to handle interpreting the input of the user from the front
//     * end logic and choosing the correct function which will then calculate the value and return up
//     * to the front end logic as a string.
//     */
//    fun solveLinearMotionNoDis(inputArray: Array<String>): String {
//        return when (findBlankInArray(inputArray)) {
//            0 -> missingTime(inputArray)
//            1 -> missingAcceleration(inputArray)
//            2 -> missingInitialVelocity(inputArray)
//            3 -> missingFinalVelocity(inputArray)
//            else -> "Sorry please check your input."
//        }
//    }
//
//    /**
//     * findBlankInArray was created to find if there are more then one input that is blank. If there
//     * is only one then it will return the location in the array where it is blank. If there is
//     * none blank or more then one it will return false and prompt the user to check their input.
//     */
//    private fun findBlankInArray(arrayOfInputs: Array<String>): Int {
//        var counter = 0
//        var numberOfBlanks = 0
//        var locationOfBlanks = -1 // Always set to false.
//
//        while (counter < arrayOfInputs.size) {
//            if (arrayOfInputs[counter] == "") {
//                numberOfBlanks += 1
//                locationOfBlanks = counter
//            }
//            counter++
//        }
//        // Returns the location of the blank value when there is only one blank.
//        return when (numberOfBlanks == 1) {
//            true -> locationOfBlanks
//            false -> -1
//        }
//    }
//
//    /**
//     * Method to solve for missingFinalVelocity through adjusted Kinematic equation.
//     * @param arrayOfInputs is the array of all the inputs that the user provided inorder to solve
//     * the equation.
//     * @return solution to equation
//     */
//    private fun missingFinalVelocity(arrayOfInputs: Array<String>): String {
//        // Data space for solution
//        val solution: Double
//
//        // Conversions from EditText Object to Float value.
//        val valueTime = java.lang.Double.parseDouble(arrayOfInputs[0])
//        val valueAcc = java.lang.Double.parseDouble(arrayOfInputs[1])
//        val valueIntVel = java.lang.Double.parseDouble(arrayOfInputs[2])
//
//        // Math for solving said problem
//        solution = valueIntVel + valueTime * valueAcc
//        System.out.println("Solution is " + solution);
//        return java.lang.Double.toString(solution)
//    }
//
//    /**
//     * Method to solve for missing InitialVelocity through adjusted Kinematic equation.
//     * @param arrayOfInputs is the array of all the inputs that the user provided inorder to solve
//     * the equation.
//     * @return Solution to Equation
//     */
//    private fun missingInitialVelocity(arrayOfInputs: Array<String>): String {
//        //Data space for solution
//        val solution: Double
//
//        //Conversions from EditText Object to Float value.
//        val valueTime = java.lang.Double.parseDouble(arrayOfInputs[0])
//        val valueAcc = java.lang.Double.parseDouble(arrayOfInputs[1])
//        val valueFinVel = java.lang.Double.parseDouble(arrayOfInputs[3])
//
//        // Math for solving said problem
//        solution = valueAcc * valueTime - valueFinVel
//        return java.lang.Double.toString(solution)
//    }
//
//    /**
//     * Method to solve for missing Time through adjusted Kinematic equation.
//     * @param arrayOfInputs is the array of all the inputs that the user provided inorder to solve
//     * the equation.
//     * @return Solution to Equation
//     */
//    private fun missingTime(arrayOfInputs: Array<String>): String {
//        //Data space for solution
//        val solution: Double
//
//        //Conversions from EditText Object to Float value.
//        val valueAcc = java.lang.Double.parseDouble(arrayOfInputs[1])
//        val valueIntVel = java.lang.Double.parseDouble(arrayOfInputs[2])
//        val valueFinVel = java.lang.Double.parseDouble(arrayOfInputs[3])
//
//        //Math for solving said problem
//        solution = (valueFinVel - valueIntVel) / valueAcc
//        return java.lang.Double.toString(solution)
//    }
//
//    /**
//     * Method to solve for missing Acceleration through adjusted Kinematic equation.
//     * @param arrayOfInputs is the array of all the inputs that the user provided inorder to solve
//     * the equation.
//     * @return Solution to Equation
//     */
//    private fun missingAcceleration(arrayOfInputs: Array<String>): String {
//        //Data space for solution
//        val solution: Double
//
//        //Conversions from EditText Object to Float value.
//        val valueTime = java.lang.Double.parseDouble(arrayOfInputs[0])
//        val valueIntVel = java.lang.Double.parseDouble(arrayOfInputs[2])
//        val valueFinVel = java.lang.Double.parseDouble(arrayOfInputs[3])
//
//        solution = (valueFinVel - valueIntVel) / valueTime
//        return java.lang.Double.toString(solution)
//    }
//
//
//    /**
//     * This is the division between the old equation structure and the new ones above.
//     */
//
//    /**
//     * The following method is to ensure that all inputs except for the first parameter is filled.
//     * This is to ensure there are no errors for the calculation methods.
//     * The method is expected to return true in the case that the first parameter is blank and the
//     * other text fields are occupied.
//     *
//     * @param expectedBlank Place holder for the missing value.
//     * @param expectedNotBlankOne Place holder for a Known Value.
//     * @param expectedNotBlankTwo Place holder for Known Value.
//     * @param expectedNotBlankThree Place holder for Known Value.
//     * @return Boolean result.
//     */
//    fun checkForBlank(expectedBlank: EditText, expectedNotBlankOne: EditText, expectedNotBlankTwo: EditText, expectedNotBlankThree: EditText): Boolean {
//
//        return expectedBlank.text.toString() == "" &&
//                expectedNotBlankOne.text.toString() != "" &&
//                expectedNotBlankTwo.text.toString() != "" &&
//                expectedNotBlankThree.text.toString() != ""
//    }
//
//    /**
//     * Method to solve for missingFinalVelocity through adjusted Kinematic equation.
//     * @param intVel Initial Velocity
//     * @param time Time
//     * @param acc Acceleration
//     * @return solution to equation
//     */
//    fun missingFinalVelocity(intVel: EditText, time: EditText, acc: EditText): String {
//        //Data space for solution
//        val solution: Double
//
//        //Conversions from EditText Object to Float value.
//        val valueIntVel = java.lang.Double.parseDouble(intVel.text.toString())
//        val valueTime = java.lang.Double.parseDouble(time.text.toString())
//        val valueAcc = java.lang.Double.parseDouble(acc.text.toString())
//
//        // Math for solving said problem
//        solution = valueIntVel + valueTime * valueAcc
//        return java.lang.Double.toString(solution)
//    }
//
//    /**
//     * Method to solve for missing InitialVelocity through adjusted Kinematic equation.
//     * @param finVel Final Velocity
//     * @param time Time
//     * @param acc Acceleration
//     * @return Solution to Equation
//     */
//    fun missingInitialVelocity(finVel: EditText, time: EditText, acc: EditText): String {
//        //Data space for solution
//        val solution: Double
//
//        //Conversions from EditText Object to Float value.
//        val valueFinVel = java.lang.Double.parseDouble(finVel.text.toString())
//        val valueTime = java.lang.Double.parseDouble(time.text.toString())
//        val valueAcc = java.lang.Double.parseDouble(acc.text.toString())
//
//        // Math for solving said problem
//        solution = valueAcc * valueTime - valueFinVel
//        return java.lang.Double.toString(solution)
//    }
//
//    /**
//     * Method to solve for missing Time through adjusted Kinematic equation.
//     * @param intVel Initial Velocity
//     * @param finVel Final Velocity
//     * @param acc Acceleration
//     * @return Solution to Equation
//     */
//    fun missingTime(intVel: EditText, finVel: EditText, acc: EditText): String {
//        //Data space for solution
//        val solution: Double
//
//        //Conversions from EditText Object to Float value.
//        val valueIntVel = java.lang.Double.parseDouble(intVel.text.toString())
//        val valueFinVel = java.lang.Double.parseDouble(finVel.text.toString())
//        val valueAcc = java.lang.Double.parseDouble(acc.text.toString())
//
//        //Math for solving said problem
//        solution = (valueFinVel - valueIntVel) / valueAcc
//        return java.lang.Double.toString(solution)
//    }
//
//    /**
//     * Method to solve for missing Acceleration through adjusted Kinematic equation.
//     * @param intVel Initial Velocity
//     * @param finVel Final Velocity
//     * @param time Time
//     * @return Solution to Equation
//     */
//    fun missingAcceleration(intVel: EditText, finVel: EditText, time: EditText): String {
//        //Data space for solution
//        val solution: Double
//
//        //Conversions from EditText Object to Float value.
//        val valueIntVel = java.lang.Double.parseDouble(intVel.text.toString())
//        val valueFinVel = java.lang.Double.parseDouble(finVel.text.toString())
//        val valueTime = java.lang.Double.parseDouble(time.text.toString())
//
//        solution = (valueFinVel - valueIntVel) / valueTime
//        return java.lang.Double.toString(solution)
//    }
//}