public class App {
    public static void main(String[] args) throws Exception {
        greeting("Hello World!");
        goodbye("Goodbye World!");
        test();
    }

    public static void greeting(String msg) {
        System.out.println(msg);
    }

    public static void goodbye(String msg) {
        System.out.println(msg);
    }

    public static void test() {
        System.out.println("Test");
    }

    public static void compliment(String msg) {
        System.out.println(msg);
    }

}
