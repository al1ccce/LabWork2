using System;
namespace ChessMoves
{
    class Program
    {
        static Tuple<int, int> Moves(string hodi, int n, int m)
        {
            foreach (char hod in hodi)
            {
                switch (hod)
                {
                    case 'L':
                        m--;
                        break;
                    case 'R':
                        m++;
                        break;
                    case 'D':
                        n++;
                        break;
                    case 'U':
                        n--;
                        break;
                    default:
                        Console.WriteLine(hod + " is undefined");
                        return Tuple.Create(-123, 0);
                }
            }
            return Tuple.Create(n, m);
        }

        static void Main(string[] args)
        {
            int n, m = 0;
            Console.Write("n = ");
            n = int.Parse(Console.ReadLine());
            Console.Write("m = ");
            m = int.Parse(Console.ReadLine());
            string hodi = Console.ReadLine();

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= m; j++)
                {
                    Tuple<int, int> p = Moves(hodi, i, j);
                    if (p.Item1 > 0 && p.Item1 <= n && p.Item2 > 0 && p.Item2 <= m)
                    {
                        Console.WriteLine(i + " " + j);
                        goto exist;
                    }
                    if (p.Item1 == -123)
                    {
                        goto doesntexist;
                    }
                }
            }

            doesntexist:
            Console.WriteLine("No");

            exist:
            return;
        }
    }
}
