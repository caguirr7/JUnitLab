package JUnitLab;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {

    private GradeBook g1;
    private GradeBook g2;

    //Select the setUp and tearDown method

    /*
    In the setUp method of GradeBookTester, create at least two
    objects of Gradebook of 5.
    Call the addScore method for each of the Gradebook
    classes at least twice(but no more than 5 times)
     */
    @Before
    public void setUp() {
        g1 = new GradeBook(2);
        g1.addScore(100);
        g1.addScore(90);

        g2 = new GradeBook(5);
        g2.addScore(88);
        g2.addScore(57);
        g2.addScore(48);
        g2.addScore(97);
        g2.addScore(12);
    }

    /*In the teardown method of GradebookTester,
     set the two objects of Gradebook to null
     */
    @After
    public void tearDown() {
        g1 = null;
        g2 = null;
    }

    /*
     * Select all of the methods of Gradebook, except for the
     * constructor to create tests for
     */

    @Test
    public void testAddScore() {



        assertTrue(g1.toString().equals("100.0 90.0"));
        assertTrue(g2.toString().equals("88.0 57.0 48.0 97.0 12.0"));

        assertEquals(2, g1.getScoreSize(), .001);
        assertEquals(5, g2.getScoreSize(), .001);


    }
    /*
     Compare what is returned by sum()
     to the expected sum of the scores entered
     */

    @Test
    public void testSum() {

        assertEquals(190, g1.sum(), .0001);
        assertEquals(302, g2.sum(), .0001);
    }

    /*
    Compare what is returned by minimum() to
    the expected minimum of the scores entered.
     */
    @Test
    public void testMinimum() {

        assertEquals(90, g1.minimum(), .001);
        assertEquals(12, g2.minimum(), .001);

    }

    /*
    Compare what is returned by finalScore() to the expected
    final score of the scores entered
     */
    @Test
    public void testFinalScore() {

        assertEquals(100.0, g1.finalScore(), .001);
        assertEquals(290.0, g2.finalScore(), .001);

    }

}