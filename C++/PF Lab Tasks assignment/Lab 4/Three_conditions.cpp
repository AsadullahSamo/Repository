#include<iostream>
using namespace std;
int main(){
	
	int x;
	cout<<"Enter a number:\n";
	cin>>x;
	int y=10;
	
	if(x==0){
		x+=10;
		cout<<x*x*x;
		goto end;
	}if(x%2!=0){
		cout<<x*x;
	} if(x%2==0){
		cout<<x-1;
	}
	end:
	return 0;
}
