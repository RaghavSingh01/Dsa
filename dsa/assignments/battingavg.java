package assignments;

public class battingavg {
    public static void main(String[] args) {
        int runs = 400; 
        int timesout = 3;
        int avg = avg(runs, timesout);
        System.out.println(avg);
    }
    static int avg(int runs, int timesout){
        int batavg = runs / timesout;
        return batavg;
    }
}
