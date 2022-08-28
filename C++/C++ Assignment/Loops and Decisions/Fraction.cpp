#include <iostream>
#include<iomanip>
using namespace std;
int main(){
	
	char fraction, op, ch;
	int a, b, c, d, result1, result2;
	
	do{
	cout<<"Enter first fraction, operator, second fraction:";
	cin>>a>>fraction>>b>>op>>c>>fraction>>d;
	
	
	switch(op){
		case '+':
		result1=(a*d) + (b*c);
		result2=(b*d);
		break;
		case '-':
		result1=(a*d) - (b*c);
		result2=(b*d);
		break;
		case '*':
		result1=(a*c);
		result2=(b*d);
		break;
		case '/':
		result1=(a*d);
		result2=(b*c);
		break;
	}
	cout<<"The result of first and second fraction is:"<<result1<<"/"<<result2<<endl;
	cout<<"Do another: (y/n)?:";
	cin>>ch;
}     while(ch!='n');
	return 0;
}
