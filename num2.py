n = int(input("full bottles: "))
m = int(input("empty bottles for exchange: "))
mc = n
mcount = n
count = 0
ost = 0
drinkedBottles = 0

while mcount > 0:
    print('F' * n)
    drinkedBottles += n
    count += 1
    mc = n + ost
    print('E' * mc)
    ost = mc % m
    n = mc // m
    count += 1
    mc = ost
    mcount = n

print(drinkedBottles, count-1)
