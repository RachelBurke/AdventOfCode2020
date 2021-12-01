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
            for (int k = j + 1; k < 200; k++)
            {
                if (lines[i] + lines[j] + lines[k] == 2020)
                {
                    cout << lines[i] << " * " << lines[j] << " * " << lines[k] << " = " << lines[i] * lines[j] * lines[k] << endl;
                    // 615 + 903 + 502 = 2020
                    // 615 * 903 * 502 = 278783190
                }
            }
        }
    }

    return 0;
}