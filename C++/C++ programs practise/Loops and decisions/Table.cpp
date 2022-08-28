#include<iostream>
using namespace std;
int main(){
	
	int num1 = 24, num2 = 50, num3 = 29, i;
	
	// Table of 24
	for(int i=1; i<=10; i++)
	{
		cout<<num1<<"X"<<i<<"="<<num1*i<<endl;
	}
	cout<<endl;
	
	// Table of 29
	for(int i=1; i<=10; i++)
	{
		cout<<num2<<"X"<<i<<"="<<num2*i<<endl;
	}
	cout<<endl;
	
	// Table of 24
	for(int i=1; i<=10; i++)
	{
		cout<<num3<<"X"<<i<<"="<<num3*i<<endl;
	}
	
	return 0;
}
