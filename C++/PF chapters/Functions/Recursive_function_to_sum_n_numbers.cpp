#include<iostream>
using namespace std;
int add(int x){
	int s=0;
	if(x==1)
	return x;
	s = x + add(x-1);
}    // end of add() function
int main(){
	int num;
	cout<<"Enter a number: ";
	cin>>num;
	int result = add(num);
	cout<<"Sum of first "<<num<<" natural numbers is: "<<result<<endl;
	
	return 0;
}
