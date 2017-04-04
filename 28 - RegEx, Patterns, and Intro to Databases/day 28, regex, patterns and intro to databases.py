N = int(input())
A = list(input().split() for i in range(N))
print(*sorted(x[0] for x in A if x[1].endswith('@gmail.com')), sep='\n')