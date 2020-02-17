package JavaFiles.Tests;
import JavaFiles.src.KinematicEquationSolver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KinematicEquationSolverTest {

    // Input arrays for testing
    String[] mockInputArrayFour = {"1","2","3","4"};
    String[] mockInputArrayFive = {"1","2","3","4","5"};

    String[] mockMissingNone = {"1","2","3","4","5"};
    String[] mockMissingBoth = {"1","","3","","5"};
    String[] mockMissingOne = {"","2","3","4","5"};
    String[] mockMissingTwo = {"1","","3","4","5"};
    String[] mockMissingThree = {"1","2","","4","5"};
    String[] mockMissingFour = {"1","2","3","","5"};
    String[] mockMissingFive = {"1","2","3","4",""};

    KinematicEquationSolver mockSolver = new KinematicEquationSolver();


    /**
     * LMnD
     * Four inputs
     */
    @Test
    void findEquationLMnD() {
        assertEquals("-1",mockSolver.findEquationLMnD(mockMissingNone));
        assertEquals("",mockSolver.findEquationLMnD(mockMissingOne));
        assertEquals("",mockSolver.findEquationLMnD(mockMissingTwo));
        assertEquals("",mockSolver.findEquationLMnD(mockMissingThree));
        assertEquals("",mockSolver.findEquationLMnD(mockMissingFour));
        assertEquals("-1",mockSolver.findEquationLMnD(mockMissingBoth));

    }

    @Test
    void solveForFinalVelocityLMnD() {
        assertEquals("5.0",mockSolver.solveForFinalVelocityLMnD(mockInputArrayFour));
    }

    @Test
    void solveForInitialVelocityLMnD() {
        assertEquals("",mockSolver.solveForInitialVelocityLMnD(mockInputArrayFour));
    }

    @Test
    void solveForTimeLMnD() {
        assertEquals("", mockSolver.solveForTimeLMnD(mockInputArrayFour));
    }

    @Test
    void solveForAccelerationLMnD() {
        assertEquals("", mockSolver.solveForAccelerationLMnD(mockInputArrayFour));
    }

    /**
     * Tests the for the following LMcA equations.
     * Five inputs
     */
    @Test
    void findEquationLMcA() {
        assertEquals("-1",mockSolver.findEquationLMcA(mockMissingNone));
        assertEquals("",mockSolver.findEquationLMcA(mockMissingOne));
        assertEquals("",mockSolver.findEquationLMcA(mockMissingTwo));
        assertEquals("",mockSolver.findEquationLMcA(mockMissingThree));
        assertEquals("",mockSolver.findEquationLMcA(mockMissingFour));
        assertEquals("",mockSolver.findEquationLMcA(mockMissingFive));
        assertEquals("-1",mockSolver.findEquationLMcA(mockMissingBoth));
    }

    @Test
    void solveForTimeOneLMcA(){
        assertEquals("", mockSolver.solveForTimeOneLMcA(mockInputArrayFive));
    }

    @Test
    void solveForTimeTwoLMcA(){
        assertEquals("", mockSolver.solveForTimeTwoLMcA(mockInputArrayFive));
    }

    @Test
    void solveForAccelerationLMcA(){
        assertEquals("", mockSolver.solveForAccelerationLMcA(mockInputArrayFive));
    }

    @Test
    void solveForInitialVelocityLMcA(){
        assertEquals("", mockSolver.solveForInitialVelocityLMcA(mockInputArrayFive));
    }

    @Test
    void solveForDistanceLMcA(){
        assertEquals("", mockSolver.solveForDistanceLMcA(mockInputArrayFive));
    }

    /**
     * LMnVF
     * Four Inputs
     */
    @Test
    void findEquationLMnVF() {
        assertEquals("-1",mockSolver.findEquationLMnVF(mockMissingNone));
        assertEquals("",mockSolver.findEquationLMnVF(mockMissingOne));
        assertEquals("",mockSolver.findEquationLMnVF(mockMissingTwo));
        assertEquals("",mockSolver.findEquationLMnVF(mockMissingThree));
        assertEquals("",mockSolver.findEquationLMnVF(mockMissingFour));
        assertEquals("-1",mockSolver.findEquationLMnVF(mockMissingBoth));
    }

    @Test
    void solveForInitialVelocityLMnVF() {
        assertEquals("",mockSolver.solveForInitialVelocityLMnVF((mockInputArrayFour)));
    }

    @Test
    void solveForFinalVelocityLMnVF() {
        assertEquals("", mockSolver.solveForFinalVelocityLMnVF(mockInputArrayFour));
    }

    @Test
    void solveForAccelerationLMnVF() {
        assertEquals("", mockSolver.solveForAccelerationLMnVF(mockInputArrayFour));
    }

    @Test
    void solveForDistanceLMnVF() {
        assertEquals("", mockSolver.solveForDistanceLMnVF(mockInputArrayFour));
    }

    /**
     * LMnA Tests
     * Four Inputs
     */

    @Test
    void findEquationLMnA() {
        assertEquals("-1",mockSolver.findEquationLMnA(mockMissingNone));
        assertEquals("",mockSolver.findEquationLMnA(mockMissingOne));
        assertEquals("",mockSolver.findEquationLMnA(mockMissingTwo));
        assertEquals("",mockSolver.findEquationLMnA(mockMissingThree));
        assertEquals("",mockSolver.findEquationLMnA(mockMissingFour));
        assertEquals("-1",mockSolver.findEquationLMnA(mockMissingBoth));
    }

    @Test
    void solveForTimeLMnA() {
        assertEquals("", mockSolver.solveForTimeLMnA(mockInputArrayFour));
    }

    @Test
    void solveForDistanceLMnA() {
        assertEquals("", mockSolver.solveForDistanceLMnA(mockInputArrayFour));
    }

    @Test
    void solveForInitialVelocityLMnA() {
        assertEquals("", mockSolver.solveForInitialVelocityLMnA(mockInputArrayFour));
    }

    @Test
    void solveForFinalVelocityLMnA() {
        assertEquals("", mockSolver.solveForFinalVelocityLMnA(mockInputArrayFour));
    }
}