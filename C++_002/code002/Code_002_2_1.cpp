//call by value
#include <iostream>
using namespace std;
void swap(int x,int y);
int main ()
{
//local variable declaration:
   int a = 100;
   int b = 200;
   cout << "Before swap, value of a :" << a << endl;
   cout << "Before swap, value of b :" << b << endl;
//calling a function to swap the values.
   swap(a,b);
//swapping done on copy of a & b, not on a & b.
   cout << "After swap, value of a :" << a << endl;
   cout << "After swap, value of b :" << b << endl;
   return 0;
}
void swap(int x, int y)
{
   int temp;
   temp = x; // save the value of x
   x = y;    // put y into x
   y = temp; // put x into y
   return;
}
