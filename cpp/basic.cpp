#include<bits/stdc++.h>
using namespace std;
void basic_skeleton(){
    cout<<"hello world"<<endl;
    int x , y;
    cin>>x;
    cin>>y;
    cout<<"value of x is "<<x<<" and y is "<<y<<endl;

}
void data_types(){
    //int
    int x = 10;
    //long
    long l=15;
    //long long
    long long m=1000000000000;

    //float,double
    float f=10.5;
    float F = 10;
    double y = 18.55; 

    //char,getline
    char ch = 'a';
    cout<<ch<<endl;
    string str,str2;
    // cin>>str>>str2;
    getline(cin,str);
    cout<<str<<endl;

}

void if_else1(){
    int age;
    cout<<"Enter your age"<<endl;
    cin>>age;
    if(age>=18){
        cout<<"You are eligible to vote"<<endl;
    }
    else{
        cout<<"You are not eligible to vote come again after" <<age-18<<" years"<<endl;
    }
    }
void if_else2(){
    int marks;
    cout<<"Enter Your marks: ";cin>>marks;
    if(marks<25){
        cout<<"Grade F"<<endl;
    }
    else if(marks<=44){
        cout<<"Grade E "<<endl;
    }
     else if(marks<=49){
        cout<<"Grade D "<<endl;
    }
     else if(marks<=59){
        cout<<"Grade C "<<endl;
    }
     else if(marks<=79){
        cout<<"Grade B "<<endl;
    }
     else if(marks<=100){
        cout<<"Grade A "<<endl;
     }
     else{
        cout<<"invalid input "<<endl;
     }
}  

void Nested_if(){
    int age;
    cout<<"Enter your age: ";cin>>age;
    if(age<18){
        cout<<"You are not eligible "<<endl;
    }
    else if(age<=57){
        cout<<"You are eligible for the job "<<endl;
        if(age>=55){
            cout<<",but retirement soon"<<endl;
        }
    }
    else{
        cout<<"Retirement time "<<endl;
    }
}

void Switch_statement(){
    /* Take the day no.and print the corresponding day 
    for 1. print Monday
    for 2. print Tuesday and so on..
    */
   int day;
   cout<<"Enter the day number is order to print the day name: ";cin>>day;
   switch(day){
    case 1:
    cout<<"Monday";
    break;
    case 2:
    cout<<"Tuesday";
    break;
    case 3:
    cout<<"Wednesday";
    break;
    case 4:
    cout<<"Thursday";
    break;
    case 5:
    cout<<"Friday";
    break;
    case 6:
    cout<<"Saturday";
    break;
    case 7:
    cout<<"Sunday";
    break;
    default:
    cout<<"Invalid";
     
   }
}

void oneD_arrays(){
    int arr[5];
    cin>>arr[0]>>arr[1]>>arr[2]>>arr[3]>>arr[4];
    arr[3] += 10;
    cout<<"The 4th element is : "<<arr[3]<<endl;
}

void twoD_arrays(){
    int arr[3][3];
    arr[1][3] = 88;
    cout<<arr[1][3]<<endl;

}

void strings(){
    string s = "hello world";
    int len =s.size();
    s[len-1] = 'A';
    cout<<s[len-1]<<endl;
}

void for_loop(){
    for(int i =1;i<=20;i++){
        cout<<"hello"<<endl;
    }
    for(int i=5;i>0;i--){
        cout<<i<<endl;
    }
    for(int i=1;i<=25;i=i+5){
        cout<<"world"<<endl;
    }
}

void while_loop(){
    int i=1;
    while(i<=5){
        cout<<"hello"<<endl;
        i=i+1;
    }
}

void do_while_loop(){
    int i=2;
    do{
        cout<<"hello"<<endl;
        i=i+1;
    }while(i<=1);
}

int functions(int a,int b){
    //Functions are set of code which performs something for you 
    //Functions are used to modularize code
    //Fumctions are used to increase readability
    //Functions are used to use the same code multiple times
    //types: void,return,paramaterized,non parematerzied
    //void: which does not returns anything

    //Q. Take two numbers and print its sum
    
    int sum = a+b;
    return sum;
}

int maxx(int n1,int n2){
    if(n1>=n2) return n1;
    else return n2;
}

void pass_by_value(string s){
    s[0]='R';
    cout<<s<<endl;
}

void pass_by_reference(string &s){
     s[0]='R';
    cout<<s<<endl;
}


int main(){
    // basic_skeleton();
    // data_types();
    // if_else1();
    // if_else2();
    //Nested_if();
    // Switch_statement();
    // oneD_arrays()
    // twoD_arrays();
    // strings();
    // for_loop();
    // while_loop();
    // do_while_loop();

    // int a,b;
    // cin>>a>>b;
    // cout<<functions(a,b);

    // int n1,n2;
    // cin>>n1>>n2;
    // int maximum=maxx(n1,n2);
    // cout<<maximum;

    // string s = "Man";
    // pass_by_value(s);
    // cout<<s<<endl;

    // string s = "Man";
    // pass_by_reference(s);
    // cout<<s<<endl;

    return 0;
}
    







