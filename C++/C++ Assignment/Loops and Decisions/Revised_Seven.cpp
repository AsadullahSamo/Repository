#include<iostream>
#include<conio.h>
using namespace std;
int main(){
	
	int num_year;
	float amount, rate, final_amount;
	
	do{
	cout<<"Enter initial amount:";
	cin>>amount;
	cout<<"Enter rate (percent per years):";
	cin>>rate;
	cout<<"Enter final amount:";
	cin>>final_amount;
	
	num_year=0;
	while(final_amount>=amount){
	final_amount-=final_amount*rate/100;
	num_year++;
}

	cout<<"Number of years is:"<<num_year<<endl;
	cout<<"Press c key to continue or any key to exit:\n";

}    while(getch()=='c');
	return 0;
}
