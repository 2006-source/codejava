public class random {
    public static void main(String[] args) {
        random mul = new random();
        int i=0;
        while(i<10){
            System.out.println(mul.run());
            i++;
        }
    }
    public static int run(){
         double random = Math.random()*6;
         return (int)Math.ceil(random);
    }
}
