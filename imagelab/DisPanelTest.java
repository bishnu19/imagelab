package imagelab;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DisPanelTest {
    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        testPanel = new DispPanel(mandel.jpg);
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
    }

    @Test
    public void imageConstructorTypeTest(){
        assertTrue(testPanel.img instanceof Image);
    }

    @Test
    public void paintTest(){
        assertTrue(testPanel.g instanceof Graphics);
        assertTrue(testPanel.img instanceof Image);
    }

    @Test
    public void newImageTypeTest(){
        testPanel.newImage(hiroshige.gif);
        assertTrue(testPanel.img instance of Image);
    }
}
