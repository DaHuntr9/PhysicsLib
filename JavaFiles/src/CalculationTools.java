package JavaFiles.src;

/**	
 * This CalculationTools is a interface for all other classes to inherit shared functions. 	
 */	
interface CalculationTools {

    /**	
     * The following method is to ensure that all inputs except for the first parameter are filled.	
     * This is to ensure there are no errors for the calculation methods.	
     * The method is expected to return true in the case that the first parameter is blank and the	
     * other text fields are occupied.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return Boolean result.	
     */	
    //public String findEquation(String arrayOfInputs[]);


    /**
     * The findBlankInArray method was created to find if there are more then one
     * input that is blank. If there is only one then it will return the location in
     * the array where it is blank. If there is none blank or more then one it will
     * return false and prompt the user to check their input.
     * 
     * @param arrayOfInputs is the array of all the inputs that the user provided in
     *                      order to solve the equation.
     * @return int either location in the array or -1.
     */
    default int findBlankInArray(String[] arrayOfInputs) {
        int counter = 0;
        int numberOfBlanks = 0;
        int locationOfBlanks = -1; // Always set to false.

        while (counter < arrayOfInputs.length) {
            if (arrayOfInputs[counter].equals("")) {
                numberOfBlanks += 1;
                locationOfBlanks = counter;
            }
            counter++;
        }
        // Returns the location of the blank value when there is only one blank.
        if (numberOfBlanks == 1) {
            return locationOfBlanks;
        } else {
            return -1;
        }
    }

}