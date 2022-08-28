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
		
		if(num1<num2 && num1<num3 && num2<num3){
			cout<<num1<<","<<num2<<" "<<"and"<<" "<<num3<<" "<<"are in increasing order";
		} else if(num1>num2 && num1>num3 && num2>num3){
			cout<<num1<<","<<num2<<" "<<"and"<<" "<<num3<<" "<<"are in decreasing order";
		} else {
			cout<<"Invalid order";
		}
	return 0;
}
