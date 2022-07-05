num = int(input())

for i in range(0, num):
    Ci = int(input())
    result = ""
    for j in range(0, Ci):
        alpha, number = map(str, input().split())
        result += alpha*int(number)
    
    print("#"+str(i+1))
    for j in range(0,len(result),10):
        if(j+10 <=len(result)):
            print(result[j:j+10])
        else:
            print(result[j:])

        