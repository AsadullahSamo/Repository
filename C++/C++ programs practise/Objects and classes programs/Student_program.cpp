#include<iostream>
using namespace std;
class Student{
	private:
	string name;
	int roll_no;
	public:
	void setDetails1(string n){
		name=n;
	}
	void setDetails2(int r){
		roll_no=r;	
	}
	string getDetails1(){
		return name;	
	}
	int getDetails2(){
		return roll_no;
	}
};

int main(){
	Student Asad;
	Asad.setDetails1("Asad");
	Asad.setDetails2(36);
	cout<<"The name of student is "<<Asad.getDetails1()<<endl;
	cout<<"The roll number of student is "<<Asad.getDetails2()<<endl;
	
	
	
	return 0;
}
