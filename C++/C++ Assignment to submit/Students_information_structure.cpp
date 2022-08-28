#include<iostream>
#include<iomanip>
using namespace std;
struct Students{
	char name[50];
	int roll_no;
	float marks;
};
class students{
	private:
		Students a;
	public:
		void setStudents(string n, int r, float m){
			a.name[50]=n[50];
			a.roll_no=r;
			a.marks=m;
		}
};


int main(){
	Students s[20];	
	int i;
	for(i=0;  i<20; i++)
	{
		s[i].roll_no=i+1;
		cout<<"For roll number "<<s[i].roll_no<<":\n";
		cout<<"Enter name, and marks of student: ";
		cin>>s[i].name;
		cin>>s[i].marks;
	}
	cout<<"Name"<<setw(17)<<"Roll number"<<setw(10)<<"Marks\n";
	for(int i=0; i<20; i++)
	{
		cout<<s[i].name<<setw(14);
		cout<<s[i].roll_no<<setw(13);
		cout<<s[i].marks<<"\n";
	}
	return 0;
}
