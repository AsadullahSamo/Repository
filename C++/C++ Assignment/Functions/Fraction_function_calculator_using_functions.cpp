#include<iostream>
using namespace std;
struct fraction{
	int numerator;
	int denominator;
	int result;
};
fraction fadd(fraction, fraction);
fraction fsub(fraction, fraction);
fraction fmul(fraction, fraction);
fraction fdiv(fraction, fraction);

int main(){
	
	fraction f1, f2;
	char sl, op;         // char slash for(/), operator(+,-,*,/)
	
	do{
	cout<<"Enter first fraction, operator, second fraction"<<endl;
	cin>>f1.numerator>>sl>>f1.denominator>>op>>f2.numerator>>sl>>f2.denominator;
	
	switch(op){
	case '+':
	fadd(f1, f2); 
	break;
	case '-':
	fsub(f1, f2); 
	break;
	case '*':
	fmul(f1, f2);
	break;
	case '/':
	fdiv(f1, f2); 
	break;
}
	cout<<"Do another (y/n) ? ";
	cin>>sl;
} while(sl!='n');// end of do while 
	return 0; 
}

fraction fadd(fraction f1, fraction f2){
	f1.result=(f1.numerator*f2.denominator)+(f1.denominator*f2.numerator);
	f2.result=(f1.denominator*f2.denominator);
	cout<<"Result is "<<f1.result<<"/"<<f2.result<<endl;
}

fraction fsub(fraction f1, fraction f2){
	f1.result=(f1.numerator*f2.denominator)-(f1.denominator*f2.numerator);
	f2.result=(f1.denominator*f2.denominator);
	cout<<"Result is "<<f1.result<<"/"<<f2.result<<endl;
}

fraction fmul(fraction f1, fraction f2){
	f1.result=(f1.numerator*f2.numerator);
	f2.result=(f1.denominator*f2.denominator);
	cout<<"Result is "<<f1.result<<"/"<<f2.result<<endl;
}

fraction fdiv(fraction f1, fraction f2){
	f1.result=(f1.numerator*f2.denominator);
	f2.result=(f1.denominator*f2.numerator);
	cout<<"Result is "<<f1.result<<"/"<<f2.result<<endl;
}

