import java.util.Stack;

/***
 * Clase encargada de realizar la transformaicón de notacion intfix a postfix
 */


public class Conversion{
    ReaderTxt rTxt = new ReaderTxt();
    SimpleChain sc = new SimpleChain();
    private String iS;
    private Stack s;
    private String file1;
/*
    public String intToPost(char charArray[]){

        for (int i=0; i>charArray.length;i++){
            if (isOrder(charArray[i])==true){
                charArray[i]=' ';
            }else if(isOp(charArray[i])){

            }else if (isNum(charArray[i])){

            }
        }

        String str = String.valueOf(charArray);
        return str;
    }

    private void lista(char charArray[]){

        char[] stack={};
        char[] exit={};
        sc.addFirst(charArray);
        sc.addLast(stack);
        sc.addLast(exit);
    }
    private void makeChar(String file1){
        char[] charArray=file1.toCharArray();
    }
*/

    public String PostfixEval(String file1){
        iS = file1;
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
        return outputString;
    }


    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }



    private boolean isOp(char op){
        return switch (op) {
            case '+' -> true;
            case '-' -> true;
            case '/' -> true;
            case '*' -> true;
            case '^' -> true;
            default -> false;
        };
    }
    private boolean pMin(char op){
        return switch (op){
          case '+' -> true;
          case '-' -> true;
          default -> false;
        };
    }

    private boolean mDiv(char op){
        return switch (op){
            case '*' -> true;
            case '/' -> true;
            default -> false;
        };
    }

    private boolean isOrd(char op){
        return switch (op){
            case '(' -> true;
            case ')' -> true;
            default -> false;
        };
    }

}
