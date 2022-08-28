#include<iostream>
using namespace std;
const int size=3;
int main(){
	int A[size][size];
	int B[size][size];
	int rows, cols;
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
			B[rows][cols]=A[cols][rows];
			cout<<B[rows][cols]<<" ";
		}		
		cout<<endl;
	}
	
	return 0;
}
