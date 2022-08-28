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
	Count operator ++ (){
		Count temp;
		// here value is the value attribute of the calling object
		temp.value=++value;
		return temp;
	}
	// overload ++ when used as postfix and when assigning
	Count operator ++ (int){
		Count temp;
		temp.value=value++;
		return temp;
	}
	Count display(){
		cout<<"Count: "<<value<<endl;
	}
};

int main(){
	Count count1, result;
	result=++count1;
	result.display();
	cout<<endl;
	
	
	result=count1++;
	result.display();
	cout<<endl;
		return 0;
}
