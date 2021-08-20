#include <bits/stdc++.h>
using namespace std;

int main() {
  string s;
  string suffix_list[4] = {"dream", "dreamer", "erase", "eraser"};
  cin >> s;
  bool replaced = false;
  while (s.size() > 0) {
    replaced = false;
    for (int i = 0; i < sizeof(suffix_list) / sizeof(suffix_list[0]); i++) {
      string suffix = suffix_list[i];
      if (equal(rbegin(suffix), rend(suffix), rbegin(s))) {
        s = s.substr(0, s.size() - suffix.size());
        replaced = true;
        break;
      }
    }
    if (!replaced && s.size() > 0) {
      cout << "NO" << endl;
      return 0;
    }
  }
  cout << "YES" << endl;
}
