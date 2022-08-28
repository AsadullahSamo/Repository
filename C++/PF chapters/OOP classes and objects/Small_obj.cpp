#include<iostream>
using namespace std;
class Smallobj{
	private:
	int data;
	public:
	void setData(int d){
		data=d;
	}
	int getData(){
		return data;
	}
};

int main(){
	Smallobj s1, s2;
	s1.setData(1066);
	s2.setData(1098);
	cout<<"First data is "<<s1.getData()<<endl;
	cout<<"Second data is "<<s2.getData()<<endl;
	return 0;
}
