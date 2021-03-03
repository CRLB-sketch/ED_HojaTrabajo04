import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.util.Stack;

class ConversionTest {
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
    void PostfixEval(){
        String iS = "(2+3)*2";
        s = new Stack();
        String outputString = "";
        boolean fI = false;
        for(int i = 0;i < iS.length();i++){
            char curChar = iS.charAt(i);
            if (isOrd(curChar)){
                curChar=' ';
            }
            if(!isOp(curChar)){
                outputString += Character.toString(curChar);
                if(i == (iS.length()-1)){
                    while(!s.empty()){
                        outputString += s.pop();
                    }
                }
            }else{
                if(fI){
                    if(pMin(curChar) && pMin((Character)s.peek())){
                        outputString += s.pop();
                        s.push(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }else if(mDiv(curChar) && mDiv((Character)s.peek())){
                        outputString += s.pop();
                        s.push(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }else if(pMin(curChar) && mDiv((Character)s.peek())){
                        outputString += s.pop();
                        s.push(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }else if(mDiv(curChar) && pMin((Character)s.peek())){
                        s.push(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }else{
                        outputString += Character.toString(curChar);
                        if(i == (iS.length()-1)){
                            while(!s.empty()){
                                outputString += s.pop();
                            }
                        }
                    }
                }else{
                    s.push(curChar);
                    fI = true;
                }
            }
        }
        System.out.println(outputString);
    }



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

    private boolean pMin(char op){
        switch(op){
            case '+':
                return true;
            case '-':
                return true;
            default:
                return false;
        }
    }

    private boolean mDiv(char op){
        switch(op){
            case '*':
                return true;
            case '/':
                return true;
            default:
                return false;
        }
    }

    private boolean isOrd(char op){
        return switch (op){
            case '(' -> true;
            case ')' -> true;
            default -> false;
        };
    }
}