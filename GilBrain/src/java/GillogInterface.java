package java;

import java.util.Date;

public interface GillogInterface {

    // constant
    int level = 1;

    // abstract method
    abstract int develop(boolean choice);

    // default method
    default void gillog(Date date) {
        System.out.println(date + " 날짜의 글 생성");
    }

    // static method
    static int levelup(int level) {
        int levelup = level + 1;
        return levelup;
    }

}