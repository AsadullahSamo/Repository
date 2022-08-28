#include<iostream>
using namespace std;
struct room{
	float length;
	float width;
	float height;
	string purpose;
};
int main(){
	room r;
	r.length=12.5;
	r.width=10.3;
	r.height=8.1;
	r.purpose="ease of basic equipments";
	cout<<"The length of this room is "<<r.length<<endl;
	cout<<"The width of this room is "<<r.width<<endl;
	cout<<"The height of this room is "<<r.height<<endl;
	cout<<"The purpose of this room is "<<r.purpose<<endl;
	
	float volume=r.length*r.width*r.height;
	cout<<"The volume of this room is "<<volume;
	return 0;
}
