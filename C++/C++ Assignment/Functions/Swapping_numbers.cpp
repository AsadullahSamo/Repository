#include<iostream>
using namespace std;
void swap(int&, int&);

int main(){
	int x, y;
	cout<<"Enter first number: ";             cin>>x;
	cout<<"Enter second number: ";             cin>>y;
	cout<<"Before function call x="<<x<<", y="<<y<<endl;
	swap(x, y);
	cout<<"After function call x="<<x<<", y="<<y<<endl;
	
	return 0;
}

void swap(int& x, int& y){
	int temp=x;             // temp=7
	x=y;                   // x=5;
	y=temp;                // y=7
}


