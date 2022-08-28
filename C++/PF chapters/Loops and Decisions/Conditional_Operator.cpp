#include<iostream>
using namespace std;
int main(){
	int age;
	cout<<"Enter your age: ";
	cin>>age;
	string ageCheck = (age>18) ? "You can drive" : "You can't drive";
	cout<<ageCheck;
	
	return 0;
}
