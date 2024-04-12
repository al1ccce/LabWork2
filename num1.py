def moves(hodi, n, m, nlocal, mlocal):
    for hod in hodi:
        match hod:
            case 'L':
                m -= 1
            case 'R':
                m += 1
            case 'D':
                n += 1
            case 'U':
                n -= 1
            case _:
                print(hod, " is undefined")
                return -123, 0
        if n <= 0 or n > nlocal or m <= 0 or m > nlocal:
            return 0, 0
    return n, m

n = int(input("n = "))
m = int(input("m = "))
hodi = str(input("moves = "))
for i in range(1, n + 1):
    for j in range(1, m + 1):
        nnew, mnew = moves(hodi, i, j, n, m)
        if ((nnew > 0 and nnew <= n) and (mnew > 0 and mnew <= m)):
            print(i, j)
            exit()
        if nnew == -123:
            print('No')
            exit()
print('No')
