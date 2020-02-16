package JavaFiles.Tests;
import JavaFiles.src.KinematicEquationSolver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KinematicEquationSolverTest {

    // Input arrays for testing
    String[] mockInputArrayFour = {"1","2","3","4"};
    String[] mockInputArrayFive = {"1","2","3","4","5"};
    KinematicEquationSolver mockSolver = new KinematicEquationSolver();

    @Test
    void Test_solveForFinalVelocityLMnD(){
        assertEquals("5.0",mockSolver.solveForFinalVelocityLMnD(mockInputArrayFour));
    }

    @Test
    void findEquationLMnD() {
    }

    @Test
    void solveForFinalVelocityLMnD() {
    }

    @Test
    void solveForInitialVelocityLMnD() {
    }

    @Test
    void solveForTimeLMnD() {
    }

    @Test
    void solveForAccelerationLMnD() {
    }

    @Test
    void findEquationLMcA() {
    }

    @Test
    void findEquationLMnVF() {
    }

    @Test
    void findEquationLMnA() {
    }
}
