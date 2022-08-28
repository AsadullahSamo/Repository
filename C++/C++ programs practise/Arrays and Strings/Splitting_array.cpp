#include<iostream>
using namespace std;
int main(){
	
	int SZ;	
	cout<<"Enter size of array: ";
	cin>>SZ;
	int arr[SZ], i;
	cout<<"Enter "<<SZ<<" numbers: ";
	for(i=0; i<SZ; i++)
	{
		cin>>arr[i];
	}
	
	cout<<"Initial Array\n{ ";
	for(i=0; i<SZ; i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<"}"<<endl;
	
	cout<<"After splitting Array 1 is \n{ ";
	for(i=0; i<SZ/2; i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<"}"<<endl;
	
	cout<<"After splitting Array 2 is \n{ ";
	for(i=SZ/2; i<SZ; i++)
	{
		cout<<arr[i]<<" ";
	}
	cout<<"}"<<endl;
	
	return 0;
}
