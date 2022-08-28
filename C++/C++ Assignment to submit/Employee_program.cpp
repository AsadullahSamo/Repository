#include<iostream>
#include<iomanip>
using namespace std;
class employee{
	public:
	string emp_name;
	int emp_id;
	float emp_salary;
};
class salarycalc : public employee{
	public:
	salarycalc(string en, int eid, float es){
		emp_name=en;
		emp_id=eid;
		emp_salary=es;
	}
	float basicpay, hra, pf, da, np, gp;
	public:
	void getinfo(){
		cout<<"Enter the basic pay ";
		cin>>basicpay;
		cout<<"Enter the human resource allowance ";
		cin>>hra;
		cout<<"Enter the provisional fund ";
		cin>>pf;
		cout<<"Enter the Dearness Allowance ";
		cin>>da;
	}
	void calc(){
		gp=da+hra+basicpay;
		np=basicpay+hra+pf+da;
	}
	void display(){
		cout<<"Eid\t"<<"Name\t"<<"Sal\t"<<"BPay\t"<<"HRA\t"<<"PF\t"<<"DA\t"<<"GP\t"<<"Np\t"<<endl;
		cout<<emp_id<<"\t"<<emp_name<<"\t"<<emp_salary<<"\t"<<basicpay<<"\t"<<hra<<"\t"<<pf<<"\t"<<da<<"\t"<<gp<<"\t"<<np<<endl;
	}
};
int main(){
	salarycalc s1("Asad", 1, 500.45);
	
	s1.getinfo();
	s1.calc();
	s1.display();
	
	return 0;
}
