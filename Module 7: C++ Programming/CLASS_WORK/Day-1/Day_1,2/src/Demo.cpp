#include<iostream>
using namespace std;
int main1()
{
	int Num1;  //Num1 is local variable which will be holding GV
	cout<<"Value of Num1:"<<Num1;
	return 0;
}
int main()
{
	int Num1; //Declaration  //OK
	int Num2=200; //Declaration + Initialization
	Num1=300; //Initialization
	Num2=700; //Assignment
	//int Num2=450;  //NOT OK
	cout<<"Value of Num1:"<<Num1<<endl;
	cout<<"Value of Num2:"<<Num2;
	return 0;
}
