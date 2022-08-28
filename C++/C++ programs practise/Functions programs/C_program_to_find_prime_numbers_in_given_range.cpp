#include<iostream>
using namespace std;
int checkprime(int);
void printprimes(int, int);
int main(){
	int lowerlimit, upperlimit;
	cout<<"Enter lower limit\n";
	cin>>lowerlimit;
	cout<<"Enter upper limit\n";
	cin>>upperlimit;
	printprimes(lowerlimit, upperlimit);	
	return 0;
}

void printprimes(int lowerlimit, int upperlimit){
	cout<<"All prime numbers between "<<lowerlimit<<" and "<<upperlimit<<" are ";
	while(lowerlimit<=upperlimit)
	{
		if(checkprime(lowerlimit))
		{
			cout<<lowerlimit<<" ";
		}
		lowerlimit++;
	}
}

int checkprime(int num){
	for(int j=2; j<=num/2; j++)
	{
		if(num%j==0)
		{
			return 0;     // return 0 if number is not prime 
		}
	}
	return 1;
}
