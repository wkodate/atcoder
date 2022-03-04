#include <bits/stdc++.h>
using namespace std;

int main() {
  int MOD = 1000000007;
  int n;
  cin >> n;
  vector<long long> a(n);
  long long sum = 0;
  for (int i = 0; i < n; i++) {
    cin >> a[i];
    sum += a[i];
    sum %= MOD;
  }

  long long res = 0;
  for (int i = 0; i < n; i++) {
    sum -= a[i];
    if (sum < 0) {
      sum += MOD;
    }
    res += a[i] * sum;
    res %= MOD;
  }
  cout << res << endl;
}
