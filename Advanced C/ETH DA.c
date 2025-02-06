#include <graphics.h>
#include <conio.h>
void drawTriangle()
{
    line(150, 100, 200, 200); // Side 1
    line(200, 200, 100, 200); // Side 2
    line(100, 200, 150, 100); // Side 3
}
void drawRectangle()
{
    rectangle(250, 100, 400, 200);
}
void drawHexagon()
{
    int x = 500, y = 150;
    int radius = 50;
    int angle = 360 / 6;
    int points[14];
    for (int i = 0; i < 6; i++) {
        points[i * 2] = x + radius * cos((angle * i) * M_PI / 180);
        points[i * 2 + 1] = y + radius * sin((angle * i) * M_PI / 180);
    }
    points[12] = points[0];n
    points[13] = points[1];   
    drawpoly(7, points);
}
int main() 
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\Turboc3\\BGI");
    drawTriangle();
    drawRectangle();
    drawHexagon();
    getch();
    closegraph();
    return 0;
}
