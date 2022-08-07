# .Biggest of Three
lists = input("Enter three numbers : ").split()
if len(lists) == 3:
    if lists[0] >= lists[1] and lists[0] >= lists[2]:
        biggest = lists[0]
    elif lists[1] >= lists[0] and lists[1] >= lists[2]:
        biggest = lists[1]
    else:
        biggest = lists[2]
    print(biggest)
else:
    print("Enter three numbers!")