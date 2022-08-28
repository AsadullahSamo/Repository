#include<iostream>
using namespace std;
int main(){
	
	unsigned int num, j;
	unsigned long fact;
	
	cout<<"Enter a number:";
	cin>>num;
	do{	
	fact=1;  j=0;
	for(int j=num; j>0; j--){
		fact*=j;
	}
	cout<<"Factorial is:"<<fact<<endl;
	cout<<"Press 0 to exit or any key to calculate its factorial:";
	cin>>num;
}    while(num!=0);
	return 0;
}
