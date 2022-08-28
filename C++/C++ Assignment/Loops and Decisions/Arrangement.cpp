#include<iostream>
#include<conio.h>
using namespace std;
int main(){
	
	int guests, chairs, result;
	
	do{
	
	cout<<"Enter number of guests:";
	cin>>guests;
	cout<<"Enter number of chairs:";
	cin>>chairs;
	
	result=1;
	for(int arg=0; arg<chairs; arg++){
		result*=guests-arg;
		cout<<"The number of possible arrangements are:"<<result;
	}
	cout<<"Press c to continue or any key to exit";
}      while(getch()=='c');
	return 0;
}
