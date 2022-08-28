#include<iostream>
using namespace std;
struct room{
	float length;      // all these four or how many they are are called members of structure
	float width;
	float height;
	string purpose;
};
int main(){
	room r={10.5, 12.5, 14.5, "its attractive design"};
	cout<<"The length of this room is "<<r.length<<endl;
	cout<<"The width of this room is "<<r.width<<endl;
	cout<<"The height of this room is "<<r.height<<endl;
	cout<<"The purpose of this room is "<<r.purpose<<endl;
	
	room x=r;
	cout<<x.purpose;
}
