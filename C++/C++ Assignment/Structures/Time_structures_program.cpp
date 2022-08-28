#include<iostream>
using namespace std;
struct time{
	int hrs;
	int mins;
	int secs;
	int result;
};
int main(){
	time t1;
	char ch;
	cout<<"Enter the time in (hh:mm:ss) format: ";
	cin>>t1.hrs>>ch>>t1.mins>>ch>>t1.secs;
	t1.result=(t1.hrs*3600)+(t1.mins*60)+t1.secs;
	cout<<"Total number of seconds in time you entered is "<<t1.result<<endl;
	
	return 0;
}
