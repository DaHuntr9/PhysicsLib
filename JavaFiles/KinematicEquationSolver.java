package JavaFiles;

/**	
 * Kinematic Equation Solver to solve equations.
 */	
public class KinematicEquationSolver implements CalculationTools{

    /**
     * The following section below is for Linear motion with no distance in the equation
     * Equation: Vf = Vi+a*t
     */

    /**	
     * The following method is to ensure that all inputs except for the first parameter are filled.	
     * This is to ensure there are no errors for the calculation methods.	
     * The method is expected to return true in the case that the first parameter is blank and the	
     * other text fields are occupied.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * The array structure should be as follows:
     * 1. Time
     * 2. Acceleration
     * 3. Initial Velocity
     * 4. Final Velocity
     * @return String with the calculated result or error message.
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
     * Method to solve for missing solveForTimeLMnD through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    public String solveForFinalVelocityLMnD(String arrayOfInputs[]){	
        //Conversions from String to Double.	
        double valueTime = Double.parseDouble(arrayOfInputs[0]);
        double valueAcc = Double.parseDouble(arrayOfInputs[1]);		
        double valueIntVel = Double.parseDouble(arrayOfInputs[2]);		

        // Math for solving said problem	
        double solution = (valueIntVel + (valueTime*valueAcc));	
        return Double.toString(solution);	
    }	

    /**	
     * Method to solve for missing solveForTimeLMnD through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    public String solveForInitialVelocityLMnD(String arrayOfInputs[]){	
        //Conversions from String to Double.	
        double valueTime = Double.parseDouble(arrayOfInputs[0]);	
        double valueAcc = Double.parseDouble(arrayOfInputs[1]);	
        double valueFinVel = Double.parseDouble(arrayOfInputs[3]);	

        // Math for solving said problem	
        double solution = ((valueAcc*valueTime) - valueFinVel);	
        return Double.toString(solution);	
    }	

    /**	
     * Method to solve for missing solveForTimeLMnD through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    public String solveForTimeLMnD(String arrayOfInputs[]){	
        //Conversions from String to Double.	
        double valueAcc = Double.parseDouble(arrayOfInputs[1]);	
        double valueIntVel = Double.parseDouble(arrayOfInputs[2]);	
        double valueFinVel = Double.parseDouble(arrayOfInputs[3]);

        //Math for solving said problem	
        double solution = ((valueFinVel-valueIntVel)/valueAcc);	
        return Double.toString(solution);	
    }	

    /**	
     * Method to solve for missing solveForTimeLMnD through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    public String solveForAccelerationLMnD(String arrayOfInputs[]){	
        //Conversions from String to Double.	
        double valueTime = Double.parseDouble(arrayOfInputs[0]);
        double valueIntVel = Double.parseDouble(arrayOfInputs[2]);	
        double valueFinVel = Double.parseDouble(arrayOfInputs[3]);	

        double solution = ((valueFinVel-valueIntVel)/valueTime);	
        return Double.toString(solution);	
    }
    
    /**
     * This section is for Linear Motion with constant acceleration.
     * Equation: d=Vi*t1+((1/2)*a*t2^2)
     */

    
    /**	
     * The following method is to ensure that all inputs except for the first parameter are filled.	
     * This is to ensure there are no errors for the calculation methods.	
     * The method is expected to return true in the case that the first parameter is blank and the	
     * other text fields are occupied.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * The array structure should be as follows:
     * 1. Time One
     * 2. Time Two
     * 3. Acceleration
     * 4. Initial Velocity
     * 5. Distance
     * @return String with the calculated result or error message.	
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

    /**	
     * Method to solve for missing solveForTimeLMcA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForTimeOneLMcA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double TimeOne = Double.parseDouble(arrayOfInputs[0]);	
        double TimeTwo = Double.parseDouble(arrayOfInputs[1]);
        double acceleration = Double.parseDouble(arrayOfInputs[2]);	
        //double initialVelocity = Double.parseDouble(arrayOfInputs[3]);	//Not Used for this funtion. 
        double distance = Double.parseDouble(arrayOfInputs[4]);	

        //Math for solving said problem	
        double solution = (distance-(0.5*acceleration*(TimeTwo * TimeTwo))/TimeOne);	
        return Double.toString(solution);	
    }

    /**	
     * Method to solve for missing solveForTimeLMcA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForTimeTwoLMcA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double timeOne = Double.parseDouble(arrayOfInputs[0]);	
        //double timeTwo = Double.parseDouble(arrayOfInputs[1]); //Not Used for this funtion.
        double acceleration = Double.parseDouble(arrayOfInputs[2]);	
        double initialVelocity = Double.parseDouble(arrayOfInputs[3]);
        double distance = Double.parseDouble(arrayOfInputs[4]);	

        //Math for solving said problem	
        double solution = Math.sqrt(((2*(distance-(initialVelocity*timeOne)))/acceleration));	
        return Double.toString(solution);	
    }

    /**	
     * Method to solve for missing solveForTimeLMcA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForAccelerationLMcA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double timeOne = Double.parseDouble(arrayOfInputs[0]);
        double timeTwo = Double.parseDouble(arrayOfInputs[1]);
        //double acceleration = Double.parseDouble(arrayOfInputs[2]);	//Not Used for this funtion. 
        double initialVelocity = Double.parseDouble(arrayOfInputs[3]);	
        double distance = Double.parseDouble(arrayOfInputs[4]);

        //Math for solving said problem	
        double solution = ((2 * (distance - (initialVelocity * timeOne)))/(timeTwo * timeTwo));	
        return Double.toString(solution);
    }

    /**	
     * Method to solve for missing solveForTimeLMcA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForInitialVelocityLMcA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double timeOne = Double.parseDouble(arrayOfInputs[0]);
        double timeTwo = Double.parseDouble(arrayOfInputs[1]);
        double acceleration = Double.parseDouble(arrayOfInputs[2]);	
        //double initialVelocity = Double.parseDouble(arrayOfInputs[3]);	//Not Used for this funtion. 
        double distance = Double.parseDouble(arrayOfInputs[4]);

        //Math for solving said problem	
        double solution = ((distance - (0.5 * acceleration * (timeTwo * timeTwo)))/timeOne);	
        return Double.toString(solution);
    }

    /**	
     * Method to solve for missing solveForTimeLMcA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForDistanceLMcA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double timeOne = Double.parseDouble(arrayOfInputs[0]);
        double timeTwo = Double.parseDouble(arrayOfInputs[1]);
        double acceleration = Double.parseDouble(arrayOfInputs[2]);	
        double initialVelocity = Double.parseDouble(arrayOfInputs[3]);
        //double distance = Double.parseDouble(arrayOfInputs[4]);		//Not Used for this function. 

        //Math for solving said problem	
        double solution = ((initialVelocity * timeOne) + (0.5 * acceleration * (timeTwo * timeTwo)));	
        return Double.toString(solution);
    }


    /**
     * This section is for Linear Motion with constant acceleration.
     * Equation: Vf^2 = Vi^2 + 2*a*d
     */

    /**	
     * The following method is to ensure that all inputs except for the first parameter are filled.	
     * This is to ensure there are no errors for the calculation methods.	
     * The method is expected to return true in the case that the first parameter is blank and the	
     * other text fields are occupied.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * The array structure should be as follows:
     * 1. Initial Velocity
     * 2. Final Velocity
     * 3. Acceleration
     * 4. Distance
     * @return String with the calculated result or error message.	
     */	
    public String findEquationLMnVF(String arrayOfInputs[]){
        switch(findBlankInArray(arrayOfInputs)){
            case 0: return solveForInitialVelocityLMnVF(arrayOfInputs);
            case 1: return solveForFinalVelocityLMnVF(arrayOfInputs);
            case 2: return solveForAccelerationLMnVF(arrayOfInputs);
            case 3: return solveForDistanceLMnVF(arrayOfInputs);
            default: return "Sorry please check your input.";
        }
    }
    
    /**	
     * Method to solve for missing solveForTimeLMnVF through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForInitialVelocityLMnVF(String[] arrayOfInputs) {
        //Conversions from String to Double.
        //double initialVelocity = Double.parseDouble(arrayOfInputs[0]);
        double finalVelocity = Double.parseDouble(arrayOfInputs[1]);
        double acceleration = Double.parseDouble(arrayOfInputs[2]);	
        double distance = Double.parseDouble(arrayOfInputs[3]);

        //Math for solving said problem	
        double solution = Math.sqrt(((finalVelocity*finalVelocity)+((-1)*(2*acceleration*distance))));	
        return Double.toString(solution);
    }

    /**	
     * Method to solve for missing solveForTimeLMnVF through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForFinalVelocityLMnVF(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double initialVelocity = Double.parseDouble(arrayOfInputs[0]);	
        //double finalVelocity = Double.parseDouble(arrayOfInputs[1]);    //Not Used for this function. 
        double acceleration = Double.parseDouble(arrayOfInputs[2]);	
        double distance = Double.parseDouble(arrayOfInputs[3]);

        //Math for solving said problem	
        double solution = Math.sqrt(((initialVelocity*initialVelocity)+(2*acceleration*distance)));	
        return Double.toString(solution);
    }

    /**	
     * Method to solve for missing solveForTimeLMnVF through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForAccelerationLMnVF(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double initialVelocity = Double.parseDouble(arrayOfInputs[0]);	
        double finalVelocity = Double.parseDouble(arrayOfInputs[1]);
        //double acceleration = Double.parseDouble(arrayOfInputs[2]);    //Not Used for this function. 
        double distance = Double.parseDouble(arrayOfInputs[3]);

        //Math for solving said problem	
        double solution = (((finalVelocity*finalVelocity)*(initialVelocity*initialVelocity))/2*distance);	
        return Double.toString(solution);
    }

    /**	
     * Method to solve for missing solveForTimeLMnVF through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForDistanceLMnVF(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double initialVelocity = Double.parseDouble(arrayOfInputs[0]);	
        double finalVelocity = Double.parseDouble(arrayOfInputs[1]);
        double acceleration = Double.parseDouble(arrayOfInputs[2]);	
        //double distance = Double.parseDouble(arrayOfInputs[3]);    //Not Used for this function. 

        //Math for solving said problem	
        double solution = (((finalVelocity*finalVelocity)*(initialVelocity*initialVelocity))/2*acceleration);	
        return Double.toString(solution);
    }


    /**
    * This section is for Linear Motion with constant acceleration.
    * Equation: d = ((Vi+Vf)/2)*t
    */
    
    /**	
     * The following method is to ensure that all inputs except for the first parameter are filled.	
     * This is to ensure there are no errors for the calculation methods.	
     * The method is expected to return true in the case that the first parameter is blank and the	
     * other text fields are occupied.	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * The array structure should be as follows:
     * 1. Time
     * 2. Distance
     * 3. Initial Velocity
     * 4. Final Velocity
     * @return String with the calculated result or error message.	
     */	
    public String findEquationLMnA(String arrayOfInputs[]){
        switch(findBlankInArray(arrayOfInputs)){
            case 0: return solveForTimeLMnA(arrayOfInputs);
            case 1: return solveForDistanceLMnA(arrayOfInputs);
            case 2: return solveForInitialVelocityLMnA(arrayOfInputs);
            case 3: return solveForFinalVelocityLMnA(arrayOfInputs);
            default: return "Sorry please check your input.";
        }
    }
    
    /**	
     * Method to solve for missing solveForTimeLMnA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForTimeLMnA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        //double time = Double.parseDouble(arrayOfInputs[0]);   //Not Used for this function.
        double distance = Double.parseDouble(arrayOfInputs[1]); 
        double initialVelocity = Double.parseDouble(arrayOfInputs[2]);	
        double finalVelocity = Double.parseDouble(arrayOfInputs[3]);

        //Math for solving said problem	
        double solution = ((2*distance)/(initialVelocity + finalVelocity));	
        return Double.toString(solution);
    }

    /**	
     * Method to solve for missing solveForTimeLMnA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForDistanceLMnA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double time = Double.parseDouble(arrayOfInputs[0]);	
        //double distance = Double.parseDouble(arrayOfInputs[1]);    //Not Used for this function. 
        double initialVelocity = Double.parseDouble(arrayOfInputs[2]);	
        double finalVelocity = Double.parseDouble(arrayOfInputs[3]);

        //Math for solving said problem	
        double solution = (((initialVelocity+finalVelocity)/2)*time);	
        return Double.toString(solution);
    }

    /**	
     * Method to solve for missing solveForTimeLMnA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForInitialVelocityLMnA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double time = Double.parseDouble(arrayOfInputs[0]);	
        double distance = Double.parseDouble(arrayOfInputs[1]);
        //double initialVelocity = Double.parseDouble(arrayOfInputs[2]);    //Not Used for this function. 	
        double finalVelocity = Double.parseDouble(arrayOfInputs[3]);
               
        //Math for solving said problem	
        double solution = (((2*distance)/time)-finalVelocity);	
        return Double.toString(solution);
    }

    /**	
     * Method to solve for missing solveForTimeLMnA through adjusted Kinematic equation.
     * Equation: 	
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForFinalVelocityLMnA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        double time = Double.parseDouble(arrayOfInputs[0]);	
        double distance = Double.parseDouble(arrayOfInputs[1]); 
        double initialVelocity = Double.parseDouble(arrayOfInputs[2]);	
        //double finalVelocity = Double.parseDouble(arrayOfInputs[3]);    //Not Used for this function.
        
        //Math for solving said problem	
        double solution = (((2*distance)/time)-initialVelocity);	
        return Double.toString(solution);
    }
}