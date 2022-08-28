#include<iostream>
using namespace std;
int cube(int);
int main(){
	
	int num;
	cout<<"Enter a number: ";
	cin>>num;
	int result=cube(num);
	cout<<"Cube of "<<num<<" is "<<result;
	return 0;
}

int cube(int num){
	return (num*num*num);
}
