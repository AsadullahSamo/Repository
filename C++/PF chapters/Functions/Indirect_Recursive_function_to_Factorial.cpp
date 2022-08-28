#include<iostream>
using namespace std;
long fact1(long);
long fact2(long);

int main(){
	long num;
	cout<<"Enter a number: ";
	cin>>num;
	long result = fact1(num);
	cout<<"Factorial of "<<num<<" is: "<<result<<endl;
	
	return 0;
}

long fact1(long x){
	if(x<=1)
	return 1;
	else
	return x * fact2(x-1);
}
long fact2(long x){
	if(x<=1)
	return 1;
	else
	return x*fact1(x-1);
}
