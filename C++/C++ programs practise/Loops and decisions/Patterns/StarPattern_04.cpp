#include<iostream>
using namespace std;
 int main(){
 	int x, y;
 	for(x=1; x<=5; x++){
 		for(y=5; y>=x; y--){
	 	cout<<"*";
	 }
	 cout<<endl;
	 }
	 cout<<endl<<endl;
	 
	 int a, b, n;
	 cout<<"Enter number of times to print:";
	 cin>>n;
 	for(a=1; a<=n; a++){
 		for(b=n; b>=a; b--){
	 	cout<<"*";
	 }
	 cout<<endl;
	 }
 	return 0;
 }
