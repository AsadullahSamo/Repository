#include<iostream>
using namespace std;
struct fraction{
	int numerator;
	int denominator;
};

int main(){
	int result1, result2;
	fraction frac1, frac2;
	char ch, op;
	
	do{
	cout<<"Enter first fraction, operator, second fraction: ";
	cin>>frac1.numerator>>ch>>frac1.denominator>>op>>frac2.numerator>>ch>>frac2.denominator;	
	
	switch(op){
		case '+':
		result1=(frac1.numerator*frac2.denominator)+(frac1.denominator*frac2.numerator);
		result2=frac1.denominator*frac2.denominator;
		break;
		case '-':
		result1=(frac1.numerator*frac2.denominator)-(frac1.denominator*frac2.numerator);
		result2=frac1.denominator*frac2.denominator;
		break;
		case '*':
		result1=(frac1.numerator*frac2.numerator);
		result2=frac1.denominator*frac2.denominator;
		break;
		case '/':
		result1=(frac1.numerator*frac2.denominator);
		result2=frac1.denominator*frac2.numerator;
		break;
	} // end of switch
	cout<<"Result is "<<result1<<"/"<<result2<<endl;
	cout<<"Do another (y/n) ?";
	cin>>ch;
}while(ch!='n'); // end of do

	return 0;
}
