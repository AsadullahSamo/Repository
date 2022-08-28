#include<iostream>
using namespace std;
struct point{
	int xCo;        // x co-ordinate
	int yCo;        // y co-ordinate
};

int main(){
	
	point p1, p2, p3;
	cout<<"Enter coordinates for p1: ";
	cin>>p1.xCo>>p1.yCo;
	cout<<"Enter coordinates for p2: ";
	cin>>p2.xCo>>p2.yCo;
	p3.xCo=p1.xCo+p2.xCo;
	p3.yCo=p1.yCo+p2.yCo;
	cout<<"Coordinates of p1+p2 are: "<<p3.xCo<<", "<<p3.yCo<<endl;
	
	return 0;
}
