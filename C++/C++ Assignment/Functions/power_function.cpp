#include<iostream>
using namespace std;
double power(double num, int p=2);    // p has default value 2
int main(){
	
	double num, ans;
	int pow;       char yesno;
	cout<<"Enter the number: ";
	cin>>num;
	cout<<"Want to enter a power (y/n) ?";
	cin>>yesno;
	if(yesno=='y')
	{
		cout<<"Enter a power: ";
		cin>>pow;
		ans=power(num, pow);
	}
	else
	{
		ans=power(num, 2);             // ans=125
	}
	cout<<"Answer = "<<ans<<endl;      
	return 0;
}

double power(double num, int p){     
	double result=1.0;
	for(int i=0; i<p; i++)      // num=5 p=3
	{
		result=result*num;         //   5*5=25*5=125
	}
	return result;     // it'll return result to calling function
}
