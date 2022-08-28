#include<iostream>
using namespace std;
int main(){               // 1-D array declaration(one row multiple cols)
	int age[4];          // data_type name_of_array[size_of_array];
	               // int a[-5]; is incorrect,   int a[2+2]; is correct
	for(int j=0; j<4; j++){
	cout<<"Enter your age:";
		cin>>age[j];
	}
	for(int j=0; j<4; j++){
		cout<<"you entered:"<<age[j]<<endl;
	}
	return 0;
}
