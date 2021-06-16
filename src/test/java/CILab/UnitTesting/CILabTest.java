package CILab.UnitTesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    /* this test is for true example */
    public void detectCapitalUseTest1() {
    	myString.setString("Correct");
    	assertTrue(myString.detectCapitalUse());
    }
    @Test
    /* this test is for false example */
    public void detectCapitalUseTest2() {
        myString.setString("INcoRReCt");
        assertTrue(myString.detectCapitalUse());
    }


}
