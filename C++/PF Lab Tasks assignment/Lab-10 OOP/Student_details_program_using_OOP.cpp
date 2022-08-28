#include<iostream>
using namespace std;
class student{
	private:
		int roll_no;
		char name[5];
		int marks[5];
	public:
		void input(){
			cout<<"Enter roll number, name of student: ";
			cin>>roll_no>>name;
		}
		void show(){
			cout<<"Student name is "<<name<<endl;
			cout<<"Roll number of "<<name<<" is "<<roll_no<<endl;
	   }
	   void getmarks(){
	   	cout<<"Enter Marks of "<<name<<" in C++, AP, AC, IICT, FE: ";
			for(int i=0; i<5; i++)
			{
				cin>>marks[i];
			}
	   }	
	   void showmarks(){
	   	cout<<"Marks of "<<name<<" in C++, AP, AC, IICT, FE are ";
			for(int i=0; i<5; i++)
			{
				cout<<marks[i]<<", ";
			}
			cout<<endl;
	   }
};

class course{
	private:
		char sname[50];
		char aname[50];
		int price;
	public:
	void input(){
			cout<<"Enter subject name, author name and price of book ";
			cin>>sname>>aname>>price;
		}
		void show(){
			cout<<"Name of subject is "<<sname<<endl;
			cout<<"Name of "<<sname<<" author is "<<aname<<endl;
			cout<<"Price of "<<sname<<" is "<<price<<endl;
	   }
};

int main(){
	int i;
	// details of student 
	student s[5];
	for(i=0; i<5; i++)
	{
		s[i].input();
		s[i].getmarks();
	}
	for(i=0; i<5; i++)
	{
		s[i].show();
		s[i].showmarks();
	}
	
	// details of course
	course c[5];
	for(i=0; i<5; i++)
	{
		c[i].input();
	}
	for(i=0; i<5; i++)
	{
		c[i].show();	
	}
	return 0;
}
