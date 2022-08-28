#include<iostream>
using namespace std;

/*
syntax for operator overloading
 	
	 class className{
public:
 	returnType operator symbol(arguments){
 	....code....
	}
	...code...
};

*/

//overloading binary operator and defining function outside class
class Marks{
	private:
		int intmark;       // internal mark
		int extmark;       // external mark
	public:
		Marks () : intmark(0), extmark(0) {}   // default constructor to initialize to zero	
		Marks (int im, int em) : intmark(im), extmark(em) {} // parametrized constructor which takes values from user and placec it into these class members(intmark and extmark)  	
	void input(){
		cout<<"Enter internal marks: ";   cin>>intmark;
		cout<<"Enter external marks: ";   cin>>extmark;
	}
	void display(){
		cout<<"Internal mark: "<<intmark<<endl;
		cout<<"External mark: "<<extmark<<endl;
	}
	Marks operator + (Marks m){
		// as this operator is returning object of type marks so create a temp object
		Marks temp;
		temp.intmark=intmark+m.intmark; // we want to store mark of current object "intmark" + passed object "m.intmark"
		temp.extmark=extmark+m.extmark;
		return temp;
	}
	Marks operator - (Marks m); // declaration of - operator function
};

/* to define outside class we use 
returnType name-of-class :: operator symbol (parameters){
	body
} */

Marks Marks :: operator - (Marks m){
	Marks temp;
	temp.intmark=intmark-m.intmark;
	temp.extmark=extmark-m.extmark;
	return temp;
}

int main(){
	Marks m1(10, 20), m2(30, 40), m4, m5;
	Marks m3= m1+m2; // as + operator should return object of type Marks 
	//so return type of our operator function is gonna be Marks at line
	m3.display();
	cout<<endl;
	
	
	m4.input();
	m5.input();
	Marks m6= m4-m5;
	m6.display();
	cout<<endl;
		return 0;
}
