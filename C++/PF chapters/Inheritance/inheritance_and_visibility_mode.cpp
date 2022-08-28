#include<iostream>
using namespace std;

// base class
class Animal{
	public:
		void eat(){
			cout<<"Animal can eat\n";
		}
		void sleep(){
			cout<<"Animal can sleep\n";
		}		
};

// derived class 
class Lion : public Animal{
	public:
	void fastspeed(){
		cout<<"I can run very fast\n";
	}
};
/*
// derived class syntax
class {{class derived-class-name}} : {{visibility-mode}} {{base-class-name}} 
{
 	class members/methods/etc..	
};
Note: 
1. Default visibility mode is private
2. Private visibility mode:- public members of base class become private members of derived class
3. public visibility mode:- public members of base class become public members of derived class
4. private members of the base class will never be inherited
*/


int main(){
		Lion lion1; // create object of lion class
		Animal animal1; // create object of animal class
		
		// derived class have 3 members, two from base class and one its own
		//calling base class members
		lion1.eat();
		lion1.sleep();
		//calling derived class members
		lion1.fastspeed();
		
		// base class has 2 members
		animal1.eat();
		animal1.sleep();
		return 0;
}
