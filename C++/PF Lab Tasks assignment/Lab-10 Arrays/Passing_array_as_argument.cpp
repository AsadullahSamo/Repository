#include<iostream>
using namespace std;
void setarr(int []);         // in declaration we write data_type []
void getarr(int []);


int main(){
	
	int array[5];
	int i, j;
	cout<<"Enter five elements of array ";
	setarr(array);         // we mention only name of array in call
	cout<<"You entered {";
	getarr(array);
	cout<<") ";	
	return 0;
}

void setarr(int array[]){
	int i;
	for(i=0; i<5; i++)
	{
		cin>>array[i];
	}
}

void getarr(int array[]){
	int i;
	for(i=0; i<5; i++)
	{
		cout<<array[i];
		if(array[i]==array[4])
		break;
		cout<<", ";
	}
}

