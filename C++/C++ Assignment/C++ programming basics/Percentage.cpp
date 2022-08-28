#include<iostream>
using namespace std;
int main(){
	float percentage;
	int obtain, total=850;
	
	cout<<"Enter obtained marks:";
	cin>>obtain;
	
	percentage=(float)(obtain*100)/850;
	cout<<"The percentage is:"<<percentage;
	return 0;
}
