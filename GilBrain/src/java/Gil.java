package purejava;

@FunctionalInterface
interface Gil {
    int log(int a, int b);
}

class Gillog {
    public void logging(Gil gil) {
        int number = gil.log(3, 4);
        System.out.println("logging is " + number);
    }
}

