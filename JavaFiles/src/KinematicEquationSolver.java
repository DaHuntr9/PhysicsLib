package JavaFiles.src;

/**	
 * Kinematic Equation Solver to solve equations.
 */	
public class KinematicEquationSolver implements CalculationTools{

    /**	
     * This section is for the following Kinematic Equation: Vf = Vi+a*t
     * 
     * The following method uses findBlankInArray() from CalculationTools to check 
     * if there is only one location in the array that is blank. findBlankInArray() 
     * will return the location in the array where it is blank,if not then it will 
     * return a -1. The default case returns a error message if any unexpected 
     * values are returned. 
     * 
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * The array structure should be as follows:
     * 1. Time
     * 2. Acceleration
     * 3. Initial Velocity
     * 4. Final Velocity
     * @return String with the calculated result or error message.
     */	
    public String findEquationLMnD(String[] arrayOfInputs){
        switch(findBlankInArray(arrayOfInputs)){
            case 0: return solveForTimeLMnD(arrayOfInputs);
            case 1: return solveForAccelerationLMnD(arrayOfInputs);
            case 2: return solveForInitialVelocityLMnD(arrayOfInputs);
            case 3: return solveForFinalVelocityLMnD(arrayOfInputs);
            default: return "Sorry please check your input.";
        }
    }	

    /**	
     * solveForFinalVelocityLMnD is a method to solve for missing Final Velocity through 
     * the following adjusted Kinematic Equation. 	
     * Equation: Vf = Vi+a*t
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    public String solveForFinalVelocityLMnD(String[] arrayOfInputs){
        //Conversions from String to Double.	
        double time = Double.parseDouble(arrayOfInputs[0]);
        double acceleration = Double.parseDouble(arrayOfInputs[1]);		
        double initialVelocity = Double.parseDouble(arrayOfInputs[2]);		

        // Math for solving said problem	
        double solution = (initialVelocity + (time*acceleration));	
        return Double.toString(solution);	
    }	

    /**	
     * solveForInitialVelocityLMnD is a method to solve for missing Initial Velocity through 
     * the following adjusted Kinematic Equation. 	
     * Equation: Vi = (a*t)-Vf
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    public String solveForInitialVelocityLMnD(String[] arrayOfInputs){
        //Conversions from String to Double.	
        double time = Double.parseDouble(arrayOfInputs[0]);	
        double acceleration = Double.parseDouble(arrayOfInputs[1]);	
        double finalVelocity = Double.parseDouble(arrayOfInputs[3]);	

        // Math for solving said problem	
        double solution = ((acceleration*time) - finalVelocity);	
        return Double.toString(solution);	
    }	

    /**	
     * solveForTimeLMnD is a method to solve for missing Time through 
     * the following adjusted Kinematic Equation. 	
     * Equation: t = (Vf-Vi)/a
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    public String solveForTimeLMnD(String[] arrayOfInputs){
        //Conversions from String to Double.	
        double acceleration = Double.parseDouble(arrayOfInputs[1]);	
        double initialVelocity = Double.parseDouble(arrayOfInputs[2]);	
        double finalVelocity = Double.parseDouble(arrayOfInputs[3]);

        //Math for solving said problem	
        double solution = ((finalVelocity-initialVelocity)/acceleration);	
        return Double.toString(solution);	
    }	

    /**	
     * solveForAccelerationLMnD is a method to solve for missing Acceleration through 
     * the following adjusted Kinematic Equation. 	
     * Equation: a = (Vf-Vi)/t
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    public String solveForAccelerationLMnD(String[] arrayOfInputs){
        //Conversions from String to Double.	
        double time = Double.parseDouble(arrayOfInputs[0]);
        double initialVelocity = Double.parseDouble(arrayOfInputs[2]);	
        double finalVelocity = Double.parseDouble(arrayOfInputs[3]);	

        double solution = ((finalVelocity-initialVelocity)/time);	
        return Double.toString(solution);	
    }

    /**	
     *  This section is for the following Kinematic Equation: d=Vi*t1+((1/2)*a*t2^2)
     * 
     * The following method uses findBlankInArray() from CalculationTools to check 
     * if there is only one location in the array that is blank. findBlankInArray() 
     * will return the location in the array where it is blank,if not then it will 
     * return a -1. The default case returns a error message if any unexpected 
     * values are returned. 
     * 	
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
     public String findEquationLMcA(String[] arrayOfInputs){
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
     * solveForTimeOneLMcA is a method to solve for missing Time One through 
     * the following adjusted Kinematic Equation. 	
     * Equation: t1 = (d-((1/2)*a*(t2^2))/Vi)
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * @return String, solution to Equation	
     */	
    private String solveForTimeOneLMcA(String[] arrayOfInputs) {
        //Conversions from String to Double.
        //double TimeOne = Double.parseDouble(arrayOfInputs[0]);	
        double TimeTwo = Double.parseDouble(arrayOfInputs[1]);
        double acceleration = Double.parseDouble(arrayOfInputs[2]);	
        double initialVelocity = Double.parseDouble(arrayOfInputs[3]);	//Not Used for this funtion. 
        double distance = Double.parseDouble(arrayOfInputs[4]);	

        //Math for solving said problem	
        double solution = (distance-(0.5*acceleration*(TimeTwo * TimeTwo))/initialVelocity);	
        return Double.toString(solution);	
    }

    /**	
     * solveForTimeTwoLMcA is a method to solve for missing Time Two through 
     * the following adjusted Kinematic Equation. 	
     * Equation: t2 = sqrt((2 * (d - (Vi * t1))) / a)
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
     * solveForAccelerationLMcA is a method to solve for missing Acceleration through 
     * the following adjusted Kinematic Equation. 	
     * Equation: a = (2 * (d - (Vi * t1)) / (t2^2)
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
     * solveForInitialVelocityLMcA is a method to solve for missing Initial Velocity through 
     * the following adjusted Kinematic Equation. 	
     * Equation: Vi = (d-((1/2)*a*(t2^2)))/t1
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
     * solveForDistanceLMcA is a method to solve for missing Distance through 
     * the following adjusted Kinematic Equation. 	
     * Equation: d=Vi*t1+((1/2)*a*t2^2)
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
     * This section is for the following Kinematic Equation: Vf^2 = Vi^2 + 2*a*d
     * 
     * The following method uses findBlankInArray() from CalculationTools to check 
     * if there is only one location in the array that is blank. findBlankInArray() 
     * will return the location in the array where it is blank,if not then it will 
     * return a -1. The default case returns a error message if any unexpected 
     * values are returned. 
     * 
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * The array structure should be as follows:
     * 1. Initial Velocity
     * 2. Final Velocity
     * 3. Acceleration
     * 4. Distance
     * @return String with the calculated result or error message.	
     */	
    public String findEquationLMnVF(String[] arrayOfInputs){
        switch(findBlankInArray(arrayOfInputs)){
            case 0: return solveForInitialVelocityLMnVF(arrayOfInputs);
            case 1: return solveForFinalVelocityLMnVF(arrayOfInputs);
            case 2: return solveForAccelerationLMnVF(arrayOfInputs);
            case 3: return solveForDistanceLMnVF(arrayOfInputs);
            default: return "Sorry please check your input.";
        }
    }
    
    /**	
     * solveForInitialVelocityLMnVF is a method to solve for missing Initial Velocity through 
     * the following adjusted Kinematic Equation. 	
     * Equation: Vi = sqrt( ((-1) * (Vf^2)) + ((-1) * (2*a*d)))
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
        double solution = Math.sqrt((((-1)*(finalVelocity*finalVelocity))+((-1)*(2*acceleration*distance))));	
        return Double.toString(solution);
    }

    /**	
     * solveForFinalVelocityLMnVF is a method to solve for missing Final Velocity through 
     * the following adjusted Kinematic Equation. 	
     * Equation: Vf = sqrt((Vi^2) + (2*a*d))
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
     * solveForAccelerationLMnVF is a method to solve for missing Acceleration through 
     * the following adjusted Kinematic Equation. 	
     * Equation: a = sqrt( ((Vi^2) * (Vf^2)) / (2*d))	
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
     * solveForDistanceLMnVF is a method to solve for missing Distance through 
     * the following adjusted Kinematic Equation. 	
     * Equation: d = sqrt( ((Vi^2) * (Vf^2)) / (2*a))
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
     * This section is for the following Kinematic Equation: d = ((Vi+Vf)/2)*t 
     * 
     * The following method uses findBlankInArray() from CalculationTools to check 
     * if there is only one location in the array that is blank. findBlankInArray() 
     * will return the location in the array where it is blank,if not then it will 
     * return a -1. The default case returns a error message if any unexpected 
     * values are returned. 
     * 
     * @param arrayOfInputs is the array of all the inputs that the user provided in order to solve
     * the equation.
     * The array structure should be as follows:
     * 1. Time
     * 2. Distance
     * 3. Initial Velocity
     * 4. Final Velocity
     * @return String with the calculated result or error message.	
     */	
    public String findEquationLMnA(String[] arrayOfInputs){
        switch(findBlankInArray(arrayOfInputs)){
            case 0: return solveForTimeLMnA(arrayOfInputs);
            case 1: return solveForDistanceLMnA(arrayOfInputs);
            case 2: return solveForInitialVelocityLMnA(arrayOfInputs);
            case 3: return solveForFinalVelocityLMnA(arrayOfInputs);
            default: return "Sorry please check your input.";
        }
    }
    
    /**	
     * solveForTimeLMnA is a method to solve for missing Time through 
     * the following adjusted Kinematic Equation. 	
     * Equation: t = ((2*d)/(Vi+Vf))	
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
     * solveForDistanceLMnA is a method to solve for missing Distance through 
     * the following adjusted Kinematic Equation. 	
     * Equation: d = (((Vi+Vf)/2)*t)	
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
     * solveForInitialVelocityLMnA is a method to solve for missing Initial Velocity through 
     * the following adjusted Kinematic Equation. 	
     * Equation: Vi = (((2*d)/t)-Vf)	
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
     * solveForFinalVelocityLMnA is a method to solve for missing Final Velocity through 
     * the following adjusted Kinematic Equation. 	
     * Equation: Vf = (((2*d)/t)-Vi)	
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