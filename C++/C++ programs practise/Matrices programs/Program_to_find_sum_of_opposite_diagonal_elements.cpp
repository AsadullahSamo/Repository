#include<iostream>
using namespace std;
const int size=3;
int main(){
	int A[size][size];
	int B[size][size];
	int rows, cols, sum=0;
	cout<<"Enter elements of matrix A:\n";
	
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			cin>>A[rows][cols];
		}
	}
	
	
	// sum of minor diagonal elements 
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
		if(rows+cols==size-1)
			{
			sum+=A[rows][cols];	
			}	
		}		
	}
	
	cout<<"Sum of main diagonal elements are "<<sum<<endl;
	return 0;
}
