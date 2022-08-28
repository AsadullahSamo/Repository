#include<iostream>
using namespace std;
int main(){
	int SIZE[5];
	int total=0;
	cout<<"Enter marks of five students\n";
	for(int j=0; j<5; j++){
		cin>>SIZE[j];
		total+=SIZE[j];
	}
	cout<<"The total marks are "<<total<<endl;
	float average=total/5;
	cout<<"The average is "<<average<<endl;
	return 0;
}
