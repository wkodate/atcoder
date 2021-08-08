#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<int> a(n);
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }
  int count = 0;
  bool canReplace = true;
  while (canReplace) {
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 != 0) {
        canReplace = false;
        break;
      }
    }
    if (canReplace) {
      count++;
      for (int i = 0; i < n; i++) {
        a[i] /= 2;
      }
    }
  }
  cout << count << endl;
}
