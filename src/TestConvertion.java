import junit.framework.TestCase;

public class TestConvertion extends TestCase {
    
    private Conversion conv;

    public TestConvertion(){
        conv = new Conversion();
    }

    public void testInfixToPostfix(){
        String actual = conv.intToPost("1+2*9");
        String expected = "1 2 9 * +";

        assertEquals(expected, actual);
    }

}
