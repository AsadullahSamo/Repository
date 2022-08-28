#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
	// demonstrate setfill and setw
	int x=505;
   //empty boxes will be set by setw and 9 of them filled with * by setfill
	cout<<setfill('*')<<setw(12)<<x<<endl;
	
	// demonstrate setprecision
	float f=3.662367;
	cout<<setprecision(2)<<f<<endl;
	cout<<setprecision(4)<<f<<endl;
	cout<<setprecision(12)<<f<<endl;       // random values if precision exceeds
	return 0;
}
