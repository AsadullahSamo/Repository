#include<iostream>
using namespace std;
int main(){
	
	int arr[20], i, pint=0, nint=0, odd=0, even=0, zeros=0;
	cout<<"Enter 20 numbers: ";
	
	for(i=0; i<20; i++)
	{
		cin>>arr[i];
		if(arr[i]<0)
		nint++;
		if(arr[i]==0)
		zeros++;
		if(arr[i]>0)
		pint++;
		if(arr[i]%2!=0)
		odd++;
		if(arr[i]%2==0)
		even++;
	}
	
	
	cout<<"Number of +ve integers are: "<<pint<<endl;	
	cout<<"Number of zeros are: "<<zeros<<endl;
	cout<<"Number of -ve integers are: "<<nint<<endl;
	cout<<"Number of odd integers are: "<<odd<<endl;
	cout<<"Number of even integers are: "<<even<<endl;
	return 0;
}
