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
		
		if(num1>num2 && num1>num3){
			cout<<"The greatest:"<<num1;
		} else if(num2>num1 && num2>num3){
			cout<<"The greatest:"<<num2;
		} else if(num3>num1 && num3>num2){
			cout<<"The greatest:"<<num3;
		}
		
		return 0;
}
