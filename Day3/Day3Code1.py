numTrees = 0
numOpen = 0
pos = 0

with open("Day3Input.txt") as file:
    while line := file.readline().rstrip():
        if line[pos % len(line)] == '#':
            numTrees = numTrees + 1
        else:
            if line[pos % len(line)] == '.':
                numOpen = numOpen + 1
        pos = pos + 3

print("Trees: " + str(numTrees))
print("Open: " + str(numOpen))