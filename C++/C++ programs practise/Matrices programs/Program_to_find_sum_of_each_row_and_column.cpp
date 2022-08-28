#include<iostream>
using namespace std;
const int size=3;
int main(){
	int A[size][size];
	int B[size][size];
	int rows, cols, i, sum, sum1, result, result1;
	cout<<"Enter elements of matrix A:\n";
	
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			cin>>A[rows][cols];
		}
	}
	
	
	// adding each row and column
	for(rows=0; rows<size; rows++)
	{
		sum=0, sum1=0;
		for(cols=0; cols<size; cols++)
		{	
		sum+=A[rows][cols];	
		sum1=sum1+A[cols][rows];
		}		
		result=sum;
		cout<<"Sum of row "<<rows+1<<" is "<<result<<endl;
		result1=sum1;
		cout<<"Sum of column "<<rows+1<<" is "<<result1<<endl;
	}
	
	return 0;
}
