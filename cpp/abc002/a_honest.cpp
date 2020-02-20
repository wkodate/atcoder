#include <iostream>
#include <iomanip>

using namespace std;

int main() {
  int input1, input2, output;
  cin >> input1 >> input2;

  if (input1 > input2) {
    output = input1;
  } else {
    output = input2;
  }

  cout << output << endl;
  return 0;
}
