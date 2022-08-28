#include<iostream>
using namespace std;
class employee{
	private:
		int employee_no;
		float employee_salary;
	public:
		void setEmpno(int n){
			employee_no=n;
			cin>>employee_no;
		}
		void setEmpsr(int s){
			employee_salary=s;
			cin>>employee_salary;
		}
		int getEmpno(){
			return employee_no;
		}
		int getEmpsr(){
			return employee_salary;
		}
};
int main(){
	int a;
	float c;
	employee e1, e2, e3;
	cout<<"Enter first second and third employee number: ";
	e1.setEmpno(a);
	e2.setEmpno(a);
	e3.setEmpno(a);
	cout<<"Enter first, second and third employee's salary: ";
	e1.setEmpsr(c);
	e2.setEmpsr(c);
	e3.setEmpsr(c);
	
	cout<<"Employee Number\t\t Employee Salary\n";
	cout<<e1.getEmpno()<<"\t\t\t\t"<<e1.getEmpsr()<<endl;
	cout<<e2.getEmpno()<<"\t\t\t\t"<<e2.getEmpsr()<<endl;
	cout<<e3.getEmpno()<<"\t\t\t\t"<<e3.getEmpsr()<<endl;
	
	return 0;
}
