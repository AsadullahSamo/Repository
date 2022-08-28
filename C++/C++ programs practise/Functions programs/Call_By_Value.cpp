#include<iostream>
using namespace std;
void swap(int, int);       // values in declaration and definition is parameters
int main(){
	int num1=5;  int num2=7;
	cout<<"In main values before swapping "<<"num1="<<num1<<" "<<"num2="<<num2<<endl;
	swap(num1, num2);     // values in call are called arguments, it is call by value means change we have made in definition is not reflected here, so we use call by reference to get change , in call by reference we use '&' operator
	cout<<"In main values after swapping "<<"num1="<<num1<<" "<<"num2="<<num2<<endl;
	return 0;
	// note that in main values are not changed even when there is change in function,  this is call by value
}

void swap(int n1, int n2){
	n1=7; n2=5;
	cout<<"In function values before swapping "<<"n1="<<n1<<" "<<"n2="<<n2<<endl;
	int temp=n1;             //temp=7
	n1=n2;                  // n1=5
	n2=temp;               //  n2=7
	cout<<"In function values after swapping "<<"n1="<<n1<<" "<<"n2="<<n2<<endl;
}
