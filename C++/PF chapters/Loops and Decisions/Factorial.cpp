#include<iostream>
using namespace std;
int main(){
	
	unsigned int num;
	unsigned long fact=1;
	
	cout<<"Enter a number:";
	cin>>num;
	
	for(int j=num; j>0; j--){
		fact*=j;
	}
	cout<<"Factorial is:"<<fact<<endl;
	return 0;
}
