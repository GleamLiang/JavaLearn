package interview;


import java.util.Arrays;
import java.util.Random;

/**
 * @Author: WangGuangliang
 * @Description: 数组排序Demo
 * @Date: 2021/9/17
 */

public class ArraySort {
    /*
     * @Author: WangGuangliang
     * @Description: 生成n位的随机数组（元素为0~9的整数）
     * @Date: 2021/9/17 15:46
     * @Param: [len]
     * @return: int[]
     **/
    public static int[] genRandAry(int len) {
        int[] ary = new int[len];
        Random rd = new Random();
        int n = 0;
        while (n < len) {
            ary[n] = rd.nextInt(10);
            n++;
        }
        return ary;
    }

    /*
     * @Author: WangGuangliang
     * @Description: 冒泡排序(从小到大排序)
     * 从左到右逐个比较相邻的两个元素，满足“左边的值>右边的值”就交换位置。
     * @Date: 2021/9/17 16:16
     * @Param: [ary]
     * @return: int[]
     **/
    public static int[] bubbleSort(int[] ary) {
        int num = 0;
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = 0; j < ary.length - 1 - i; j++) {
                if (ary[j] > ary[j + 1]) {
                    int tmp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = tmp;
                }
                num++;
                System.out.printf("casting %d - %d: %s%n", i, j, Arrays.toString(ary));
            }
        }
        System.out.println("total num: " + num);
        return ary;
    }

    /*
     * @Author: WangGuangliang
     * @Description: 选择排序(从小到大排序)
     * 假定左边第一位数是最小值，右边的值逐个和“最小值”比较大小，满足“右边的值<最小值”就交换位置。
     * @Date: 2021/9/17 17:16
     * @Param: [ary]
     * @return: int[]
     **/
    public static int[] selectSort(int[] ary) {
        int num = 0;
        for (int i = 0; i < ary.length - 1; i++) {
            int min_value = ary[i];
            for (int j = i + 1; j <= ary.length - 1; j++) {
                if (ary[j] < min_value) {
                    int tmp = ary[j];
                    ary[j] = min_value;
                    min_value = tmp;
                }
                num++;
                System.out.printf("casting %d - %d: %s%n", i, j, Arrays.toString(ary));
            }
            ary[i] = min_value;
        }
        System.out.println("total num: " + num);
        return ary;
    }

    /*
     * @Author: WangGuangliang
     * @Description: 插入排序(从小到大排序)
     * 从位置1开始向右迭代元素，和前面的元素逐个比较大小（若小于前值就交换位置，否则结束本轮比较）。
     * @Date: 2021/9/17 15:25
     * @Param: [ary]
     * @return: int[]
     **/
    public static int[] insertSort(int[] ary) {
        int num = 0;
        for (int i = 1; i < ary.length; i++) {
            int tmp = ary[i];
            for (int j = i - 1; j >= 0; j--) {
                if (tmp >= ary[j]) {
                    break;
                } else {
                    ary[j + 1] = ary[j];
                    ary[j] = tmp;
                }
                num++;
                //System.out.printf("casting %d - %d: %s%n", i, j, Arrays.toString(ary));
            }
        }
        System.out.println("total num: " + num);
        return ary;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] ary = genRandAry(n);
        //int[] ary = {6, 4, 1, 6, 2, 1, 0, 9, 1, 9};
        System.out.println("old: "+ Arrays.toString(ary));
        //ary = bubbleSort(ary);
        //ary = selectSort(ary);
        ary = insertSort(ary);
        System.out.println("new: " + Arrays.toString(ary));
    }
}
