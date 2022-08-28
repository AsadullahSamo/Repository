#include<iostream>
using namespace std;
const int SIZE=3;
int add(int [], int[]);
int main(){
	int a[SIZE];
	int b[SIZE];
	int c[SIZE];
	cout<<"Enter first array\n";
	for(int i=0; i<SIZE; i++){
		cin>>a[i];
	} 
	cout<<"Enter second array\n";
	for(int i=0; i<SIZE; i++){
		cin>>b[i];
	}
	 
	 cout<<"Addition of two matrices is ";
	 add(a, b);
	return 0;
}

int add(int a[], int b[]){
	int addition=0;
	int c[SIZE];
	
	for(int i=0; i<SIZE; i++)
	{
	c[i]=a[i]+b[i];
	cout<<c[i]<<"  ";
	} // end of for
} // end of function 
