def moves(hodi, n, m):
    for hod in hodi:
        if hod == 'L':
            m -= 1
        if hod == 'R':
            m += 1
        if hod == 'D':
            n += 1
        if hod == 'U':
            n -= 1
        else:
            print(hod, " is undefined")
            return -123, 0
    return n, m


print("n = ")
n = int(input())
print("m = ")
m = int(input())
print("moves = ")
hodi = str(input())
isDone = False
for i in range(1, n + 1):
    for j in range(1, m + 1):
        nnew, mnew = moves(hodi, i, j)
        if ((nnew > 0 and nnew <= n) and (mnew > 0 and mnew <= m)):
            print(i, j)
            isDone = True
            break
        if nnew == -123:
            print('No')
            exit()
    if isDone:
        break
if not isDone:
    print('No')
