#include <iostream>
#include <string>

using namespace std;

int main() {
  int a,b;
  cin >> a >> b;

  string relation;
  if (a < b) {
    relation = "<";
  } else if (a > b) {
    relation = ">";
  } else {
    relation = "==";
  }

  cout << "a " << relation << " b" << endl;
  return 0;
}
