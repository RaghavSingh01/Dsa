package assignments;

public class calccgpa {
    public static void main(String[] args) {
        int m1 = 70;
        int m2 = 80;
        int m3 = 79;
        int m4 = 89;
        int m5 = 95;
        int total = m1 + m2 + m3 + m4 + m5;
        int subs = 5;
        double result = cgpa(total, subs);
        System.out.println(result);

    }
    static double cgpa(int totalmarks , int subs){
        double perc = totalmarks / subs;
        double gpa = perc / 9.5;
        return gpa;
    }
    
}
