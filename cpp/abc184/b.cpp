#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, x;
  string s;
  cin >> n >> x >> s;
  int sum = x;
  for (int i = 0; i < s.size(); i++) {
    if (s[i] == 'x') {
      if (sum == 0) {
        continue;
      }
      sum--;
    } else {
      sum++;
    }
  }
  cout << sum << endl;
}
