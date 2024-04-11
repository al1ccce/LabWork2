using System;

public class Program{
    public static bool WhatTimeIsIt(int number){
        int hours = number / 100;
        int minutes = number % 100;
        return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
    }

    public static void YesOrNo(int number, int n){
        if (WhatTimeIsIt(number)){
            Console.WriteLine("YES");
        }
        else
        {
            Console.WriteLine("NO");
        }
    }

    public static void Main(){
        Console.Write("n = ");
        int n = int.Parse(Console.ReadLine());

        for (int i = 0; i < n; i++){
            Console.Write("Enter the number: ");
            int x = int.Parse(Console.ReadLine());
            YesOrNo(x, n);
        }
    }
}
