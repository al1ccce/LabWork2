using System;

namespace ChessMoves
{
    class Program
    {
        static Tuple<int, int> Moves(string hodi, int n, int m, int nlocal, int mlocal)
        {
            int nPos = n;
            int mPos = m;

            foreach (char hod in hodi)
            {
                switch (hod)
                {
                    case 'L':
                        mPos--;
                        break;
                    case 'R':
                        mPos++;
                        break;
                    case 'D':
                        nPos++;
                        break;
                    case 'U':
                        nPos--;
                        break;
                    default:
                        Console.WriteLine(hod + " is undefined");
                        return Tuple.Create(-123, 0);
                }

                if ((mPos <= 0 || mPos > mlocal) || (nPos <= 0 || nPos > nlocal))
                {
                    return Tuple.Create(0, 0);
                }
            }

            return Tuple.Create(nPos, mPos);
        }

        static void Main(string[] args)
        {
            int n, m = 0;
            Console.Write("n = ");
            n = Convert.ToInt32(Console.ReadLine());
            Console.Write("m = ");
            m = Convert.ToInt32(Console.ReadLine());
            Console.Write("moves = ");
            string hodi = Console.ReadLine();

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= m; j++)
                {
                    Tuple<int, int> p = Moves(hodi, i, j, n, m);

                    if ((p.Item1 > 0 && p.Item1 <= n) && (p.Item2 > 0 && p.Item2 <= m))
                    {
                        Console.WriteLine(i + " " + j);
                        Environment.Exit(1);
                    }

                    if (p.Item1 == -123)
                    {
                        Environment.Exit(-123);
                    }
                }
            }

            Console.WriteLine("No");
        }
    }
}
