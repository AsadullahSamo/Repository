#include<iostream>
using namespace std;
class Car{
	private:
		string color;
		int price;
	public:
		Car(){
			color="Red";
			price=25000;
			cout<<"I will be displaying two times because two objects with no parameter is created and I also have no parameter\n";
		}
		Car(string c){
			color=c;
			cout<<"I take one parameter\n";
		}
		Car(int p){
			price=p;
		}
		Car(string c, int p){
			price=p;
			color=c;
			cout<<"I take two parameters\n";
		}
		string getColor(){
			return color;
		}
		int getPrice(){
			return price;
		}
	};

int main(){
	Car car1, car2;
	Car car3("Black");
	Car car4(38000);
	Car car5("Orange", 50000);
	Car car6("Blue", 78000);
	
	cout<<"Color of car 1 is "<<car1.getColor()<<endl;
	cout<<"Price of car 2 is "<<car2.getPrice()<<endl;
	cout<<"Color of car 3 is "<<car3.getColor()<<endl;
	cout<<"Price of car 4 is "<<car4.getPrice()<<endl;
	cout<<"Color of car 5 is "<<car5.getColor()<<endl;
	cout<<"Price of car 5 is "<<car5.getPrice()<<endl;
	cout<<"Price of car 6 is "<<car6.getPrice()<<endl;
	return 0;
}
