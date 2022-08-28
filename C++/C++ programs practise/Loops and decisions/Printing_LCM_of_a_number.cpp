#include<iostream>
using namespace std;
int main(){
	
// Logic to find LCM of two numbers	
//	1. Input two numbers from user. Store them in some variable say num1 and num2.
//	2. Find maximum between two numbers. Store the result in some variable, say max. Maximum is used to generate next multiple which must be common to both.
//	3. If max is exactly divisible by both numbers. Then you got your answer, store max to some variable say lcm = max. If LCM is found then terminate from loop using break keyword.
//	4. If max is not divisible by both numbers. Then generate next multiple of max.
//	5. Repeat steps 2 to 3 step till LCM is found.
	
	int num1, num2, max, i, lcm=1;
	cout<<"Enter first number: ";
	cin>>num1;
	cout<<"Enter second number: ";
	cin>>num2;
	
	max = (num1>num2) ? num1 : num2;
	i = max;
	while(i)
	{
		if(i%num1==0 && i%num2==0)
		{
			lcm = i;	
			break;
		}	
		i+=max;
	}
	cout<<"LCM of "<<num1<<" and "<<num2<<" is "<<lcm<<endl;
	
	return 0;
}
