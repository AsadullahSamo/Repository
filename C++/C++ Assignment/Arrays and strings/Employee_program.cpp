#include<iostream>
#include<iomanip>
#include<cstring>
using namespace std;
class employee{
	private:
		char name[50];
		long emp_num;
	public:
		void getData(){	
			cout<<"Enter employee name ";
			cin>>name;
			cout<<"Enter employee number: ";
			cin>>emp_num;		
		}
		void putData(){
			cout<<setw(10)<<name<<setw(15)<<emp_num<<endl;
		}
};

int main(){
	employee e[100];     // array of type employee
	cout<<"Enter data for 100 employees\n";
	for(int i=0; i<100; i++)
	{
		e[i].getData();
	}
	cout<<endl;
	cout<<"Employee Number\t Employee Number\n";
	for(int i=0; i<100; i++)
	{
		e[i].putData();
	}
	return 0;
}
