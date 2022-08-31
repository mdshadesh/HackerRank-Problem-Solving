from collections import deque
l=deque([])
s=input()
enable=1
point=-1
for i in range(len(s)):
    
    if s[i]=='#':
        enable=(enable+1)%2
    elif s[i]=='<':
        point=-1
    elif s[i]=='>':
        point=len(l)-1
    elif s[i]=='*':
        if point!=-1:
            l[point]=''
            point-=1
    else:
        if s[i].isdigit() and not enable:
            continue
        point+=1
        l.insert(point,s[i])
print(*l,sep="")