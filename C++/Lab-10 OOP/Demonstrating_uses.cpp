#include<iostream>
using namespace std;
class Car{
	private:
		 int count;
		 int price;
		 string color;
		 string name;
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
	// setters and getters
	void setName(string n){
		name=n;
	}
	string getName(){
		return name;
	}
};
class Employee{
	private:
		int id;
		static int count;
	public:
		string name;
		void setData(int Id){
			id=Id;
		}
		int getData(){
			return id;
		}
		void setid(){
			cout<<"Enter the id of employee ";
			cin>>id;
			count++;
		}
		void getid(){
			cout<<"The id of employee is "<<id<<" and employee number is "<<count;
		}
};
int Employee::count;
int main(){
	// Demonstrating use of constructors
	Car car1, car2;           // constructor with no argument is called
	Car car3("Black");       // constructor with one argument is called
	Car car4(38000);        // constructor with one arument is called
	Car car5("Orange", 50000); // constructor with two arguments is called
	Car car6("Blue", 78000);
	
	cout<<"Color of car 1 is "<<car1.getColor()<<endl;
	cout<<"Price of car 2 is "<<car2.getPrice()<<endl;
	cout<<"Color of car 3 is "<<car3.getColor()<<endl;
	cout<<"Price of car 4 is "<<car4.getPrice()<<endl;
	cout<<"Color of car 5 is "<<car5.getColor()<<endl;
	cout<<"Price of car 5 is "<<car5.getPrice()<<endl;
	cout<<"Color of car 6 is "<<car6.getPrice()<<endl;
	cout<<endl<<endl;
	
	// Demonstrating use of setters and getters
	Car car7;
	car7.setName("Honda");
	cout<<"The name of car is "<<car7.getName()<<endl;
	
	// Demonstrating use of private and public specifier
	Employee e1, Asad, Junaid, Awais;
//	e1.id=1;           cannot do this because id is private
//	e1.count=1;
	e1.setData(12);        
	cout<<"My id is "<<e1.getData()<<endl;
	e1.name="Asad Samo";          // allowed cause its public
	cout<<"Employee name is "<<e1.name<<endl;
	
	// Demonstrating use of static variables
	Asad.setid();   
	Asad.getid();       cout<<endl;
	
	Junaid.setid();
	Junaid.getid();     cout<<endl;
	
	Awais.setid();
	Awais.getid();      cout<<endl;
	return 0;
}
