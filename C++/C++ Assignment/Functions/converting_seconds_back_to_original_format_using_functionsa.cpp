#include<iostream>
using namespace std;
struct time{
	int hrs;
	int mins;
	int secs;
	int result;
};
long time_to_secs(time);
time secs_to_time(long);

int main(){
	time t1, t2, t3;
	char ch;
	
	cout<<"Enter first time in (hh:mm:ss) format: ";
	cin>>t1.hrs>>ch>>t1.mins>>ch>>t1.secs;
	cout<<"Enter second time in (hh:mm:ss) format: ";
	cin>>t2.hrs>>ch>>t2.mins>>ch>>t2.secs;
	t3=secs_to_time(time_to_secs(t1)+time_to_secs(t2));
	cout<<"The result is "<<t3.hrs<<":"<<t3.mins<<":"<<t3.secs<<endl;
	return 0;
}

long time_to_secs(time t){
	return (t.hrs*3600)+(t.mins*60)+t.secs;
}

time secs_to_time(long s){
	time t;
	t.secs=s%60;            // 20
	t.hrs=s/3600;          // 2
	t.mins=((s-t.secs)%3600)/60;          // 56           
	if(t.secs>59)     
	{
		t.secs-=59;             
		t.mins++;              
	}
	if(t.mins>59)           
	{
		t.mins-=59;
		t.hrs++;
	}
	return t;
}
