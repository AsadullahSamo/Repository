#include<iostream>
using namespace std;

#define PI 3.14
#define MUL(a, b) a*b
#define MAX(a, b) if(a>b)\
cout<<a<<" is max"<<endl; \
else \
cout<<b<<" is max"<<endl;

int main(){
	
	cout<<"Multiplication is "<<MUL(5, 11)<<endl;
	MAX(5, 9);
	MAX(4, 1);
	// #undef PI  (if we used this and after we print PI, it'll be error because we undefined PI)
	cout<<"The value of PI is "<<PI<<endl;
	
	// Predefined Macros
	cout<<"Date is "<<__DATE__<<endl;
	cout<<"Time is "<<__TIME__<<endl;
	cout<<"Line number is "<<__LINE__<<endl;
	cout<<"File name is "<<__FILE__<<endl;
	cout<<"ANSI "<<__STDC__<<endl;
	
	return 0;
}
