package interview;


/**
 * 输出菱形：参数n（直径）控制菱形的尺寸
 */

import java.util.Scanner;

/**
 * 坐标化打印菱形
 */
public class Diamond {
    public static void printDiamond(int diameter) {
        if (diameter % 2 == 0) {
            System.out.println("please input an odd number!");
            return;
        }
        //计算菱形的半径
        int radius = diameter / 2;
        //i控制纵向打印：从上往下打印
        for (int i = radius; i >= -radius; i--) {
            //j控制横向打印：从左往右打印
            for (int j = -radius; j <= radius; j++) {
                //如果横纵坐标值之和刚好等于半径，说明点刚好在菱形的边界上
                if (Math.abs(i) + Math.abs(j) <= radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Please input an odd number: ");
            n = sc.nextInt();
        } while (n < 0 || n % 2 == 0);
        printDiamond(n);
    }
}
