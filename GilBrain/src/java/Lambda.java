package purejava;

public class Lambda {
    public static void main(String[] args) {
        Gillog gilLog = new Gillog();
        gilLog.logging(new Gil() {
            public int log(int a, int b) {
                System.out.println("This is Gil");
                System.out.println("I'm doing GilLog");
                System.out.println("parameter number is " + a + "," + b);
                return a + b;
            }
        });

        Gillog gilLogLambda = new Gillog();
        gilLogLambda.logging((a, b) -> {
            System.out.println("This is Gil Lambda");
            System.out.println("I'm doing GilLog Lambda");
            System.out.println("parameter number is " + a + "," + b);
            return a + b;
        });

    }
}
