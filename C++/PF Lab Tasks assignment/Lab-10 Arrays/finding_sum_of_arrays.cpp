#include<iostream>
using namespace std;
int main(){
	
	int i, sum=0;
	int array[]={5, 10, 15, 20, 25};
	cout<<"The sum of array ";
	for(i=0; i<5; i++)
	{
		sum=sum+array[i];         // compute sum
		cout<<array[i];          // display array elements
		if(array[i]==array[4])  // if array=25 don't print + and get outta loop
		break;
		cout<<"+";             // else print +
	}
	cout<<"="<<sum<<endl;       //  display sum
	
	return 0;
}
