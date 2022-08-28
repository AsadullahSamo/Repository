#include<iostream>
using namespace std;
class Birds{
	private:
	string name;
	int wings;
	public:
		void fly(){
			cout<<"I fly "<<endl;
		}
		void setName(string n){
			name=n;
		}
		void setWings(int w){
			wings=w;
		}
		string getname(){
			return name;
		}
		int getWings(){
			return wings;
		}
};


int main(){
	Birds bird1, bird2;
	bird1.setName("Pigeon");
	bird2.setName("sparrow");
	bird1.setWings(5);
	bird2.setWings(10);
	
	cout<<"Bird 1: "<<bird1.getname()<<endl;	
	cout<<"Bird 2: "<<bird2.getname()<<endl;
	cout<<"Wings of "<<bird1.getname()<< " are "<<bird1.getWings()<<endl;
	cout<<"Wings of "<<bird2.getname()<< " are "<<bird2.getWings()<<endl;
	return 0;
}
