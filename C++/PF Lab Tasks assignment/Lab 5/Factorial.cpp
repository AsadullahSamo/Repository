#include<iostream>
using namespace std;
int main(){
	
	int num, fact=1;
	cout<<"Enter a number:";
	cin>>num;
	
	for(int i=num; i>0; i--){
		fact*=i;
	}
	 cout<<"Factorial is:"<<fact;
	return 0;
}
