#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<int> a(n);
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }
  sort(a.begin(), a.end());
  reverse(a.begin(), a.end());
  int a_sum = 0;
  int b_sum = 0;
  for (int i = 0; i < n; i++) {
    if (i % 2 == 0) {
      a_sum += a[i];
    } else {
      b_sum += a[i];
    }
  }
  cout << a_sum - b_sum << endl;
}
