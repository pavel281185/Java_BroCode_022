public class Main {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
//        String name = "Tomas";
//        int age = 32;
//        hello("Pavel", age);
//        hello(name, age);
        int x = 3;
        int y = 4;

        System.out.println(secti(x, y));
    }
//    static void hello(String parameter, int cokoliv){
//        System.out.println(parameter + " je starý " + cokoliv);
//    }

    static int secti(int a, int b){
        return a + b;
    }
}