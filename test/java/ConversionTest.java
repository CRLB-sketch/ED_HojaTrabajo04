import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.util.Stack;

class ConversionTest {
    Conversion conv = new Conversion();
    Random rand = new Random();
    private Stack s;
    @org.junit.jupiter.api.Test
    void isOp() {
        char op='1';
         switch (op) {
            case '+' -> System.out.println("True");
            case '-' -> System.out.println("True");
            case '/' -> System.out.println("True");
            case '*' -> System.out.println("True");
            case '^' -> System.out.println("True");
            default -> System.out.println("false");
        };
    }

    @org.junit.jupiter.api.Test
    void makeChar(){
        String x="(0+1*2)";
        char[] charArray=x.toCharArray();
        for (char c:charArray){
            System.out.println(c);
        }
    }




    @org.junit.jupiter.api.Test
    void IntToPost(){
        String xd="(1+2)*9";
        String res=conv.intToPost(xd);
        String esperado="1 2 9 + *";
        System.out.println(res);
        //assertEquals(esperado, res);

    }

    
    /** 
     * @param op
     * @return boolean
     */
    private boolean isOp(char op){
        switch(op){
            case '+':
                return true;
            case '-':
                return true;
            case '/':
                return true;
            case '*':
                return true;
            case '^':
                return true;
            default:
                return false;
        }
    }



    
    /** 
     * @param op
     * @return boolean
     */
    private boolean isOrd(char op){
        return switch (op){
            case '(' -> true;
            case ')' -> true;
            default -> false;
        };
    }
}