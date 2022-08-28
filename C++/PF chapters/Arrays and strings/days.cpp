#include<iostream>
using namespace std;
int main(){
	int month, day, total_days;
	int days_per_month[12]={31, 28, 31, 30, 31, 30,
						    31, 31, 30, 31, 30, 31};
	cout<<"Enter month(1 to 12):";    cin>>month;    // month=5
	cout<<"Enter day(1 to 31):";    cin>>day;       // day=5
	total_days=day;                                 // total_days=5
	
	for(int j=0; j<month-1; j++){           // 0   1    2     3
		total_days+=days_per_month[j];    // 5+31=36+28=64+31=95+30=125
	}
	cout<<"Total days from start of year is "<<total_days<<endl;
	return 0;
}
