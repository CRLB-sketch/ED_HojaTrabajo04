public class StackFactory {

    // Para crear la pila solicitada
    public static IStack<String> create(String type){

        switch (type) {
            case "ArrayList":
                return new StackArrayList<>();

            case "List":
                return new StackList<>();

            case "Vector":
                return new StackVector<>();
        
            default:
                return null;
        }
        
    }
}
