''''. Write a program to create a list A to generate squares of numbers (from 1 to 10). List B to
generate Cubes of numbers (from 1 to 10) and List C with those elements that are even and
present in List A.
'''
listA = [j ** 2 for j in range(1, 11)]
listB = [j ** 3 for j in range(1, 11)]
listC = [j for j in listA if j % 2 == 0]

print("List A with Squares:", listA, end="\n\n")
print("List B with Cubes:", listB, end="\n\n")
print("List C with Even in List A:", listC, end="\n\n")