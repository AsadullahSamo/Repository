#include <iostream>
using namespace std;
int main(){

	float gallons, cubic_foot=7.481, result;
	cout<<"Enter the number of gallons\n";
	cin>>gallons;
	result=cubic_foot*gallons;
	cout<<"The equivalent of "<<gallons<<"gallons in cubic feet is:"<<result;
	
	return 0;
}
