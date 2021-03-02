import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
class ConversionTest {
    Random rand = new Random();
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
}