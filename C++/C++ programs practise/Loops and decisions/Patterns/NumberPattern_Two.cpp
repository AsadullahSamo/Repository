#include<iostream>
using namespace std;
 int main(){
 	int x, y;
 	for(x=1; x<=5; x++){
 		for(y=1; y<=x; y++){
	 	cout<<y;
	 }
	 cout<<endl;
	 }
	 cout<<endl<<endl;
	 
	 int a, b, n;
	 cout<<"Enter number of times to print:";
	 cin>>n;
 	for(a=1; a<=n; a++){
 		for(b=1; b<=a; b++){
	 	cout<<b;
	 }
	 cout<<endl;
	 }
 	return 0;
 }
