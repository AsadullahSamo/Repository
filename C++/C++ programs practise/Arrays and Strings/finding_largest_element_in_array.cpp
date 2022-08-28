#include<iostream>
using namespace std;
int maxint(int[], int);

int main(){
	
	int i, SZ;
	cout<<"Enter array size: ";
	cin>>SZ;
	int arr[SZ];
	cout<<"Enter array elements: ";
	for(i=0; i<SZ; i++)
	{
		cin>>arr[i];
	}
	cout<<"Largest element in array {";
	for(i=0; i<SZ; i++)
	{
		cout<<arr[i];
		if(arr[i]==arr[SZ-1])         
		break;                      // exit from loop
		cout<<", ";                  // else print ,' '
	}
	cout<<"} is ";
	
	int c=maxint(arr, SZ);     // c var to store return value from function
	cout<<c<<endl;
	
	return 0;
}

int maxint(int a[], int s)
{
	int max=a[0];     // initializing array
	for(int i=0; i<s; i++)
	{
		if(a[i]>max)       // if any of index is greater than initialized index
		{
		 max=a[i];
		}
	}
	return max;       // put max=that greater index
}
