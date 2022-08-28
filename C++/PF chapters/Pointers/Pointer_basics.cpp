#include<iostream>
using namespace std;
int main(){
	int x=10;
	int *a;               // a is pointer to int
	a=&x;
	cout<<"The address of x is "<<a<<endl;           // a means address of x
	cout<<"The value at address of x is "<<*a<<endl;// *a means value at address of x
	*a+=5;    //same as x+=5
	cout<<"After increment x="<<*a<<endl; 
	
	return 0;
}
