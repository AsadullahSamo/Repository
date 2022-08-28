#include<iostream>
using namespace std;
struct time{
	int hrs;
	int mins;
	int secs;
};
void swap(time&, time&);

int main(){
	time t1, t2;
	char colon;
	cout<<"Enter first time value in (hh:mm:ss) format: ";
	cin>>t1.hrs>>colon>>t1.mins>>colon>>t1.secs;
	cout<<"Enter second time value in (hh:mm:ss) format: ";
	cin>>t2.hrs>>colon>>t2.mins>>colon>>t2.secs;
	swap(t1, t2);
	
	cout<<"After swapping time values first time is ";
	cout<<t1.hrs<<":"<<t1.mins<<":"<<t1.secs<<endl;
	cout<<"After swapping time values second time is ";
	cout<<t2.hrs<<":"<<t2.mins<<":"<<t2.secs<<endl;
	return 0;
}

void swap(time& a, time& b){
	time temp=a;
	a=b;
	b=temp;
}
