#include <iostream>

using namespace std;

int main() {
  int num_task;
  cin >> num_task;

  int sum;
  for(int i=1;i<num_task+1;i++) {
    sum = sum + i * 10000;
  }
  int avg = sum / num_task;

  cout << avg << endl;
  return 0;
}
