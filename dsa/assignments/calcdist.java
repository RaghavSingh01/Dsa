package assignments;

public class calcdist {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 4;
        int x2 = 6;
        int y2 = 8;
        double distance = calculate_distance(x1, x2, y1, y2);
        System.out.println(distance);
    }
    static double calculate_distance(int x1, int x2, int y1, int y2){
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return dist;
    }
}
