#include<stdio.h>
#include<conio.h>
#include<OGRE.h>
#include<math.h>
void initgraph(int* gd, int*gm, char*ddp);
int main(){
	int gd= DETECT, gm;
	detectgraph(&gd, &gm);
	initgraph(&gd, &gm, "C:\\TC\\BGI");
	setcolor(GREEN);
	
	settextstyle(DEFAULT_FONT, HORIZ_DIR, 2);
	Outtextxy(10, 10, "Welcome to graphics programming");
	Outtextxy(10, 30, "My VU-ID is BC123456789");
	line(0, 60, getmaxx(), 60);
	
	int i, circ_x, cirx_y;
	circ_x=getmaxx()/2;
	circ_y=getmaxx()/2;
	
	circle(300, 300, 50);
	getch();
}
