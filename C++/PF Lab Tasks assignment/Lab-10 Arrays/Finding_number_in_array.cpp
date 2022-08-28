#include<iostream>
using namespace std;
int main(){
	
	int num, i;
	
	int array[10]={1, 2, 3, 5, 8, 10, 12, 23, 28, 15};
	cout<<"Enter a number: ";
	cin>>num;
	
	for(i=0; i<10; i++)
	{
		if(num==array[i])
		{
		cout<<"Number is Found";    // if number is found print this line
		exit(0);       // and exit from the program
		}
	} // end of for
	cout<<"Number is not found";		// if none of the for loop condition matches, then print this line
	return 0;
}
