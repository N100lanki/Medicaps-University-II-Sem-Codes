'''18.
Write a function split_list(Lst,n), where list Lst should be split into two parts
by the function and the length of the first part is given as n'''
def splitter(list, length):
    part1 = list[:length]
    part2 = list[length::]
    return part1, part2


list = input("Enter the list elements : (separate by space) :").split()
print(list, "Length =", len(list))
length = int(input("Enter the length of first part : "))
if length < len(list):
    tuple = splitter(list, length)
    print("First part is :", tuple[0])
    print("Second part is :", tuple[1])
else:
    print("Enter length less than original list!")
print(tuple)