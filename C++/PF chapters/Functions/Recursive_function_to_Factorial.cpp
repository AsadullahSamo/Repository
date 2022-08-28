#include<iostream>
using namespace std;
int fact(int x){
	int result = 1;
	if(x<=1)
	return x;
	else
	result = x * fact(x-1);
	return result;
}
int main(){
	int num;
	cout<<"Enter a number: ";
	cin>>num;
	int result = fact(num);
	cout<<"Factorial of "<<num<<" is: "<<result<<endl;
	
	return 0;
}
