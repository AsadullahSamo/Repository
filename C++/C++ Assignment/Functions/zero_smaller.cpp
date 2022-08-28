#include<iostream>
using namespace std;
int zerosmaller(int&, int&);
int main(){
	int a=4, b=7, c=45, d=15;
	zerosmaller(a, b);
	zerosmaller(c, d);
	cout<<"a = "<<a<<" b = "<<b<<endl;
	cout<<"c = "<<c<<" d = "<<d<<endl;
	return 0;
}

int zerosmaller(int& first, int& second){
	if(first<second)
	{
		first=0;
	}
	else
	{
		second=0;
	}
}
