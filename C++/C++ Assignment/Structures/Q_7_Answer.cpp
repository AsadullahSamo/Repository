#include<iostream>
#include<iomanip>
#include<conio.h>
using namespace std;
struct employee{
	int employee_number;
	float employee_compensation;
};
struct Date{ 
	int month;
	int day_of_month;
	int year;
};
enum etype{laborer, secretary, manager, accountant, executive, researcher};
int main(){
	int count=0;
	string ch;
	etype x, y, z;
	Date format, format1, format2;
	employee e1, e2, e3;
	
	cout<<"Enter employee number, employee compensation and date: ";
	cin>>e1.employee_number>>e1.employee_compensation>>format.month>>format.day_of_month>>format.year;
	cout<<"Enter employee number, employee compensation and date: ";
	cin>>e2.employee_number>>e2.employee_compensation>>format1.month>>format1.day_of_month>>format1.year;
	cout<<"Enter employee number, employee compensation and date: ";
	cin>>e3.employee_number>>e3.employee_compensation>>format2.month>>format2.day_of_month>>format2.year;
	
	for(int count=0; count<=2; count++){
	cout<<endl;
	
	cout<<"Enter employee type (first letter only)";
	cout<<" laborer, secretary, manager, accountant, executive, researcher): ";
	switch(getche()){        // switch statement to input 
		case 'l':
		x=laborer;
		break;
		case 's':
		x=secretary;
		break;
		case 'm':
		x=manager;
		break;
		case 'a':
		x=accountant;
		break;
		case 'e':
		x=executive;
		break;
		case 'r':
		x=researcher;
		break;
	}
	switch(x){               // switch statement for output
		case 0:
		ch="laborer";
		break;
		case 1:
		ch="secretary";
		break;
		case 2:
		ch="manager";
		break;
		case 3:
		ch="accountant";
		break;
		case 4:
		ch="executive";
		break;
		case 5:
		ch="researcher";
		break;
	}
	cout<<endl;
	cout<<ch;
}
	cout<<"\nEmployee type"<<setw(30)<<"Employee number"<<setw(30)<<"Employee compensation"<<setw(30)<<"Date"<<endl;
	cout<<ch<<setw(30)<<e1.employee_number<<setw(30)<<e1.employee_compensation<<setw(30)<<format.month<<"/"<<format.day_of_month<<"/"<<format.year<<endl;
	cout<<ch<<setw(30)<<e2.employee_number<<setw(30)<<e2.employee_compensation<<setw(30)<<format1.month<<"/"<<format1.day_of_month<<"/"<<format1.year<<endl;
	cout<<ch<<setw(30)<<e3.employee_number<<setw(30)<<e3.employee_compensation<<setw(30)<<format2.month<<"/"<<format2.day_of_month<<"/"<<format2.year<<endl;
	return 0;
}
