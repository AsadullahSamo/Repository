#include<iostream>
#include<cstdlib>
using namespace std;
int main(){

    int i, n, *ptr;
    cout<<"Enter number of values: ";
    cin>>n;

    ptr = (int*)malloc(n*sizeof(int));
	if(ptr==NULL){
    	cout<<"Memory not available!";
    	exit(1);
	}
	
    cout<<"Enter values: ";
    for(i=0; i<n; i++){
        cin>>*(ptr+i);
    }
    cout<<"You entered\n";
    for(i=0; i<n; i++){
        cout<<*(ptr+i)<<endl;
    }
    free(ptr);
    
    return 0;
}      // end of program
