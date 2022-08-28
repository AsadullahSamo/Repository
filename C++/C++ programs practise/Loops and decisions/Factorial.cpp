#include<iostream>
using namespace std;
int main(){
	
	int num, i, fact=1;
	cout<<"Enter a number: ";
	cin>>num; // 5
	for(i=num; i>0; i--)
	{
		fact*=i;
	}
	cout<<"Factorial is: "<<fact<<endl;
	return 0;
}

