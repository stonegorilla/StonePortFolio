def read(text):
    # 이곳에 코드를 작성하세요.
    ridename = text.split(':')[0]
    if text[-1] == "-":
        cmmin = "None"
        cmmax = "None"
    elif text[-1] == "m":
        cmmin = str.strip(text.split(':')[1].split('~')[0][:-2])
        cmmax = str.strip(text.split(':')[1].split('~')[1][:-2])
    else:
        if(text[-1] == "상"):
            cmmin = text.split(':')[1].split(' ')[1][:-2]
            cmmax = "None"
        else:
            cmmin = "None"
            cmmax = text.split(':')[1].split(' ')[1][:-2]
            
    return ridename, cmmin, cmmax


# def read(text):
#     ridename, limit = map(str.strip, text.split(':'))
    
#     cmmin = cmmax = None
#     if '~' in limit:
#         cmmin, cmmax = map(lambda x: int(x.replace('cm', '')), limit.split('~'))
#     elif "이상" in limit:
#         cmmin = int(limit.split("cm")[0])

#     return ridename, cmmin, cmmax

if __name__ == "__main__":
    ridename, cmmin, cmmax = read(input())
    print("이름:", ridename)
    print("하한:", cmmin)
    print("상한:", cmmax)