#include<iostream>
using namespace std;

double diameter(double);
double circumference(double);
double area(double);
const float PI=3.14;

int main(){

	double num;
	cout<<"Enter radius: ";
	cin>>num;
	
	double result1=diameter(num);
	cout<<"Diameter of circle is "<<result1<<endl;
	double result2=circumference(num);
	cout<<"Circumference of circle is "<<result2<<endl;
	double result3=area(num);
	cout<<"Area of circle is "<<result3<<endl;
	return 0;
}

double diameter(double num){
	return (num*2);
}

double circumference(double num){
	return (2*PI*num);
}

double area(double num){
	return (PI*num*num);
}
