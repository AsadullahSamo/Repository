#include<iostream>
using namespace std;

int maximum(int, int);
int  minimum(int, int);

int main(){

	int num1, num2, max, min;
	cout<<"Enter first number: ";
	cin>>num1;
	cout<<"Enter second number: ";
	cin>>num2;
	
	max=maximum(num1, num2);
	cout<<"Maximum = "<<max<<endl;
	min=minimum(num1, num2);
	cout<<"Minimum = "<<min<<endl;
	return 0;
}

int maximum(int num1, int num2){
	return (num1>num2 ? num1 : num2);
}

int minimum(int num1, int num2){
	return (num1<num2 ? num1 : num2);
}
