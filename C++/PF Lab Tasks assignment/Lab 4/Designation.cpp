#include<iostream>
using namespace std;
int main(){
	
	int pay;
	cout<<"Enter your pay scale:\n";
	cin>>pay;
	
	if(pay>=10000 && pay<=20000){
		cout<<"Manager Operations";
	} else if(pay>20000 && pay<=30000){
		cout<<"Manager";
	} else if(pay>30000 && pay<=40000){
		cout<<"Area Manager";
	} else if(pay>40000 && pay<=50000){
		cout<<"Regional Manager";
	}
	return 0;
}
