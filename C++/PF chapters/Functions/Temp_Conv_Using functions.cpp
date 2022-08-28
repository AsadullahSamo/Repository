#include<iostream>
using namespace std;
float temp(float);
int main(){
	int chc;
	cout<<"Enter temperature"<<endl;
	cout<<"Type 1: Press c to calculate from celsius to farenheit"<<endl;
	cout<<"Type 1: Press f to calculate from farenheit to celsius"<<endl;
	cin>>chc;
	temp(chc);
	return 0;
}
float temp(float temp){
	float celsius, farenheit, result;
	if(temp=='c'){
		cout<<"Enter temperature in celsius";
		cin>>celsius;
		result=(celsius*9)/5+32;
		cout<<"Equivalent in farenheit is "<<result<<endl;
	} else if(temp=='f'){
		cout<<"Enter temperature in farenheit";
		cin>>farenheit;
		result=(farenheit-32)*5/9;
		cout<<"Equivalent in celsius is "<<result<<endl;
	}
	return temp;
	}
