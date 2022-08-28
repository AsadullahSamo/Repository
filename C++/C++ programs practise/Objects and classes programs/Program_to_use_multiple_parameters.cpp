#include<iostream>
using namespace std;
class Employee{
	private:
		string name;
		int age;
		float salary;
	public:
		void setIntroduce(string n, int a, float s){
			name=n;
			age=a;
			salary=s;
		}	
		void Introduce(){
			cout<<"Name= "<<name<<" ,Age= "<<age<<" ,Salary= "<<salary<<endl;
		}
};
int main(){
	Employee e1, e2;
	e1.setIntroduce("Asad",16,100000);
	e1.Introduce();
	cout<<endl;
	e2.setIntroduce("Awais",13,100000);
	e2.Introduce();
	
	return 0;
}
