using System;

class Program
{
    static void Main()
    {
        int n = 0;
        Console.Write("full bottles: ");
        n = int.Parse(Console.ReadLine());

        int m = 0;
        Console.Write("empty bottles for exchange: ");
        m = int.Parse(Console.ReadLine());

        int mc = n;
        int mcount = n;
        int count = 0;
        int ost = 0;
        int drinkedBottles = 0;

        while (mcount > 0)
        {
            Console.WriteLine(new string('F', n));
            drinkedBottles += n;
            count++;
            mc = n + ost;
            Console.WriteLine(new string('E', mc));
            ost = mc % m;
            n = mc / m;
            count++;
            mc = ost;
            mcount = n;
        }

        Console.WriteLine(drinkedBottles + " " + (count - 1));
    }
}
