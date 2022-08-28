#include<iostream>
using namespace std;
int main(){
	
	unsigned long last=0;
	unsigned long next=1;
	
	while(next<8000){
		cout<<last<<" ";    
		long sum=next+last;  
		next=last;       
		last=sum;      
	}
	return 0;
}
