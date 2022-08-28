#include<iostream>
using namespace std;
class Point{
	private:
		int x, y;
	public:
		Point(int a, int b){
			x=a;
			y=b;
		}
		void getPoint(){
			cout<<"("<<x<<","<<y<<")\n";
		}
	};

int main(){
	Point p(4,9);
	Point q(9,4);
	
	p.getPoint();
	q.getPoint();
	return 0;
}
