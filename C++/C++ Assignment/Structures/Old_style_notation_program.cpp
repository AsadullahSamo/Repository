#include<iostream>
using namespace std;
#include<conio.h>
struct sterling{
	int pounds;
	int shilings;
	int pence;
};

int main(){
	
	sterling s1;
	float decpounds, decfrac;	
	
	cout<<"Enter money amount in new style decimal pounds: ";
	cin>>decpounds;
	
	s1.pounds=static_cast<int>(decpounds);
	decfrac=240*(decpounds-s1.pounds);
	s1.shilings=(static_cast<int>(decfrac))%12;
	decfrac=static_cast<int>(decfrac-s1.shilings)/12;
	
	cout<<"Equivalent in old notation is \x9c"<<s1.pounds<<"."<<decfrac<<"."<<s1.shilings<<endl;
	return 0;
}
