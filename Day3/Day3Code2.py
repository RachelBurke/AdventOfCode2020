options = [[1,1], [3,1], [5,1], [7,1], [1,2]]
multiply = 1

for rightDown in options:
    numTrees = 0
    numOpen = 0
    pos = 0
    lineNum = 0
    with open("Day3Input.txt") as file:
        while line := file.readline().rstrip():
            if lineNum % rightDown[1] == 0:
                if line[pos % len(line)] == '#':
                    numTrees = numTrees + 1
                else:
                    if line[pos % len(line)] == '.':
                        numOpen = numOpen + 1
                pos = pos + rightDown[0]
            lineNum = lineNum + 1
        multiply = multiply * numTrees
        print("[" + str(rightDown[0]) + ", " + str(rightDown[1]) + "] Trees: " + str(numTrees))
        print("[" + str(rightDown[0]) + ", " + str(rightDown[1]) + "] Open: " + str(numOpen))

print(str(multiply))