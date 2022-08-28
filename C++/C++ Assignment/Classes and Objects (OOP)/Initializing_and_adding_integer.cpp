#include<iostream>
using namespace std;
class Int{
	private:
		int integer;
	public:
		Int() : integer(0) {};
		Int(int ing) : integer(ing) {} ;
	void addInt(Int i2, Int i3)
	{
		integer=i2.integer+i3.integer;
	}
	void display()
	{
		cout<<integer;
	}
};

int main(){
	Int int1(5), int2(7), int3;
	int3.addInt(int1, int2);
	cout<<"Integer 3 = ";
	int3.display();
	cout<<endl;
	
	return 0;
}
