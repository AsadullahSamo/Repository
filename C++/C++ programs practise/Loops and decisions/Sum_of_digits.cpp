#include<iostream>
using namespace std;
int main(){
	int num, sum=0;
	cout<<"Enter a number to find sum and product of its digits: ";
	cin>>num;
	// 1.Extract last digit of the given number.
	// 2.Add the extracted last digit to sum.
	// 3.Remove last digit from given number. As it is processed and not required any more.cin>>num;
	while(num!=0)
	{
		// Get last digit from num
		sum = sum + num%10;
		// Remove last digit from num
		num = num/10;
	}
	cout<<"Sum of digits is: "<<sum<<endl;

	return 0;
}
