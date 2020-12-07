package java;

public class ControlStatement {

    public static void main(String[] args) {

        int myAge = 26;

        int otherGuyAge = 29;

        if (myAge < otherGuyAge) {
            System.out.println("형!");
        }

        if (myAge < otherGuyAge) {
            System.out.println("형!");
        } else if (myAge == otherGuyAge) {
            System.out.println("친구야!");
        } else {
            System.out.println("야!");
        }

        switch (myAge) {
            case 19:
                System.out.println("고3");
                break;
            case 20:
                System.out.println("대학생");
                break;
            case 21:
                System.out.println("군대");
                break;
            default:
                System.out.println("미설정");
                break;
        }

        for (int i = 0; i < 27; i++) {
            System.out.println(i);
        }
    }
}
