#include<iostream>
using namespace std;
class Counter{
	private:
		unsigned int count;
	public:
		Counter() : count(0){
		cout<<"I am the constructor\n";
		}
		void inc_count(){
			count++;
		}
		int get_count(){
			return count;
		}
		
};

int main(){
	Counter c1, c2, c3, c4;   // here it executes automatically as many times as object is created 
	cout<<"Before increment\n";
	cout<<"c1 = "<<c1.get_count()<<endl;
	cout<<"c2 = "<<c2.get_count()<<endl;
	
	c1.inc_count();
	c2.inc_count();
	c2.inc_count();
	
	cout<<"After increment\n";
	cout<<"c1 = "<<c1.get_count()<<endl;
	cout<<"c2 = "<<c2.get_count()<<endl;
	
}
