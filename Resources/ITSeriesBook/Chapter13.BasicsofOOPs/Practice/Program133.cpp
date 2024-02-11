/*Write a class circle with one data member radius. Write three member functions get_radius()
to set radius value with parameter value, area() to display radius and circum() to calculate and display the 
circumference of circle.
*/
#include<iostream>
using namespace std;
class circle
{
    private:
    float radius;
    public:
    void get_radius(float r)
    {
        radius = r;
    }
    void area()
    {
        cout<<"\nArea of the circle: "<<3.14*radius;
    }
    void circum()
    {
        cout<<"\nCircumference of the circle: "<<2*3.14*radius;
    }
};
int main()
{
    circle c1;
    c1.get_radius(4.6);
    c1.area();
    c1.circum();
    return 0;
}