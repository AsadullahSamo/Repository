#include<iostream>
using namespace std;
int main(){
	
	int i;
	int array[]={5, 10, 15, 20, 25};
	cout<<"The array ";
	for(i=0; i<5; i++)          // display actual array
	{
		cout<<array[i]<<" ";          
	}
	cout<<"\nin reverse order is ";
	for(i=4; i>=0; i--)       // display array in reverse order
	{
		cout<<array[i]<<" ";          
	}
	return 0;
}
