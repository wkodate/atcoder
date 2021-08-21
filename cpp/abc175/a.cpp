#include <bits/stdc++.h>
using namespace std;

int main() {
  string s;
  cin >> s;
  int max_count = 0;
  int count = 0;
  for (int i = 0; i < 3; i++) {
    if (s[i] == 'R') {
      count++;
      max_count = max(max_count, count);
    } else {
      count = 0;
    }
  }
  cout << max(max_count, count) << endl;
}
