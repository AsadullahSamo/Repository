#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int d, m;
	const int DISTRICT=4;
	const int MONTHS=4;
	double sales[DISTRICT][MONTHS];
	
	for(int d=0; d<DISTRICT; d++){	
	for(int m=0; m<MONTHS; m++){
	
		cout<<"Enter sales for district "<<d+1;
		cout<<", month "<<m+1<<":";
		cin>>sales[d][m];
	}
}
		
		cout<<endl<<endl;
		cout<<"                         Month\n";
		cout<<setw(2  0)<<"1"<<setw(10)<<"2"<<setw(10)<<"3"<<setw(10)<<"4";
		for(int d=0; d<DISTRICT; d++){
			cout<<"\nDistrict "<<d+1;
			for(int m=0; m<MONTHS; m++){
				cout<<setiosflags(ios::fixed)   // not exponential
				    <<setiosflags(ios::showpoint)  // always show point
				    <<setprecision(2)         // point to right is 2
				    <<setw(10)
					<<sales[d][m];
			}
		}
	cout<<endl;
	return 0;
}
