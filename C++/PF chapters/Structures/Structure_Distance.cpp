#include<iostream>
using namespace std;
struct Distance{
	int feet;
	float inches;
};
float convert(Distance);
int main(){
	Distance D;
	cout<<"Enter feet "; cin>>D.feet;
	cout<<"Enter inches "; cin>>D.inches;
	cout<<"Inches="<<convert(D);
	
	return 0;
}

float convert(Distance D){
	int f=D.feet*12;
	float inch=D.inches+f;
	return inch;
}
