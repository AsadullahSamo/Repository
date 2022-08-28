// unsigned can hold only positive values whereas signed can hold both +ve and -ve values
// 7 digits are considered to be significant 
// float is capable of printing 7 digits after 7 it'll print garbage values
// double can print upto 15 digits but cout is allowed to print only 6 digits irrespective of dataType
#include <iostream>
#include <iomanip>         // for setprecision
using namespace std;
int main(){

    float f = 123.456789f;      // will print 6 digits 123.457 (6 will be rounded to 7)
    cout<<f<<endl;
    cout<<setprecision(7);
    cout<<f<<endl;

    


    return 0;
}