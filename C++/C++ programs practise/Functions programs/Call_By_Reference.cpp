#include<iostream>
using namespace std;
void swap(int&, int&);       // values in declaration and definition is parameters
int main(){
	int num1=5;  int num2=7;
	cout<<"In main values before swapping "<<"num1="<<num1<<" "<<"num2="<<num2<<endl;
	swap(num1, num2);     // values in call are called arguments
	cout<<"In main values after swapping "<<"num1="<<num1<<" "<<"num2="<<num2<<endl;
	return 0;
	
}

void swap(int& n1, int& n2){
	cout<<"In function values before swapping "<<"n1="<<n1<<" "<<"n2="<<n2<<endl;
	int temp=n1;             //temp=7
	n1=n2;                  // n1=5
	n2=temp;               //  n2=7
	cout<<"In function values after swapping "<<"n1="<<n1<<" "<<"n2="<<n2<<endl;
}
