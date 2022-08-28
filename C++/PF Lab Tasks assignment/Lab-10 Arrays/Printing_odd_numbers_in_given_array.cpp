#include<iostream>
using namespace std;
int main(){
	
	int i;
	int array[10]={1, 2, 3, 5, 8, 10, 12, 23, 28, 15};
	cout<<"The odd numbers in array ";
	for(i=0; i<10; i++)
	{
		cout<<array[i]<<"  ";
	}
	
	cout<<"\nare ";
	for(i=0; i<10; i++)
	{
		if(array[i]%2!=0)
		{
			cout<<array[i]<<"  ";
		}
	}
	
	return 0;
}
