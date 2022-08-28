#include<iostream>
using namespace std;
class employee{
	private:			
		int emp_num;
		float emp_compens;
	public:
		void setData()
		{
			cout<<"Enter employee number: ";     
			cin>>emp_num;
			cout<<"Enter employee compensation: "; 
			cin>>emp_compens;
		} // end of function
		void showData()
		{
				cout<<"Employee number is "<<emp_num<<endl;
				cout<<"Employee compensation is "<<emp_compens; 
				cout<<endl;
		}
};

int main(){
	
	employee e1, e2, e3;
	
	e1.setData();
	e2.setData();
	e3.setData();
	cout<<endl;
	
	e1.showData();
	e2.showData();
	e3.showData();
	
	
	return 0;
}
