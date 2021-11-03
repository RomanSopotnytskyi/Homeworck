package homework_2_3;

public class Homework_1 {

    public static void main(String[] args) {
        //1
        double a, b, w, q, r, l;
        a = 1;
        b = 2;
        w = 3;
        q = 4;
        r = 5;
        l = 6;
        var res = a+b*(w/q)*r+l;
        System.out.println("a+b(w/q)r+l=" + res );

        double v, i, z;
        v = 7;
        i = 8;
        z = 9;
        res = b+v-i*z;
        System.out.println("b+v-i*z=" + res );

        double x, y, c;
        x = 10;
        y = 11;
        c = 12;
        res = x+y+z*c;
        System.out.println("x+y+z*c=" + res );
        System.out.println();

        //2 hello world

        int b1 = (int)'H';
        System.out.print((char)b1);
        int b2 = (int)'e';
        System.out.print((char)b2);
        int b3 = (int)'l';
        System.out.print((char)b3);
        System.out.print((char)b3);
        int b4 = (int)'o';
        System.out.print((char)b4);
        System.out.print(' ');
        int b5 = (int)'W';
        System.out.print((char)b5);
        System.out.print((char)b4);
        int b6 = (int)'r';
        System.out.print((char)b6);
        System.out.print((char)b3);
        int b7 = (int)'d';
        System.out.println((char)b7);
        System.out.println();

        //3
        boolean result = 10 < 9;
        System.out.println("10 < 9 - " + result );

        result = 2 != 2;
        System.out.println("2 != 2 - " + result );

        result = 9 >= 8;
        System.out.println("9 >= 8 - " + result );
    }
}
