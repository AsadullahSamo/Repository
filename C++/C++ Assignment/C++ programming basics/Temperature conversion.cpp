#include <iostream>
using namespace std;
int main(){

	float celsius, farenheit;
	cout<<"Enter the value of temperature in celsius\n";
	cin>>celsius;
	farenheit=(celsius*9/5)+32;
	cout<<"The value of "<<celsius<<" in farenheit is:"<<farenheit;
	
	return 0;
}
