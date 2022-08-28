#include<iostream>
using namespace std;
const int size=3;
int main(){
	int A[size][size];
	int B[size][size];
	int rows, cols, result, multiplier;
	cout<<"Enter elements of matrix A:\n";
	
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			cin>>A[rows][cols];
		}
	}
	
	cout<<"Enter multiplier ";
	cin>>multiplier;
	
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			result=multiplier*A[rows][cols];
			cout<<result<<"\t";
		}
		cout<<endl;
	}
	return 0;
}
