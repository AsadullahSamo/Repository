#include<iostream>
#include<iomanip>
using namespace std;
struct Distance{
	int feet;
	float inches;
};
struct Volume{
	Distance length;
	Distance width;
	Distance height;
};

int main(){
	
	Volume vol1={ {10, 5.7}, {11, 7.4}, {7, 3.8} };	
	float l, w, h;
	
	l=vol1.length.feet+vol1.length.inches/12;
	w=vol1.width.feet+vol1.width.inches/12;
	h=vol1.height.feet+vol1.height.inches/12;
	cout<<"Volume of room is "<<l*w*h<<", cubic feet\n";
	
	return 0;
}
