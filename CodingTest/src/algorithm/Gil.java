package algorithm;

public class Gil {
    
    private static double gil(boolean choice){
        double development;
        development = choice ? 1.01 : 0.99;
        int oneYearDay = 365;
        return Math.pow(development, oneYearDay);
    }

    public static void main(String[] args) {
        System.out.println(gil(true));
    }
}
