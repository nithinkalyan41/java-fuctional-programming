package Lamda;

public class Main {
    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public void message() {
//
//            }
//        }
        String name = "Iam";
        char symbol = '!';
        MyInterface myInterface = (x,y) -> {
            System.out.println("HELLO WORLD");
            System.out.println(x+" good"+y);
        };
        MyInterface myInterface1 = (x,y) ->{
            System.out.println("HELLO "+x+y);
        };
        myInterface.message(name,symbol);
        System.out.println();
        myInterface1.message(name,symbol);
    }
}
