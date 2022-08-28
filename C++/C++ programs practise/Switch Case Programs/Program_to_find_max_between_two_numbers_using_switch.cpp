#include<iostream>
using namespace std;
int main(){
	
	int num1, num2;
	cout<<"Enter first number: ";
	cin>>num1;
	cout<<"Enter second number: ";
	cin>>num2;
	
	// we can also write expressions inside switch
	switch(num1>num2){
		// if num1>num2 is false 
		case 0:
			cout<<num2<<" is greater\n";       
			break;
		case 1:
			cout<<num1<<" is greater\n";       
			break;
	}
	return 0;
}
