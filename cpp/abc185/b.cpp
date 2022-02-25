#include <bits/stdc++.h>
using namespace std;

int main() {
  long long n, t;
  int m;
  cin >> n >> m >> t;
  vector<long long> a(m);
  vector<long long> b(m);
  for (int i = 0; i < m; i++) {
    cin >> a[i] >> b[i];
  }

  long long p = n - a[0];
  if (p <= 0) {
    cout << "No" << endl;
    return 0;
  }
  for (int i = 0; i < m - 1; i++) {
    p = min(p + b[i] - a[i], n);
    p -= a[i + 1] - b[i];
    if (p <= 0) {
      cout << "No" << endl;
      return 0;
    }
  }

  p = min(p + b[m - 1] - a[m - 1], n);
  p -= t - b[b.size() - 1];
  if (p <= 0) {
    cout << "No" << endl;
    return 0;
  }
  cout << "Yes" << endl;
}
