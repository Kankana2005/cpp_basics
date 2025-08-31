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

void rev_array(int arr[], int l, int n) {
    if (l >= n) return;              // base case

    swap(arr[l], arr[n]);            // swap elements
    rev_array(arr, l + 1, n - 1);    // recursive call
}

void rev_arr_1pointer(int arr[],int i,int n){
    if(i>=n/2)
        return;
    swap(arr[i],arr[n-i-1]);    
    rev_arr_1pointer(arr,i+1,n);    

}

bool check_palindrome(string n,int i){
    if(i>=n.size()/2) return true;
    if (n[i] != n[n.size()-i-1])
        return false;
    return check_palindrome(n,i+1);
}

int fib(int n){
    if(n<=1)
        return n;
    return fib(n-1)+fib(n-2);    
}

int main(){
    int n;
    // string n;
    cout<<"Enter the number: ";
    cin>>n;


    //initializing an array
    // int arr[n];   // array of size n

    // cout << "Enter " << n << " elements: ";
    // for (int i = 0; i < n; i++) {
    //     cin >> arr[i];
    // }


    // print_n_times(1,n);
    // print_one_to_n(1,n);
    // print_n_to_one(n,n);
    // print_1ton_BackTracking(n,n);
    // print_nto1_BackTracking(1,n);
    // SumOf_n_no(n,0);
    // cout<<Sum_Of_n_nos(n);
    // cout<<fact(n);

    // cout << "Reversed array: ";
    // for (int i = 0; i < n; i++) {
    //     cout << arr[i] << " ";
    // }
    // cout << endl;

    // if (check_palindrome(n, 0))
    //     cout << "Palindrome";
    // else
    //     cout << "Not Palindrome";

    cout<<fib(n);


    return 0;
}