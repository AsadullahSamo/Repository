#include<fstream>
#include<string>
#include<iostream>
using namespace std;
int main(){
	char ch='A';
	int x=100;
	double d=50;
	string str="Monday";
	
	ofstream outfile("Sample_classProgram.txt");
	outfile<<ch<<" "<<x<<" "<<d<<" "<<str<<" "<<"March";
	cout<<"Sample_classProgram is created";
	
	
	return 0;
}
