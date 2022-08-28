#include<iostream>
using namespace std;
int main(){
	
	int num[10], i, num1;
	cout<<"Enter 10 integers ";
	for(i=0; i<10; i++)
	{
		cin>>num[i];
	}
	cout<<"Enter a number: ";
	cin>>num1;
	
	for(i=0; i<10; i++)
	{
		if(num1==num[i])
		{
		cout<<num1<<" is present in array";
		cout<<"{ ";
			for(i=0; i<10; i++)
			{
			cout<<num[i];
			if(i==9)
			break;
			else
			cout<<",";
			}    // end of nested for
		cout<<" }";
		exit(0);     
		}     // end of if
	}      // end of outer for
	
		cout<<num1<<" is not present in array";
		cout<<"{ ";
			for(i=0; i<10; i++)
			{
			cout<<num[i];
			if(i==9)
			break;
			else
			cout<<",";
			}    // end of nested for
		cout<<" }";     


	
	
	return 0;
}
