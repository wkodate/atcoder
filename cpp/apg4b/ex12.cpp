#include <bits/stdc++.h>
using namespace std;

int main() {
  string S;
  cin >> S;

  int sum = 1;
  for (int i = 0; i < S.size(); i++) {
    if (i % 2 == 0) {
      continue;
    }
    if (S.at(i) == '+') {
      sum++;
    } else {
      sum--;
    }
  }
  cout << sum << endl;
}
