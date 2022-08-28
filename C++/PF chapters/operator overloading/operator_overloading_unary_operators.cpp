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

//overloading ++ when used as prefix
class Count{
	private:
		int value;
	public:
	// constructor to initialize count to 5
	Count() : value(5) {}
	// overload ++ when used as prefix
	void operator ++ (){
		++value;
	}
	// overload ++ when used as postfix
	void operator ++ (int){
		value++;
	}
	void display(){
		cout<<"Count: "<<value<<endl;
	}
};

int main(){
	Count count1;
	count1.display();
	cout<<endl;
	// call the "void operator ++ ()" function
	++count1;
	
	count1.display();
	cout<<endl;
	
	// call the "void operator ++ (int)" function
	count1++;
	
	count1.display();
	cout<<endl;
	
		return 0;
}
