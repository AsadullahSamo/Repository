#include<iostream>
#define area(l, w) l*w
#define perimeter(l, w) (2*(l+w))
using std::cout;
using std::cin;
using std::endl;
int main(){
	
	float l, w;
	cout<<"Enter values for length and width: ";
	cin>>l>>w;
	cout<<"The area of rectangle is "<<area(l, w)<<endl;
	cout<<"The perimeter of rectangle is "<<perimeter(l, w)<<endl;
	
	return 0;
}
