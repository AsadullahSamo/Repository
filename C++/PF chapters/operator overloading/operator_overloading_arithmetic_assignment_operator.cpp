#include<iostream>
using namespace std;
class Marks{
	private:
		int mark;
	public:
		Marks() : mark(0) {}  // default constructor
		Marks(int m) : mark(m) {}  // parametrized constructor
	void input(){
		cout<<"Enter your marks: ";
		cin>>mark;
	}
	int display(){
		return mark;
	}
	
	// in this case our operator is returning nothing (no objects or value) in previous eg our operator was returning an object
	// if our operator is gonna take only one parameter then no need to specify parameters like in ++ --
	// but here our operator  gonna take one int value and current object
	void operator +=(int bonusmark){
		mark=mark+bonusmark;
	}
};

int main(){
	// m1 calls constructor with one parameter
	// m2 takes input from user using input function
	// m3 calls default constructor
	Marks m1(45), m2, m3;
	cout<<"Your m1 marks are "<<m1.display();
	cout<<endl;
	
	m1+=10;
	cout<<"Your m1 marks after increment of 10 are "<<m1.display()<<endl;
	
	m2.input();
	m2+=15;
	cout<<"Your  m2 marks after increment of 15 are "<<m2.display()<<endl;
	
	cout<<"Initially your m3 marks are "<<m3.display()<<endl;
	m3+=8;
	cout<<"your m3 marks after increment of 8 are "<<m3.display()<<endl;
		return 0;
}
