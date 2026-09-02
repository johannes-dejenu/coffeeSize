public class Main{
    enum CoffeeSize{
        SMALL(250, 25),
        MEDIUM(350, 40),
        LARGE(500, 50);

        private final int ml;
        private final int price;

        CoffeeSize(int ml, int price) {
            this.ml = ml;
            this.price = price;
        }

        public int getMl(){
            return this.ml;
        }  
        public int getPrice(){
            return price;
        } 
    }

    public static void main(String[] args) {
        // CoffeeSize size = CoffeeSize.MEDIUM;
        // System.out.println(size.getMl());

        for (CoffeeSize size : CoffeeSize.values()){
            System.out.println(size + " -> ml = " + size.getMl() + ", price = " + size.getPrice());
        }
    }
}