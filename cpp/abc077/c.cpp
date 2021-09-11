#include <algorithm>
#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<long long> a(n);
  vector<long long> b(n);
  vector<long long> c(n);
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }
  for (int i = 0; i < n; i++) {
    cin >> b[i];
  }
  for (int i = 0; i < n; i++) {
    cin >> c[i];
  }

  sort(a.begin(), a.end());
  sort(b.begin(), b.end());
  sort(c.begin(), c.end());
  long long sum = 0;
  for (int j = 0; j < n; j++) {
    long long ai = lower_bound(a.begin(), a.end(), b[j]) - a.begin();
    long long ck = n - (upper_bound(c.begin(), c.end(), b[j]) - c.begin());
    sum += ai * ck;
  }
  cout << sum << endl;
}
