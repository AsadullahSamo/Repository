#include<iostream>
using namespace std;
class angle{
	private:
		int degrees;
		float minutes;
		char direction;
	public:
		angle() : degrees(0), minutes(0), direction(0) {}
		angle(int deg, float mins, char dir) : degrees(deg), minutes(mins), direction(dir) {} 
		void getData(int deg, float mins, char dir)
		{
			degrees=deg;
			minutes=mins;
			direction=dir;
		}
		void display() const 
		{
			cout<<"Angle: "<<degrees<<"\xF8"<<minutes<<"\'"<<direction;
		if(direction=='e' || direction=='E' || direction=='W' || direction=='w')
		{
			cout<<" Longitude !";
		}
		else if(direction=='n' || direction=='s' || direction=='N' || direction=='S')
		{
			cout<<" Latitude ! ";
		} 
		}	// end of display	
		
};

int main(){
	
	int deg;
	float mins;
	char dir, choice;
	angle a1(146, 59.5, 'W');
	a1.display();
	cout<<endl;
	angle a2;
	
	do{
		cout<<"Enter the degree: ";
		cin>>deg;
		cout<<"Enter minutes ";
		cin>>mins;
		cout<<"Enter the direction (E, W, N, S) ";
		cin>>dir;
		a2.getData(deg, mins, dir);
		a2.display();
		cout<<"\nDo you want to continue (y/n) ? ";
		cin>>choice;
	} while(choice=='y');     //end of do while
	return 0;
}     // end of main
