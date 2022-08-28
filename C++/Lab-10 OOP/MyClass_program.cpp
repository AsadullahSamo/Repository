#include<iostream>
using namespace std;
class MyClass{
	private:
		int num;
	public:
		MyClass(){
			num=0;
		}
		
		MyClass(int n1){
			num=n1;
		}
		int getValue(){
			return num;
		}
};
int main(){
	MyClass c1;
	MyClass c2(56);
	cout<<c1.getValue()<<endl;
	cout<<c2.getValue()<<endl;
	return 0;
}
