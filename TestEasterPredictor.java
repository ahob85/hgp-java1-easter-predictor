
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

/**
 * The test class TestEasterPredictor.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestEasterPredictor
{
    /**
     * Default constructor for test class TestEasterPredictor
     */
    public TestEasterPredictor()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testEasterPredictor() 
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        
        // action
        EasterPredictor.main(null);
        
        // assertion
        assertTrue(bos.toString().contains("In 2003, Easter falls on 4/20.\n"));
        
        // undo the binding in System
        System.setOut(originalOut);
    }
}
