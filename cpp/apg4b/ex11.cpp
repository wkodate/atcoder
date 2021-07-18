#include <bits/stdc++.h>
using namespace std;

int main() {
  int N, A;
  cin >> N >> A;

  for (int i = 1; i <= N; i++) {
    string op;
    int B;
    cin >> op >> B;
    if (op == "+") {
      A += B;
    } else if (op == "-") {
      A -= B;
    } else if (op == "*") {
      A *= B;
    } else if (op == "/" && B != 0) {
      A /= B;
    } else {
      cout << "error" << endl;
      return 0;
    }
      cout << i << ":" << A << endl;
  }
}
