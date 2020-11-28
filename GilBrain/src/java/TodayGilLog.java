package java;

public class TodayGilLog extends GilAbstractClass {

    // 추상 메소드를 구현하지 않으면
    // TodayGilLog Class도 추상 클래스가 된다.
    @Override
    public void think() {
        System.out.println("오늘은 뭐하지");
    }
}