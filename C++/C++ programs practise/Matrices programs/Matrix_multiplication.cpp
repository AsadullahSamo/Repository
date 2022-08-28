#include<iostream>
using namespace std;
const int SIZE=3;
int main(){
	int A[SIZE][SIZE]; 
	int B[SIZE][SIZE]; 
	int C[SIZE][SIZE]; 	
	int row, col, i, sum;
	
	// input elements for first matrix
	cout<<"Enter elements in matrix A of size 3x3\n";
	for(row=0; row<SIZE; row++)
	{
		for(col=0; col<SIZE; col++)
		{
			cin>>A[row][col];
		}
	}
	
	// input elements for second matrix
	cout<<"Enter elements in matrix B of size 3x3\n";
	for(row=0; row<SIZE; row++)
	{
		for(col=0; col<SIZE; col++)
		{
			cin>>B[row][col];
		}
	}
	
	
	// multiply both matrices
	for(row=0; row<SIZE; row++)
	{
		for(col=0; col<SIZE; col++)
		{
			sum=0;
			for(i=0; i<SIZE; i++)
			{
				sum=sum+A[row][i]*B[i][col];		
			}
			C[row][col]=sum;
		}
	}
	
	// display product of two matrices
	cout<<"Product of Matrix A*B is\n";
	for(row=0; row<SIZE; row++)
	{
		for(col=0; col<SIZE; col++)
		{
			cout<<C[row][col]<<" ";
			
		}
		cout<<endl;
	}	
	return 0;
}
