#include <iostream>
using namespace std;

int main() {
  int i = 1;
  int x;
  while(true) {
    cin >> x;
    if (x == 0) {
      break;
    }
    cout << "Case " << i << ": " << x << endl;
    i++;
  }
  return 0;
}
