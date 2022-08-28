
#include<iostream>
using namespace std;
struct Date{
	int month;
	int day_of_month;
	int year;
	char ch;
};

int main(){
	Date format;
	cout<<"Enter the date in the format mm/dd/yy: ";
	cin>>format.month>>format.ch>>format.day_of_month>>format.ch>>format.year;
	cout<<"You entered: "<<format.month<<"/"<<format.day_of_month<<"/"<<format.year;	
	
	return 0;
}
