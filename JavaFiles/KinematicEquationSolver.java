package JavaFiles;

/**	
 * Kinematic Equation Solver to solve equations.
 */	
public class KinematicEquationSolver implements CalculationTools{

    /**
     * The following section below is for Linear motion with no distance in the equation
     * Equation: 
     */

    /**	
     * The following method is to ensure that all inputs except for the first parameter are filled.	
     * This is to ensure there are no errors for the calculation methods.	
     * The method is expected to return true in the case that the first parameter is blank and the	
     * other text fields are occupied.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return Boolean result.	
     */	
    public String findEquationLMnD(String arrayOfInputs[]){
        switch(findBlankInArray(arrayOfInputs)){
            case 0: return solveForTimeLMnD(arrayOfInputs);
            case 1: return solveForAccelerationLMnD(arrayOfInputs);
            case 2: return solveForInitialVelocityLMnD(arrayOfInputs);
            case 3: return solveForFinalVelocityLMnD(arrayOfInputs);
            default: return "Sorry please check your input.";
        }
    }	

    /**	
     * Method to solve for solveForFinalVelocityLMnD through adjusted Kinematic equation.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.	
     * @return solution to equation	
     */	
    public String solveForFinalVelocityLMnD(String arrayOfInputs[]){	
        //Conversions from EditText Object to Float value.	
        double valueTime = Double.parseDouble(arrayOfInputs[0]);
        double valueAcc = Double.parseDouble(arrayOfInputs[1]);		
        double valueIntVel = Double.parseDouble(arrayOfInputs[2]);		

        //Data space for solution	
        double solution;	

        // Math for solving said problem	
        solution = (valueIntVel + (valueTime*valueAcc));	
        return Double.toString(solution);	
    }	

    /**	
     * Method to solve for solveForInitialVelocityLMnD through adjusted Kinematic equation.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return Solution to Equation	
     */	
    public String solveForInitialVelocityLMnD(String arrayOfInputs[]){	
        //Conversions from EditText Object to Float value.	
        double valueTime = Double.parseDouble(arrayOfInputs[0]);	
        double valueAcc = Double.parseDouble(arrayOfInputs[1]);	
        double valueFinVel = Double.parseDouble(arrayOfInputs[3]);	

        //Data space for solution	
        double solution;	
        
        // Math for solving said problem	
        solution = ((valueAcc*valueTime) - valueFinVel);	
        return Double.toString(solution);	
    }	

    /**	
     * Method to solve for missing solveForTimeLMnD through adjusted Kinematic equation.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return Solution to Equation	
     */	
    public String solveForTimeLMnD(String arrayOfInputs[]){	
        //Conversions from EditText Object to Float value.	
        double valueAcc = Double.parseDouble(arrayOfInputs[1]);	
        double valueIntVel = Double.parseDouble(arrayOfInputs[2]);	
        double valueFinVel = Double.parseDouble(arrayOfInputs[3]);

        //Data space for solution	
        double solution;	

        //Math for solving said problem	
        solution = ((valueFinVel-valueIntVel)/valueAcc);	
        return Double.toString(solution);	
    }	

    /**	
     * Method to solve for missing solveForAccelerationLMnD through adjusted Kinematic equation.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return Solution to Equation	
     */	
    public String solveForAccelerationLMnD(String arrayOfInputs[]){	
        //Conversions from EditText Object to Float value.	
        double valueTime = Double.parseDouble(arrayOfInputs[0]);
        double valueIntVel = Double.parseDouble(arrayOfInputs[2]);	
        double valueFinVel = Double.parseDouble(arrayOfInputs[3]);	
	
        //Data space for solution	
        double solution;

        solution = ((valueFinVel-valueIntVel)/valueTime);	
        return Double.toString(solution);	
    }
    
    /**
     * This section is for Linear Motion with constant acceleration.
     * Equation: 
     */

     public String findEquationLMcA(String arrayOfInputs[]){
        switch(findBlankInArray(arrayOfInputs)){
            case 0: return solveForTimeOneLMcA(arrayOfInputs);
            case 1: return solveForTimeTwoLMcA(arrayOfInputs);
            case 2: return solveForAccelerationLMcA(arrayOfInputs);
            case 3: return solveForInitialVelocityLMcA(arrayOfInputs);
            case 4: return solveForDistanceLMcA(arrayOfInputs);
            default: return "Sorry please check your input.";
        }
     }

    private String solveForTimeOneLMcA(String[] arrayOfInputs) {
        //Conversions from EditText Object to Float value.
        double valueTimeOne = Double.parseDouble(arrayOfInputs[0]);	
        double valueTimeTwo = Double.parseDouble(arrayOfInputs[1]);
        double valueAcc = Double.parseDouble(arrayOfInputs[2]);	
        //double valueInitialVelocity = Double.parseDouble(arrayOfInputs[3]);	//Not Used for this funtion. 
        double valueDistance = Double.parseDouble(arrayOfInputs[4]);	
        
        //Data space for solution	
        double solution;

        //Math for solving said problem	
        solution = (valueDistance-(0.5*valueAcc*(valueTimeTwo * valueTimeTwo))/valueTimeOne);	
        return Double.toString(solution);	
    }
    private String solveForTimeTwoLMcA(String[] arrayOfInputs) {
        //Conversions from EditText Object to Float value.
        double valueTimeOne = Double.parseDouble(arrayOfInputs[0]);	
        //double valueTimeTwo = Double.parseDouble(arrayOfInputs[1]); //Not Used for this funtion.
        double valueAcc = Double.parseDouble(arrayOfInputs[2]);	
        double valueInitialVelocity = Double.parseDouble(arrayOfInputs[3]);
        double valueDistance = Double.parseDouble(arrayOfInputs[4]);	
        
        //Data space for solution	
        double solution;

        //Math for solving said problem	
        solution = Math.sqrt(((2*(valueDistance-(valueInitialVelocity*valueTimeOne)))/valueAcc));	
        return Double.toString(solution);	
    }

    private String solveForAccelerationLMcA(String[] arrayOfInputs) {
        double valueTimeOne = Double.parseDouble(arrayOfInputs[0]);
        double valueTimeTwo = Double.parseDouble(arrayOfInputs[1]);
        //double valueAcc = Double.parseDouble(arrayOfInputs[2]);	//Not Used for this funtion. 
        double valueInitialVelocity = Double.parseDouble(arrayOfInputs[3]);	
        double valueDistance = Double.parseDouble(arrayOfInputs[4]);

        //Data space for solution	
        double solution;

        //Math for solving said problem	
        solution = ((2 * (valueDistance - (valueInitialVelocity * valueTimeOne)))/(valueTimeTwo * valueTimeTwo));	
        return Double.toString(solution);
    }

    private String solveForInitialVelocityLMcA(String[] arrayOfInputs) {
        double valueTimeOne = Double.parseDouble(arrayOfInputs[0]);
        double valueTimeTwo = Double.parseDouble(arrayOfInputs[1]);
        double valueAcc = Double.parseDouble(arrayOfInputs[2]);	
        //double valueInitialVelocity = Double.parseDouble(arrayOfInputs[3]);	//Not Used for this funtion. 
        double valueDistance = Double.parseDouble(arrayOfInputs[4]);

        //Data space for solution	
        double solution;

        //Math for solving said problem	
        solution = ((valueDistance - (0.5 * valueAcc * (valueTimeTwo * valueTimeTwo)))/valueTimeOne);	
        return Double.toString(solution);
    }

    private String solveForDistanceLMcA(String[] arrayOfInputs) {
        //Conversions from EditText Object to Float value.	
        double valueTimeOne = Double.parseDouble(arrayOfInputs[0]);
        double valueTimeTwo = Double.parseDouble(arrayOfInputs[1]);
        double valueAcc = Double.parseDouble(arrayOfInputs[2]);	
        double valueInitialVelocity = Double.parseDouble(arrayOfInputs[3]);
        //double valueDistance = Double.parseDouble(arrayOfInputs[4]);		//Not Used for this function. 
        
        //Data space for solution	
        double solution;

        //Math for solving said problem	
        solution = ((valueInitialVelocity * valueTimeOne) + (0.5 * valueAcc * (valueTimeTwo * valueTimeTwo)));	
        return Double.toString(solution);
    }


    /**
     * This section is for Linear Motion with constant acceleration.
     * Equation: 
     

    public String findEquationLMnA(String arrayOfInputs[]){
        switch(findBlankInArray(arrayOfInputs)){
            case 0: return solveForTimeOneLMnA(arrayOfInputs);
            case 1: return solveForTimeTwoLMnA(arrayOfInputs);
            case 2: return solveForAccelerationLMcA(arrayOfInputs);
            case 3: return solveForInitialVelocityLMcA(arrayOfInputs);
            case 4: return solveForDistanceLMcA(arrayOfInputs);
            default: return "Sorry please check your input.";
        }
     }

    private String solveForTimeOneLMcA(String[] arrayOfInputs) {
        return null;
    }
    private String solveForTimeTwoLMcA(String[] arrayOfInputs) {
        return null;
    }

    private String solveForAccelerationLMcA(String[] arrayOfInputs) {
        return null;
    }

    private String solveForInitialVelocityLMcA(String[] arrayOfInputs) {
        return null;
    }

    private String solveForDistanceLMcA(String[] arrayOfInputs) {
        return null;
    }
    */
}