#include<iostream>
#include<fstream>
/* the useful classes for working with files in c++ are
1. fstreambase
2. ifstream --> derived from fstreambase
3. ofstream --> derived from fstreambase
*/

//In order to work with files in c++, you will have to open it. Primarily,
//there are two ways to open a file:
//1. Using the constructor
//2. Using the member function open() of the class

using namespace std;
int main(){
	
	string st="Junaid Samo";
	ofstream out("sample.txt");
	out<<st;
		
	return 0;
}
