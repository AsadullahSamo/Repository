#include<iostream>
using namespace std;
int main(){
	int num, rev=0;
	cout<<"Enter a number to print it in reverse: ";
	cin>>num;
	// 1.Extract last digit of the given number.
	// 2.Add the extracted last digit to sum.
	// 3.Remove last digit from given number. As it is processed and not required any more.cin>>num;
	while(num!=0)
	{
		// Increase place value of rev and add last digit to it
		rev = (rev*10) + (num%10);
		// Remove last digit from num
		num = num/10;      // num = 123
	}
	cout<<"Digits in reverse are: "<<rev<<endl;

	return 0;
}
