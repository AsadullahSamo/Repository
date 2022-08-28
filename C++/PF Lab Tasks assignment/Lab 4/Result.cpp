#include<iostream>
using namespace std;
int main(){
	
	int cpp, FE, EE, total;
	cout<<"Enter your C++ marks:\n";
	cin>>cpp;
	cout<<"Enter your Functional English marks:\n";
	cin>>FE;
	cout<<"Enter your EE marks:\n";
	cin>>EE;
	total=cpp+FE+EE;
	float percentage=total*100/300;
	
	if(percentage>=90){
		 cout<<"Your percentage is:"<<" "<<percentage<<" "<<"and you secured A";
	} else if(percentage>=80 && percentage<90){
		cout<<"Your percentage is:"<<" "<<percentage<<" "<<"and you secured B";
	} else if(percentage>=70 && percentage<=79){
		cout<<"Your percentage is:"<<" "<<percentage<<" "<<"and you secured C";
	} else if(percentage>=60 && percentage<=69){
		cout<<"Your percentage is:"<<" "<<percentage<<" "<<"and you secured D";
	} else if(percentage<60){
		cout<<"FAIL";
	}
	
	return 0;
}
