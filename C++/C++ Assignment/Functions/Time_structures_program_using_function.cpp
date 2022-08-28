#include<iostream>
using namespace std;
long hms_to_secs(int, int, int);

int main(){
	
	int hrs, mins, secs;
	char ch;
	cout<<"Enter the time in (hh:mm:ss) format: ";
	cin>>hrs>>ch>>mins>>ch>>secs;
	
	long result=hms_to_secs(hrs, mins, secs);
	cout<<"Total number of seconds in time you entered is "<<result<<endl;
	return 0;
}

long hms_to_secs(int h, int m, int s){
	int result=(h*3600)+(m*60)+s;
	return result;
}
