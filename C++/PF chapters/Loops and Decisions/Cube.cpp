#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
	int num;
	for(num=1; num<=10; num++){
		cout<<setw(4)<<num<<setw(6)<<num*num*num<<endl;
	}
	return 0;
}
