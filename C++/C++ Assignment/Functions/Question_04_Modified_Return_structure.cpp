#include<iostream>
#include<iomanip>
using namespace std;
struct Distance{
	int feet;
	float inches;
};
Distance retstrc(Distance, Distance);
void dispDist(Distance);

int main(){
	Distance d1, d2, d3;
	// get value of feet and inches for d1 from user
	cout<<"Enter feet: ";
	cin>>d1.feet;	
	cout<<"Enter inches: ";
	cin>>d1.inches;
	// get value of feet and inches for d2 from user
	cout<<"Enter feet: ";
	cin>>d2.feet;	
	cout<<"Enter inches: ";
	cin>>d2.inches;
	// Displaying user distances
	cout<<"You entered\n";
	cout<<"Distance1"<<setw(20)<<"Distance2"<<endl;
	dispDist(d1); cout<<setw(15);  dispDist(d2);       cout<<endl;
	// displaying larger distance
	d3=retstrc(d1, d2);        // call for retstrc function
	cout<<"The larger distance is ";
	dispDist(d3);              // call display function
	cout<<endl;
	return 0;
}

Distance retstrc(Distance dd1, Distance dd2){
		// check for larger feet
		if(dd1.feet>dd2.feet)	
		{
			return dd1;
		}
		else
		{
			return dd2;		
		}
		// check for larger inches
		if(dd1.inches>dd2.inches)
		{
			return dd1;
		}
		else
		{
			return dd2;
		}
}

void dispDist(Distance dd){
	cout<<dd.feet<<"\'-"<<dd.inches<<'\"';
}
