public class Main {
    public static void main(String[] args) {
        new Main().exist();
    }

    private void exist() {
        System.out.println("Hello!");

        for (int i = 0; i < 10; i++) {
            System.out.println(i+")World");
        }
    }
}