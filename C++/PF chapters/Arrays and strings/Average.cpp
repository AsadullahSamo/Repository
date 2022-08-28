#include<iostream>
using namespace std;
int main(){ 
	const int size=6;
	double sales[size];
	double total=0;
	
	cout<<"Enter widget sales for six days:";
	for(int j=1; j<=size; j++){
		cin>>sales[j];
	}
	for(int j=1; j<=size; j++){
		total+=sales[j];
	}
	double average=total/size;
	cout<<"Average="<<average<<endl;
	return 0;
}
