package com.company;
import java.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        //////////////////////////////////////////////TASK_4/////////////////////////////////////////////////
        int[] arr = {12,32,44,33,55,876};
        int sum=0;
        for(int i: arr)//Считаем сумму чисел массива при помощи цикла for
        {
            sum+=i;
        }
        System.out.println("Сумма элементов массива посчитанная при помощи цикла for: "+sum);
        sum = 0;
        int for_while=5;
        while (for_while >=0)//Считаем сумму чисел массива при помощи цикла while
        {
            sum +=arr[for_while];
            for_while --;

        }
        System.out.println("Сумма элементов массива посчитанная при помощи цикла while: "+sum);
        sum = 0;
        int for_do_while=5;
        do//Считаем сумму чисел массива при помощи цикла do while
            {
                sum +=arr[for_do_while];
                for_do_while--;
            }while(for_do_while>=0);
        System.out.println("Сумма элементов массива посчитанная при помощи цикла do while: "+sum);
       //////////////////////////////////////////////TASK_4/////////////////////////////////////////////////
        for (String str: args)
            System.out.println(str);
        //////////////////////////////////////////////TASK_5/////////////////////////////////////////////////
        double item;
        System.out.println("Гармонический ряд - это сумма, составленная из бесконечного количества членов,состоит из членов, обратных числам натурального ряда и общий член которого имеет вид 1/n");
        System.out.println("Введите n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Первые 10 чисел Гармонического ряда: ");
        for (int i =0; i<10; i++)
        {
            item = 1.0/n;
            String res = String.format("%.3f",item);
            System.out.print(res+" ");
            n++;
        }
        System.out.println(" ");
        //////////////////////////////////////////////TASK_6/////////////////////////////////////////////////


        int[] mas = new int[10];
        for (int i=0; i<10;i++)
        {
            mas[i] = my_rnd();
            System.out.print(mas[i]+" ");
        }
        System.out.println("- массив сформированный при помощи метода random() класса Math");
        Arrays.sort(mas);
        for (int i=0; i<10;i++)
        {
            System.out.print(mas[i]+" ");
        }
        System.out.println("- массив после сортировки");
        System.out.println("///////////////////////////////////");
        Random rand = new Random();
        for (int i=0; i<10;i++)
        {
            mas[i] = rand.nextInt(100);
            System.out.print(mas[i]+" ");
        }
        System.out.println("- массив сформированный при помощи класса Random");
        Arrays.sort(mas);
        for (int i=0; i<10;i++)
        {
            System.out.print(mas[i]+" ");
        }
        System.out.println("- массив после сортировки");
        //////////////////////////////////////////////TASK_7/////////////////////////////////////////////////

        System.out.println("Введите число, факториал которого нужно вычислить: ");
        Scanner s = new Scanner(System.in);
        int numb = s.nextInt();
        System.out.println("Факториал числа "+numb+" равен: "+my_factorial(numb));
    }
    public static int my_rnd()
    {
        return (int)(Math.random()*100);
    }
    public static int my_factorial(int arg)
    {
        int result = 1;
        for(int i = 1; i<=arg;i++)
        {
            result=result*i;

        }
        return result;
    }

}
