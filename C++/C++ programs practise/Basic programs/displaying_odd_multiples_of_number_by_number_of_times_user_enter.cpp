#include<iostream>
using namespace std;
int main(){
	int i, j, sum=0, num, times;
	cout<<"Enter an odd number: ";     // 5
	cin>>num;
	cout<<"Enter times to get odd multiples: ";   // i.e wanna display first ten multiples or twenty or 35 etc
	cin>>times;    // 3
	
	for(i=1; i<=(2*times)-1; i+=2)          // i=1
	{
		j=i*num;     // i=3 j=9             // j=1*5
		sum+=j;   // sum=3+9
		cout<<j;
		if(i==(2*times)-1)
		break;
		cout<<"+";    // 3+9
	}
	cout<<"="<<sum;
	return 0;
}
