#include<bits/stdc++.h>
using namespace std;

void print_n_times(int i , int n){
    if(i>n)
        return;
    cout<<"hello"<<endl;
    print_n_times(i+1,n);
    }

void print_one_to_n(int i,int n){
    if(i>n)
        return;
    cout<<i<<" ";
    print_one_to_n(i+1,n);    
}

void print_n_to_one(int i,int n){
    if(i<1)
        return;
    cout<<i<<" ";
    print_n_to_one(i-1,n);    
}

void print_1ton_BackTracking(int i , int n){
    if(i<1)
        return;
    print_1ton_BackTracking(i-1,n);
    cout<<i<<" ";
}

void print_nto1_BackTracking(int i , int n){
    if(i>n)
        return;
    print_nto1_BackTracking(i+1,n);
    cout<<i<<" ";
}

//Parameterized way
void SumOf_n_no(int i , int sum){
    if(i<1){
        cout<<sum;
        return;
    }    
    SumOf_n_no(i-1,sum+i);   
    
}

//functional method
int Sum_Of_n_nos(int n){
    if(n==0)
        return 1;   
    return n+Sum_Of_n_nos(n-1);     
}

int fact(int n){
    if(n==0)
        return 1;   
    return n*fact(n-1);     
}


int main(){
    int n;
    cout<<"Enter the number: ";
    cin>>n;
    // print_n_times(1,n);
    // print_one_to_n(1,n);
    // print_n_to_one(n,n);
    // print_1ton_BackTracking(n,n);
    // print_nto1_BackTracking(1,n);
    // SumOf_n_no(n,0);
    // cout<<Sum_Of_n_nos(n);
    cout<<fact(n);
    return 0;
}