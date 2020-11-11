package purejava;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableAndComparatorExample {

    // Comaprable interface를 implements 해준다.
    // 이때 제너릭 타입은 Student Class를 설정 한다.
    static class Student implements Comparable<Student> {
        String name;
        int stuNo;
        double score;

        Student(String name, int stuNo, double score) {
            this.name = name;
            this.stuNo = stuNo;
            this.score = score;
        }

        // compareTo method를 override해준다.
        // 학번을 기준으로 정렬한다.
        @Override
        public int compareTo(Student compareStudent) {
            // 학번을 통한 정렬, 오름 차순
            // 앞에가 크면 1, 같으면 0, 작으면 -1 return
            int result = Integer.compare(stuNo, compareStudent.stuNo);
            return result;
        }
    }

    public static void main(String[] args) {
        Student student[] = new Student[4];

        student[0] = new Student("길록", 20140151, 3.5);
        student[1] = new Student("이후배", 20150001, 4.5);
        student[2] = new Student("강선배", 20110001, 3.5);
        student[3] = new Student("홍회장", 20130001, 2.8);

        // 정렬 전 출력 순서는 입력 순서대로 나온다.
        for (Student stu : student) {
            System.out.println("이름 : " + stu.name + ", 학번 : " + stu.stuNo + ", 학점 : " + stu.score);
        }

        System.out.println();

        // Quick Sort
        // Student Class는 Comparable interface에서 compareTo method를 구현해주어
        // 학번순으로 정렬해준다.

        // 만약 Student Class가 Comparable을 implements 해주지 않고 적용하려면 complie error가 발생한다.
        // Arrays.sort()는 compareTo method를 호출해서 정렬을 사용한다.
        Arrays.sort(student);

        // 출력 결과로 학번 순으로 정렬해준다.
        for (Student stu : student) {
            System.out.println("이름 : " + stu.name + ", 학번 : " + stu.stuNo + ", 학점 : " + stu.score);
        }

        System.out.println();

        // comparator Class를 익명 Class로 구현하여
        // 정렬 기준을 Customize 해준다.
        // 학점을 통해 정렬을 다시 수행해준다.
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                double s1Score = s1.score;
                double s2Score = s2.score;
                if (s1Score == s2Score) { // 학점이 같으면
                    return Double.compare(s1.stuNo, s2.stuNo); // 학번 오름차순
                }
                return Double.compare(s2Score, s1Score);// 학점 내림차순
            }
        });

        // 출력 결과로 학번 순으로 정렬된 데이터에
        // 학점 정렬을 추가로 수행하여 출력한다.
        for (Student stu : student) {
            System.out.println("이름 : " + stu.name + ", 학번 : " + stu.stuNo + ", 학점 : " + stu.score);
        }
    }
}
