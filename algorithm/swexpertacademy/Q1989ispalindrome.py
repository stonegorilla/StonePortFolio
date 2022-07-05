num = int(input())

for i in range  (0,num) :
    word = input()
    if(word == word[::-1]):
        print("#"+str(i+1)+" 1")
    else:
        print("#"+str(i+1)+" 0") 

