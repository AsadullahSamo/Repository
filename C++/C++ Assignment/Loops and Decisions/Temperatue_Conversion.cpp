#include<iostream>
using namespace std;
int main(){
	float celsius, farenheit, result1, result2;
	char choice;
	
	cout<<"Type 1: Celsius to Farenheit: f\n";
	cout<<"Type 2: Farenheit to Celsius: c\n";
	cout<<"Enter the choice of conversion either c or f\n";
	cin>>choice;
	
	if(choice=='f'){
		
		cout<<"Enter temperature in celsius:";
		cin>>celsius;
		result1=(celsius*9)/5+32;
		cout<<"In farenheit it is:"<<result1;
		
	} else if(choice='c'){
		cout<<"Enter temperature in farenheit:";
		cin>>farenheit;
		result2=(farenheit-32)*5/9;
		cout<<"In celsius it is:"<<result2;
	}
	
	return 0;
}
