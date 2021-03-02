/***
 * Clase encargada de realizar la transformaicón de notacion intfix a postfix
 */


public class Conversion {
    ReaderTxt rTxt = new ReaderTxt();


    private String file1;
    private String file2;



    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    public String getFile2() {
        return file2;
    }

    public void setFile2(String file2) {
        this.file2 = file2;
    }




    private void makeChar(String file1){
        char[] charArray=file1.toCharArray();
    }

    private void makeChar2(String file2){
        char[] charArray=file2.toCharArray();
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

    private boolean isOrder(char op){
        return switch (op){
            case '(' -> true;
            case ')' -> true;
            default -> false;
        };
    }

    private boolean isNum(char op){
        return switch (op){
            case '0' -> true;
            case '1' -> true;
            case '2' -> true;
            case '3' -> true;
            case '4' -> true;
            case '5' -> true;
            case '6' -> true;
            case '7' -> true;
            case '8' -> true;
            case '9' -> true;
            default -> false;
        };
    }
}
