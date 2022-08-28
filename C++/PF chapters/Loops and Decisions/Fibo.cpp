#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
	long last=0;
	long next=1;
	while(next<5000){
		long sum=last+next;
		next=last;
		last=sum;
		cout<<next<<" ";
	}	

	return 0;
}
