public class Main {
    public static void main(String[] args) {
        System.out.println(getGenerator().cond(1));
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return number -> number.intValue() >= 0;
    }
}