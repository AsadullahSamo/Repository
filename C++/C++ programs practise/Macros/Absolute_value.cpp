#include<iostream>
#define absolute(a) ((a<0) ? (-1*a) : a);
using std::cout;
using std::cin;
using std::endl;
int main(){

    cout<<absolute(8);
    cout<<absolute(-8);
    return 0;
}