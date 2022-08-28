#include<iostream>
using namespace std;
int main(){
	
	int num;
	cout<<"Enter a number: "; 
	cin>>num;
	
	// we can also write expressions inside switch
	switch(num%2==0){
		// if num%2 condition (number is even) is false 
		case 0:
			cout<<num<<" is odd\n";       
			break;
		case 1:
			cout<<num<<" is even\n";       
			break;
	}
	return 0;
}
