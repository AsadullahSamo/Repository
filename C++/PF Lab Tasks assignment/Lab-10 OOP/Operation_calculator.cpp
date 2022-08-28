#include<iostream>
using namespace std;
class Calculator{
	private:
		int num1, num2;
	public:
		void setNum(int n1, int n2){
				num1=n1;
				num2=n2;
				cin>>num1>>num2;
		}
		int getAdd(){
			return num1+num2;
		}
		
		int getSub(){
			return num1-num2;
		}
		
		int getMult(){
			return num1*num2;
		}
		
		int getDiv(){
			return num1/num2;
		}
};
int main(){
	int a, b;
	Calculator c1, c2;
	char ch;
	cout<<"Enter two numbers: ";            
	c1.setNum(a, b);
	cout<<"Addition of two numbers is "<<c1.getAdd()<<endl;
	cout<<"Difference of two numbers is "<<c1.getSub()<<endl;
	cout<<"Multiplication of two numbers is "<<c1.getMult()<<endl;
	cout<<"Division of two numbers is "<<c1.getDiv()<<endl;
	
	
	return 0;
}
