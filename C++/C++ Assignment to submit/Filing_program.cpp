#include<iostream>
#include<string>
#include<fstream>
#include<iomanip>
using namespace std;
int main(){
	
	// writing in a file
	int Emp_id, Emp_age;
	string Emp_phone;
	string Emp_name, Emp_add, Emp_dept;
	ofstream outfile("Sal.txt");
	// now writing a file
	outfile<<Emp_id<<endl<<Emp_name<<endl<<Emp_add<<endl<<Emp_phone<<endl<<Emp_age<<endl<<Emp_dept<<endl;
	// reading a file
	
	ifstream infile("Emp.txt");
	infile>>Emp_id>>Emp_name>>Emp_add>>Emp_dept>>Emp_phone>>Emp_age;

	cout<<Emp_id<<endl<<Emp_name<<endl<<Emp_add<<endl<<Emp_dept<<endl<<Emp_phone<<endl<<Emp_age;
	return 0;
}

