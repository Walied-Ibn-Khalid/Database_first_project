import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        Date now = new Date();
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "  Hello World"+"!!";
        boolean messageEnds= message.endsWith("!!");
        System.out.println(messageEnds);
        int length = message.length();
        System.out.println(length);
        int letterNumber = message.indexOf('W');
        System.out.println(letterNumber);
        String newMessage = message.replace("!","*");
        System.out.println(newMessage);
        String cleanMessage = newMessage.trim();
        System.out.println(cleanMessage);

        int [] numbers ={2,3,5,1,4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[][] numbers_2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers_2));

        final float PI = 3.14F;
        double result = (double) 10 / 3;
        System.out.println(result);


        //Implicit casting
        // byte > short > int > long > float > double
        double x = 1.1;
        int y = (int)x + 2; // Explicit casting from double to int
        System.out.println(y);

        // Casting or changing a string to a number
        String z = "1";
        double a = Double.parseDouble(z) + 2;
        System.out.println(a);

        int mathmatic  = (int) (Math.random() * 100);
        System.out.println(mathmatic);


        String result_2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result_2);

    }
}

// edit
