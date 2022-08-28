#include<iostream>
using namespace std;
const int size=3;
const int size2=2;
int main(){
	
	// Determinant of matrix 2X2
	int B[size2][size2];
	int rows, cols;
	cout<<"Enter elements of matrix A:\n";
	for(rows=0; rows<size2; rows++)
	{
		for(cols=0; cols<size2; cols++)
		{
			cin>>B[rows][cols];
		}
	}
	int det1= B[0][0]*B[1][1]-B[0][1]*B[1][0];
	cout<<"Determinant of 2X2 matrix is "<<det1<<endl;
	
	
	
	// Determinant of matrix 3X3
	int A[size][size];
	int a, b, c, d, e, f, g, h, i;
	cout<<"Enter elements of matrix A:\n";
	for(rows=0; rows<size; rows++)
	{
		for(cols=0; cols<size; cols++)
		{
			cin>>A[rows][cols];
		}
	}
	
	a=A[0][0];       b=A[0][1];         c=A[0][2];
	d=A[1][0];		 e=A[1][1];			f=A[1][2];
	g=A[2][0];		 h=A[2][1];			i=A[2][2];
	int det2=a*(e*i-f*h)-b*(d*i-f*g)+c*(d*h-e*g);
	cout<<"Determinant of 3X3 matrix is "<<det2<<endl;
	return 0;
}
