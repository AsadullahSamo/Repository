#include<iostream>
using namespace std;
float circarea(float);
const float PI=3.14;
int main(){
	float radius;
	cout<<"Enter the value of radius: ";
	cin>>radius;
	cout<<"The value of area of circle is "<<circarea(radius)<<endl;
	return 0;
}

float circarea(float radius){
	return radius*radius*PI;
}
