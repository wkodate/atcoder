#include <bits/stdc++.h>
using namespace std;

int main() {
  string s;
  cin >> s;
  reverse(s.begin(), s.end());
  long long res = 0;
  for (int bit = 1; bit < (1 << s.size()); bit++) {
    if (bit % 2 == 0) {
      continue;
    }
    long long sum = 0;
    long long mul = 1;
    for (int i = 0; i < s.size(); i++) {
      if (bit & (1 << i)) {
        mul = 1;
      } else {
        mul *= 10;
      }
      sum += (s.at(i) - '0') * mul;
    }
    res += sum;
  }
  cout << res << endl;
}
