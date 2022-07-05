a, b = map(int, input().split())

if a-b == 1 or a-b == -2 :
    print('A')
else:
    print('B') 

aaa = [9,8,7,6,5,4,3,2,1]
print(list(filter(lambda x : x<aaa.index(x) ,aaa)))

print(list( data for idx,data in enumerate(aaa) if idx<data ))