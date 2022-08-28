#include<iostream>
using namespace std;
int main(){
	const int SIZE=10;
	int even_odd[SIZE];
	int even=0, odd=0;
	cout<<"Enter ten numbers\n";
	for(int j=0; j<SIZE; j++){
		cin>>even_odd[j];
		if(even_odd[j]%2==0){
			even++;      // same as even+=1
		} else {
			odd++;       // same as odd+=1
		} // end of if else
	} // end of for loop
	cout<<"Number of even digits are "<<even<<endl;
	cout<<"Number of odd digits are "<<odd<<endl;
	return 0;
}
