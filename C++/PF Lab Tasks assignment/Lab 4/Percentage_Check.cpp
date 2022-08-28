#include<iostream>
using namespace std;
int main(){
	
		int number_of_classes_held, number_of_classes_attend;
		cout<<"Enter number of classes held:\n";
		cin>>number_of_classes_held;
		cout<<"Enter number of classes attend:\n";
		cin>>number_of_classes_attend;
		
		float percentage;
		percentage=number_of_classes_attend*100/number_of_classes_held;
		
		if(percentage>=75){
			cout<<"Your percentage is:"<<percentage<<" "<<"and you can sit in exams";
		} else {
			cout<<"Your percentage is:"<<percentage<<" "<<"and you can't sit in exams";
		}
	return 0;
}
