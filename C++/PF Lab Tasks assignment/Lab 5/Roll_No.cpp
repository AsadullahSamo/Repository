#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
	int roll_no;
	for(roll_no=1; roll_no<=20; roll_no++){
		if(roll_no<=9){
			cout<<"21SW0"<<roll_no<<endl;
		} else if(roll_no>9){
			cout<<"21SW"<<roll_no<<endl;
		} // end if else
	} // end for
	return 0;
} // end main
