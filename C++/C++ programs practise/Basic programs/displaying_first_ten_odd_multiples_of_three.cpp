#include<iostream>
using namespace std;
int main(){
	int i, j, sum=0;
	for(i=1; i<=19; i+=2)
	{
		j=i*3;     // i=3 j=9
		sum+=j;   // sum=3+9
		cout<<j;
		if(i==19)
		break;
		cout<<"+";    // 3+9
	}
	cout<<"="<<sum;
	
	return 0;
}
