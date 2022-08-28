#include<iostream>
using namespace std;
int main(){
	
	int num;
	cout<<"Enter a number: "; 
	cin>>num;
	
	// we can also write expressions inside switch
	switch(num>0){
		// if num>0 condition (number is even) is true 
		case 1:
			cout<<num<<" is positive\n";       
			break;
			
		// Number is either 0 or -ve
		case 0:
		switch(num<0){
		case 1:
			cout<<num<<" is negative\n";       
			break;
		case 0:
			cout<<"Number is zero\n";
		}
		
	}
	return 0;
}
