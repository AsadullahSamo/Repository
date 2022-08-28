#include<fstream>
#include<string>
#include<iostream>
using namespace std;
int main(){
	char ch;
	int x;
	double d;
	string str;
	
	ifstream infile("Sample_classProgram.txt");
	infile>>ch>>x>>d>>str;
	cout<<"Data is taken\n"<<str;
	
	
	return 0;
}
