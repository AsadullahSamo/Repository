#include<iostream>
#include<conio.h>
using namespace std;
int main(){
	int num, num1;
	cout<<"Enter a number:";    cin>>num;
	num1=num;
	while(num>=10){
		num/=10;
	}
	cout<<"First digit is:"<<num<<endl;
	
	num1%=10;
	cout<<"Last digit is:"<<num1<<endl;
	cout<<"Sum of first and last digit is:"<<num+num1<<endl;
	cout<<"first digit after swapping is:"<<num1<<" and "<<"last digit after swapping is:"<<num;
	return 0;
}
