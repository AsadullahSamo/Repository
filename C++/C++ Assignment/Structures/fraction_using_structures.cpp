#include<iostream>
using namespace std;
struct fractions{
	int numerator;
	int denominator;
	int result;
};
int main(){
	char ch;
	fractions f1, f2;
	cout<<"Enter first fraction: ";
	cin>>f1.numerator>>ch>>f1.denominator;
	
	cout<<"Enter second fraction: ";
	cin>>f2.numerator>>ch>>f2.denominator;
	
	f1.result=(f1.numerator*f2.denominator)+(f1.denominator*f2.numerator);
	f2.result=(f1.denominator*f2.denominator);
	cout<<"The addition of two fractions is "<<f1.result<<"/"<<f2.result<<endl;	
	return 0;
}
