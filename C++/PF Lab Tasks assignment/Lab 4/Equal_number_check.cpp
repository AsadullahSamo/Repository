#include<iostream>
using namespace std;
int main(){
		
		int num1, num2, num3;
		cout<<"Enter first number:\n";
		cin>>num1;
		cout<<"Enter second number:\n";
		cin>>num2;
		cout<<"Enter third number:\n";
		cin>>num3;
		
		if(num1==num2 && num1==num3 && num2==num3){
			cout<<"All numbers are equal";
	} else {
			cout<<"All numbers are not equal";
	}
		
		return 0;
}
