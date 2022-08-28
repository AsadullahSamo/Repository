#include<iostream>
#include<process.h>
using namespace std;
int main(){
	
	int n;
	cout<<"Enter a number:";
	cin>>n;      // 9
	
	for(int j=2; j<=n/2; j++)     
		
			if(n%j==0)   9
				{
				cout<<"Its not prime divisible by:"<<j<<endl;
				exit(0);	
				} 
			cout<<"its prime";
	return 0;
}
