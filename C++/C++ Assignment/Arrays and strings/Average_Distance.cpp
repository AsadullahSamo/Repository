#include<iostream>
#include<string>
using namespace std;
class Distance{
	private:
		int feet;
		float inches;
	public:
		Distance() : feet(0), inches(0.0) {};     // contructor no args
		Distance(int ft, float in) : feet(ft), inches(in) {}; // contructor two args
		void getDist()
		{
			cout<<"Enter feet: ";      cin>>feet;
			cout<<"Enter inches: ";      cin>>inches;
		} // end of getDist
		void dispDist()
		{
			cout<<feet<< "\'" <<inches<< '\"';
		} // end of dispDist
		void AddDist(Distance d2, Distance d3)
		{
			inches=d2.inches+d3.inches;
			feet=0;
			if(inches>=12.0)
			{
				inches-=12.0;
				feet++; 
			}
			feet+=d2.feet+d3.feet;
		}      // end of AddDist
		void divDist(Distance d2, int divisor)
		{       // function to divide distance
			float fltfeet=(d2.feet+d2.inches)/12.0;    // convert to float
			fltfeet=fltfeet/divisor;
			feet=static_cast<int>(fltfeet);
			inches=(fltfeet-feet)*12.0;
		}     // end of divDist
};

int main(){
	char ch;
	int count=0;
	Distance distarr[100];
	Distance total(0, 0.0);    // other distances
	Distance average;
	do{
		cout<<"Enter distance: ";
		distarr[count++].getDist();
		cout<<"Do another (y/n) ? ";
		cin>>ch;
	} while(ch!='n');       // end of do while
	
	for(int j=0; j<count; j++)
	{
		total.AddDist(total, distarr[j]);
	}
		average.divDist(total, count);
		cout<<"Average of distances is ";
		average.dispDist();
		cout<<endl;
	return 0;
}
