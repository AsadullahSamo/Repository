#include<iostream>
#include<conio.h>
using namespace std;
int main(){
	
	int num_year;
	float amount, rate, result;
	
	do{
	cout<<"Enter initial amount:";
	cin>>amount;
	cout<<"Enter Number of years:";
	cin>>num_year;
	cout<<"Enter rate (percent per years):";
	cin>>rate;
	
	for(int x=0; x<num_year; x++){
		result=amount+(amount*rate/100);
	}
	cout<<"At the end of "<<num_year<<" years, you will have "<<result<<" dollars\n";
	cout<<"Press c key to continue or any key to exit:\n";
}    while(getch()=='c');
	return 0;
}
