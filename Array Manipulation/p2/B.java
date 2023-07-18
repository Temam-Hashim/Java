package p2;

import java.util.*;
import p1.*;

public class B extends A {
    B get() {
        return this;
    }

    public void message() {
        System.out.println("welcome to coovarent class");
    }

    public int[] randomArray(int n) {

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * 99);
            arr[i] = random;
        }
        return arr;
    }

    public static void main(String[] args) {
        B a = new B();
        a.setA(10);
        a.setB(20);
        System.out.println(a.getA() + "+" + a.getB() + " = " + a.add());

        System.out.println("Random Array:\n" + Arrays.toString(a.randomArray(10)));

    }

}
