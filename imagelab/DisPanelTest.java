package imagelab;
import java.awt.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class DisPanelTest {
    public DisPanel testPanel;
    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        Toolkit toolkit;
        toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("mandel.gif");
        testPanel = new DisPanel(image);
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
    }

    @Test
    public void imageConstructorTypeTest(DisPanel panel){
        assertTrue(testPanel instanceof DisPanel);
    }

    @Test
    public void newImageTest() {
        Toolkit toolkit;
        toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("mandel.gif");
        DisPanel testPanel;
        testPanel = new DisPanel(image);
        assertTrue(testPanel.img instanceof Image);
        Image imageTwo = toolkit.getImage("AHEC.jpg");
        testPanel.newImage(imageTwo);
        assertTrue(testPanel.img instanceof Image);
    }


}
