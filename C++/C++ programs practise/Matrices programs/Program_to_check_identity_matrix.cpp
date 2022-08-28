#include<iostream>
using namespace std;
const int size=3;
int main(){
	int A[size][size];
	int rows, cols, isIdentity;
	
	cout<<"Enter the elements for matrix A\n";
	for(rows=0; rows<size; rows++)
		{
			for(cols=0; cols<size; cols++)
			{
				cin>>A[rows][cols];
			}
		}
	
	// check if it Identity matrix or not
	isIdentity=1;
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
		// if main diagonal elements are not equal to 1
			if(rows==cols && A[rows][cols]!=1)
			{
				isIdentity=0;
			}
		// if other elements than main diagonal isn't equal to zero	
			else if(rows!=cols && A[rows][cols]!=0)
			{
				isIdentity=0;
			}
		}	
	}
	
	if(isIdentity==1)
	{
		cout<<"The matrix is identity matrix\n";
	}
	else 
	{
		cout<<"The matrix is not identity matrix\n";
	}
	return 0;
}
