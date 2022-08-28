#include<iostream>
using namespace std;
struct time{
	int hrs;
	int mins;
	int secs;
	int result;
};
int main(){
	time t1, t2, t3, t4, t5, t6, t7;
	char ch;
	
	cout<<"Enter first time in (hh:mm:ss) format: ";
	cin>>t1.hrs>>ch>>t1.mins>>ch>>t1.secs;
	t1.result=(t1.hrs*3600)+(t1.mins*60)+t1.secs;
	cout<<"Enter second time in (hh:mm:ss) format: ";
	cin>>t2.hrs>>ch>>t2.mins>>ch>>t2.secs;
	t4.result=t1.hrs+t2.hrs;
	t5.result=t1.mins+t2.mins;
	if(t5.result>59){
		t5.result-=59;
		t4.result++;
	}
	t6.result=t1.secs+t2.secs;
	if(t6.result>59){
		t6.result-=59;
		t5.result++;
	}
	
	t2.result=(t2.hrs*3600)+(t2.mins*60)+t2.secs;
	t3.result=t1.result+t2.result;
	
	
	
	cout<<"Total number of seconds in time you entered is "<<t3.result<<endl;
	
	cout<<"Conversion back in original format is "<<t4.result<<":"<<t5.result<<":"<<t6.result<<endl;
	return 0;
}
