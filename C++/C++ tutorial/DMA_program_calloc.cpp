#include<iostream>
#include<cstdlib>
using std::cout;
using std::cin;
using std::endl;
int main(){

    int i, n, *ptr;
    cout<<"Enter the number of values: ";
    cin>>n;
    ptr = (int*)calloc(n, sizeof(int));
    if(ptr==NULL){
    	cout<<"Memory not available!";
    	exit(1);
	}
	
    cout<<"Enter the values";
    for(i=0; i<n; i++){
        cin>>*(ptr+i);
    }     // end of for loop
    cout<<"You entered\n";
    for(i=0; i<n; i++){
        cout<<*(ptr+i)<<endl;
    }     // end of for loop

    free(ptr);
    
    return 0;
}        //  end of program
