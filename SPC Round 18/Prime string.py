t = int(input())
for _ in range(t):
    s = input()
    flag = 0
    for i in range(len(s)):
        if s[i:i+5] == 'prime':
            flag = 1
    if flag == 1:
        print("yes")
    else:
        print("no")
