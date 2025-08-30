#include<bits/stdc++.h>
using namespace std;

void print_n_times(int n){
    int cnt=0;
    if(cnt==n){
        return;
    }
    else{
        cout<<"hello"<<endl;
        cnt++;

    }
    print_n_times(n-1);
}

int main(){
    int n;
    cout<<"Enter the number";
    cin>>n;
    print_n_times(n);
    return 0;
}