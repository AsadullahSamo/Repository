#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
	int num, loop_no;
	cout<<"Enter a number:";
	cin>>num;
	
	for(loop_no=1; loop_no<=200; loop_no++){
		cout<<setw(5)<<loop_no*num;
		if(loop_no%10==0){
			cout<<endl;
		}
	}
	cout<<endl;
	return 0;
}
