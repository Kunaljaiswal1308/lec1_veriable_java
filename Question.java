//Question 1

// import java.util.Scanner;

// public class Question{
//     public static void main(String args[]) {
//          Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();
//         int average = (A +B + C) / 3;
//         System.out.println(average);
//     }
// }


// import java.util.*;
// public class Question{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int side = sc.nextInt();
//         int area = side * side ;
//         System.out.println(area);
//     }
// }

import java.util.*;
public class Question{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println(total);
        // Add 18% gst tax
        float newtotal = total + (0.18f*total);
        System.out.println(newtotal);


    }
}