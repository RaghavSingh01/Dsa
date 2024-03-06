package assignments;

public class caldepric {
    public static void main(String[] args) {
        int cost = 11000;
        int salvage = 1000;
        int lifespan = 5;
        int result = depriciation(cost, salvage, lifespan);
        System.out.println(result);
    }
    static int depriciation(int c, int sal, int life){
         int dep = (c - sal)/ life;
         return dep;

    }
    
}
