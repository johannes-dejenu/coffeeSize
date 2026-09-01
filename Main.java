public class Main{
    enum coffeeSize{
        SMALL,
        MEDIUM,
        LARGE
    }

    public static void main(String[] args) {
        coffeeSize size = coffeeSize.MEDIUM;
        switch (size){
            case SMALL -> System.out.println("small coffee.");
            case MEDIUM -> System.out.println("medium coffee.");
            case LARGE -> System.out.println("large coffee.");
        }
    }
}