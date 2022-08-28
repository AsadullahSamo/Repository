#include<iostream>

using namespace std;
int main(){
	int a=4;
	float b=3.14; 
	char c='a';
	double d=99.8;
	long e=1.55;
	short f=5.55;
	int x, y, z, t, u, v;
	
	x=sizeof (a);
	cout<<"The size of int datatype is:"<<x<<"\n";
	y=sizeof (b);
	cout<<"The size of float datatype is:"<<y<<"\n";
	z=sizeof (c);
	cout<<"The size of char datatype is:"<<z<<"\n";
	t=sizeof (d);
	cout<<"The size of double datatype is:"<<t<<"\n";
	u=sizeof (e);
	cout<<"The size of long datatype is:"<<u<<"\n";
	v=sizeof (f);
	cout<<"The size of short datatype is:"<<v<<"\n";
	
	return 0;
}
