#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main()
{
    string Filename = "Day1Input.txt";
    ifstream input(Filename);
    string line;
    int lines[200] = {0};
    int lineNum = 0;
    while (getline(input, line))
    {
        lines[lineNum] = stoi(line);
        lineNum++;
    }

    for (int i = 1; i < 200; i++)
    {
        for (int j = i + 1; j < 200; j++)
        {
            if (lines[i] + lines[j] == 2020)
            {
                cout << lines[i] << " * " << lines[j] << " = " << lines[i] * lines[j] << endl;
                // 1704 + 316 = 2020
                // 1704 * 316 = 538464
            }
        }
    }

    return 0;
}