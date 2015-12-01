#include <iostream>

using namespace std;
int Partitionfunction(int *A, int start, int end); // Function declaration

void Quicksortfunction(int * A, int starting, int ending); // Function declaration



int main()
{
	int A[] = {7, 2, 1, 6, 8, 9, 3, 10, 6, 3, 7, 9, 4}; // Function call
	Quicksortfunction(A, 0, 12);
	for(int v = 1; v < 13; v++)
	{
	    cout << A[v] << endl;
	}
}



int Partitionfunction(int *A, int start, int end) // Function definition
{
	int pivot = A[end];
	int partitionIndex = start; //set partition index

	for(int i = start; i < end; i++)
	{
	    if(A[i]<= pivot)
	    {
           swap(A[i], A[partitionIndex]);
           partitionIndex++;
	    }
	
    }
   
    swap(A[partitionIndex], A[end]);
    return partitionIndex;


}

void Quicksortfunction(int *A, int starting, int ending) // Function definiton
{
	if(starting < ending)
	{
	    int partitionIndex = Partitionfunction(A, starting, ending);
	    Quicksortfunction(A, starting, partitionIndex-1);
	    Quicksortfunction(A, partitionIndex+1, ending);

	}
}

