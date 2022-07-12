//Naive Search Algorithm , copy righted to vsdevelopers.io
#include <iostream>
#include <cstring>

void VSDBruteForceSearch(char textString[], char patternString[])
{
    int i=0; //Text Index
    int j=0; //Pattern Index

    int m = strlen(patternString); //Length of the Pattern String
    int n = strlen(textString); //Length of the Text String

    std::cout << "length of pattern:"<<m;
    std::cout << "\nlength of text:"<<n;

    //Repeat until the complete text string is iterated
    //and Pattern reaches to the end
    while(i < n && j < m)
    {
        //As the comparison is successful, keep moving the indexes
        if (patternString[j] == textString[i])
        {
            i++;
            j++;
        }
        //Revert the index of pattern to zero when the search fails
        //Move the text index to last searched position + 1
        else
        {
            i = i - j + 1;
            j = 0;
        }
    }
    //Get the position at which the pattern found
    if ( j >= m)
    {
        i = i - m;
        std::cout << "\nFound the Pattern at:" << i << "\tposition";
    }
    else
    {
        i = 0;
        std::cout << "\nPattern not found";
    }
}

int main()
{
    std::cout << "Welcome to VSDevelopers, Brute Force Search Version Program\n";
    char TextString[] = "AAABAABABABAAAAABAAAAABBB";
    char PatterString[] = "AAAABBB";

    VSDBruteForceSearch(TextString, PatterString);

    return 0;

}
