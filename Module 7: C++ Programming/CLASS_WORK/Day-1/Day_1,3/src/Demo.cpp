#include<iostream>
using namespace std;
//void Add(); //Function Declaration (Global Declaration of Add Function)

void Show()	//Declaration + Definition of Show Function
{
	cout<<"Am Show"<<endl;
}
int main()
{
	Show();
	cout<<"Am Main"<<endl;
	return 0;
}
int main1()
{
	void Sum();	//Function Declaration (Local Declaration of Sum Function)
	void Add();	//Function Declaration (Local Declaration of Add Function)
	cout<<"Am Main"<<endl;
	Add();	//Function Call
	return 0;
}
void Sum();	//Function Declaration (Global Declaration of Sum Function)
void Add() //Function Definition
{
	Sum();	//Function Declaration (Local Declaration of Add Function)
	cout<<"Am Add";
}
void Sum()
{
	cout<<"Am Sum";
}
