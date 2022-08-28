#include<iostream>
using namespace std;
int range(int, int);
int main(){
	
	int lowerlimit, upperlimit;
	cout<<"Enter lowerlimit: ";
	cin>>lowerlimit;        // 10
	cout<<"Enter upperlimit: ";  
	cin>>upperlimit;      // 11
	cout<<"Natural numbers between "<<lowerlimit<<" and "<<upperlimit<<" are\n";
	range(lowerlimit, upperlimit);
	return 0;
}

int range(int lowerlimit, int upperlimit){
	if(lowerlimit>upperlimit)
	{
		return 0;
	}
	cout<<lowerlimit<<" ";      // 10 11 
	range(lowerlimit+1, upperlimit);
}
