#include<iostream>
using namespace std;
int main(){
	
	// flags used for formatting console screen
	// hex            // 0x is prefix for hexadecimal
	int x=5, y=7;
	cout.flags(ios::hex);
	cout<<x+y<<endl;    // 12 is converted to hexadecimal equivalent which is c
	// boolalpha
	cout.flags(ios::boolalpha);
	bool result=0, result1=5;        // 0 is false, any other num is true
	cout<<result<<" "<<result1<<endl;

	cout.flags(ios::hex | ios::showbase);
	cout<<x+y<<endl;
//	
	string str="i am asad";
	cout.flags(ios::uppercase);
	cout<<str<<endl;
	return 0;
}
