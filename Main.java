public class Main{
    enum CoffeeSize{
        SMALL(250),
        MEDIUM(350),
        LARGE(500);

        private final int ml;

        private CoffeeSize(int ml) {
            this.ml = ml;
        }

        public int getMl(){
            return this.ml;
        }

        
        
    }

    public static void main(String[] args) {
        CoffeeSize size = CoffeeSize.MEDIUM;
        System.out.println(size.getMl());
    }
}