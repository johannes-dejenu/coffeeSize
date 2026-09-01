public class Main{
    enum coffeeSize{
        SMALL,
        MEDIUM,
        LARGE
    }

    public static void main(String[] args) {
        coffeeSize size = coffeeSize.MEDIUM;
        System.out.println(size);
    }
}