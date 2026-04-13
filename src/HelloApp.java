public class HelloApp {
    public static void greetAll(String[] names) {
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            greetAll(new String[]{"World"});
        } else {
            greetAll(args);
        }
    }
}