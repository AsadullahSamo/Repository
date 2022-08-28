#include<iostream>
#include<math.h>
using namespace std;
int main(){
	
	int x1, y1, x2, y2;
	cout<<"Enter first points: ";
	cin>>x1>>y1;
	cout<<"Enter second points: ";
	cin>>x2>>y2;
	cout<<"The distance between the points ("<<x1<<","<<y1<<") and ("<<x2<<","<<y2<<") is ";
	int result=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
	int final_result=sqrt(result);
	cout<<final_result;
	return 0;
}
