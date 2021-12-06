package practice;

public class Student {
    int c;
    static int b;

    Student () {
        b++;
    }

    public void showData() {
        System.out.println("Value of a = " + c);
        System.out.println("Value of b = " + b);
    }
}

