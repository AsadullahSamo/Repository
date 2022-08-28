#include<iostream>
using namespace std;
int main(){
	const int SIZE=5;
	int arr1[SIZE], arr2[SIZE], sum_arr[SIZE];
	
	cout<<"Enter first array elements\n";
	for(int k=0; k<SIZE; k++){
		cin>>arr1[k];
	}  
	cout<<"Enter second array elements\n";
	for(int k=0; k<SIZE; k++){
		cin>>arr2[k];
	}
	for(int k=0; k<SIZE; k++){
	sum_arr[k]=arr1[k]+arr2[k];
	cout<<"Sum of "<<arr1[k]<<" and "<<arr2[k]<<" is "<<sum_arr[k]<<endl;
	}
	
	return 0;
}
