import java.util.*;
class Number{
    int x = 10;
}
public class test {
    public static void main(String[] args) {
            Number n1 = new Number();
            n1.x = 100;

        Number n2 = new Number();
        n2.x = 100;

        int x1 = n1.x;
        int x2 = n2.x;
        System.out.println(x1 +"   "+n1);
        System.out.println(x2+"   "+n1);
        System.out.println(n1 == n2);
    }
}
