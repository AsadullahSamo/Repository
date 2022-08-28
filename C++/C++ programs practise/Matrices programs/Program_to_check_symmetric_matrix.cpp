#include<iostream>
using namespace std;
const int size=3;
int main(){
	int A[size][size];
	int B[size][size];
	int rows, cols, isSymmetric;
	
	cout<<"Enter the elements for matrix A\n";
	for(rows=0; rows<size; rows++)
		{
			for(cols=0; cols<size; cols++)
			{
				cin>>A[rows][cols];
			}
		}
	
	// making matrix B transpose of A
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			B[rows][cols]=A[cols][rows];
		}	
	}
	
	// checking if it is symmetric or not
	isSymmetric=1;
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			if(A[rows][cols]!=B[rows][cols])
			{
				isSymmetric=0;
				break;
			}
		}
	}
	
	
	if(isSymmetric==1)
	{
		cout<<"The given matrix is symmetric\n";
	}
	else
	{
		cout<<"The given matrix is not symmetric\n";
	}
	// displaying matrix
	for(rows=0; rows<size; rows++)
		{
			for(cols=0; cols<size; cols++)
			{
				cout<<A[rows][cols]<<" ";
			}
			cout<<endl;
		}
	
	
	return 0;
}
