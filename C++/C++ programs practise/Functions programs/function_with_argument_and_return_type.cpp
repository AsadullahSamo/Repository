#include<iostream>
using namespace std;
int sum(int&, int&);
int main(){
	
	int x, y, c;
	cout<<"Enter x and y: ";
	cin>>x>>y;
	c=sum(x, y);
	cout<<"Sum = "<<c<<endl;
	return 0;
}

int sum(int& a, int& b){
	int sum=0;
	sum=a+b;
	return sum;
}
