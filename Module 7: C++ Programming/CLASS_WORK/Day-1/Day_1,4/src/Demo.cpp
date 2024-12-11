#include<iostream>
using namespace std;
void Add();
int main()
{
	Add();  //If you call a method without giving its definition then linker will generate error
	cout<<"Am Main"<<endl;
	return 0;
}
