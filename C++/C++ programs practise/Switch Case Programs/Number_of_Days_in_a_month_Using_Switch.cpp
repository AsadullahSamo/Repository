#include<iostream>
using namespace std;
int main(){
	
	int month;
	cout<<"Enter month number(1-12)\n";
	cin>>month;
	
	switch(month){
		case 1:		cout<<"Total number of days = 31\n";     break;
		case 2:		cout<<"Total number of days = 28/29\n";     break;
		case 3:		cout<<"Total number of days = 31\n";     break;
		case 4:		cout<<"Total number of days = 30\n";     break;
		case 5:		cout<<"Total number of days = 31\n";     break;
		case 6:		cout<<"Total number of days = 30\n";     break;
		case 7:		cout<<"Total number of days = 31\n";     break;
		case 8:		cout<<"Total number of days = 31\n";     break;
		case 9:		cout<<"Total number of days = 30\n";     break;
		case 10:	cout<<"Total number of days = 31\n";     break;
		case 11:	cout<<"Total number of days = 30\n";     break;
		case 12:	cout<<"Total number of days = 31\n";     break;
		default:    cout<<"Invalid number entered\n";
	}
	
	return 0;
}
