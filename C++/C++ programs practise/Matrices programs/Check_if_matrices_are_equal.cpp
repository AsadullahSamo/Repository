#include<iostream>
using namespace std;
const int size=3;
int main(){
	int A[size][size];
	int B[size][size];
	int rows, cols, isequal;
	cout<<"Enter elements of matrix A:\n";
	
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			cin>>A[rows][cols];
		}
	}
	
	cout<<"Enter elements of matrix B:\n";
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			cin>>B[rows][cols];
		}
	}
	
	// Assumes that the matrices are equal 
	isequal=1;
	
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			if(A[rows][cols]!=B[rows][cols])
			{
				isequal=0;
				break;
			}
		}
	}
	
	if(isequal==1)
	{
		cout<<"Matrices are equal ";
	}
	else
	{
		cout<<"Matrices are not equal ";
	}
	return 0;
}
