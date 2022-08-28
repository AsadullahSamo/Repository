#include<iostream>
using namespace std;
int main(){
	
	int num, i, sum, avg;
	cout<<"Enter ten numbers: ";
	for(i=0; i<10; i++)
	{
		cin>>num;
		sum+=num;
	}
	avg = sum/10;
	cout<<"Average is: "<<avg<<endl;

	return 0;
}
