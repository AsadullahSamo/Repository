#include<iostream>
#include<iomanip>
using namespace std;
struct employee{
	int employee_number;
	float employee_compensation;
};
int main(){
	employee e1, e2, e3;
	
	cout<<"Enter 1st employee number and employee compensation: ";
	cin>>e1.employee_number>>e1.employee_compensation;
	cout<<"Enter 2nd employee number and employee compensation: ";
	cin>>e2.employee_number>>e2.employee_compensation;
	cout<<"Enter 3rd employee number and employee compensation: ";
	cin>>e3.employee_number>>e3.employee_compensation;
	cout<<endl;
	
	cout<<"Employee number"<<setw(30)<<"Employee compensation\n";
	cout<<e1.employee_number<<setw(30)<<"$"<<e1.employee_compensation<<endl;
	cout<<e2.employee_number<<setw(30)<<"$"<<e2.employee_compensation<<endl;
	cout<<e3.employee_number<<setw(30)<<"$"<<e3.employee_compensation<<endl;
	
	return 0;
}
