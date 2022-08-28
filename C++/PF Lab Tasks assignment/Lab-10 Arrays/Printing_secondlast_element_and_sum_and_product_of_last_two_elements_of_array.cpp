#include<iostream>
using namespace std;
int main(){
	
	int i;
	int array[]={25, 20, 15, 10, 5};
	cout<<"The second last element in array {";
	for(i=0; i<5; i++)
	{
		cout<<array[i];
		if(array[i]==array[4])
		break;
		cout<<", ";
	}
	cout<<"} is "<<array[3]<<endl;
	
	cout<<"The sum of last two elements in array {";
	for(i=0; i<5; i++)
	{
		cout<<array[i];
		if(array[i]==array[4])
		break;
		cout<<", ";
	}
	cout<<"} is "<<array[3]+array[4]<<endl;
	
	cout<<"The product of last two elements in array {";
	for(i=0; i<5; i++)
	{
		cout<<array[i];
		if(array[i]==array[4])
		break;
		cout<<", ";
	}
	cout<<"} is "<<array[3]*array[4]<<endl;
	
	return 0;
}
