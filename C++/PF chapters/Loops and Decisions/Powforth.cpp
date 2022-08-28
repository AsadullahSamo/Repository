#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
	int num=1, pow=1;
	
	while(pow<10000){
	cout<<setw(4)<<num;
	cout<<setw(8)<<pow<<endl;
	++num;        // get ready for next power
	pow=num*num*num*num;
}
	return 0;
}
