#include<iostream>
using namespace std;
int main(){

	int sum=0, avg;
	int count=0;
	for(int i=1; i<=100; i++){
		sum+=i;
		count++;
		avg=sum/count;
	}
	cout<<"Sum is:"<<sum<<endl;
	cout<<"Average is:"<<avg<<endl;
	return 0;
}
