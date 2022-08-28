#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
	cout<<"Odd\tEven"<<endl;
	int num;
	for(num=1; num<=20; num++){
		if(num%2!=0){	
		cout<<num;
	}
		else if(num%2==0){
			cout<<"\t"<<num<<endl;
		}
	}
	
	return 0;
}
