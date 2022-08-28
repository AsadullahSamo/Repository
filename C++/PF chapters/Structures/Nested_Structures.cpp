#include<iostream>
using namespace std;
struct Distance{
	int feet;
	float inches;
};
struct Room{
	Distance length;
	Distance width;
};
int main(){
	Room Dining;
	Dining.length.feet=13;
	Dining.length.inches=6.5;
	Dining.width.feet=10;
	Dining.width.inches=0.0;
	
	float l=Dining.length.feet+Dining.length.inches/12;
	float w=Dining.width.feet+Dining.width.inches/12;
	float area=l*w;
	cout<<"Dining Room area is "<<area<<" Square feet\n";
	return 0;
}
