#include<iostream>
using namespace std;
int main(){
	
	int age[4];
	for(int j=0; j<4; j++){
		cout<<"Enter any number:";
		cin>>age[j];                          //  in same order printing
	}
	for(int j=0; j<4; j++){
		cout<<"You entered:"<<age[j]<<endl;
	}
	
	cout<<endl<<endl<<endl;
	
	
	
	cout<<"In reverse order\n";
	for(int j=3; j>=0; j--){
		cout<<"you entered:"<<age[j]<<endl;
	}
	return 0;
}
