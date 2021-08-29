#include <bits/stdc++.h>
using namespace std;

const long long INF = 1LL << 60;

template <class T> inline bool chmin(T &a, T b) {
  if (a > b) {
    a = b;
    return true;
  }
  return false;
}

int main() {
  int n, k;
  cin >> n >> k;
  vector<long long> h(n);
  for (int i = 0; i < n; i++) {
    cin >> h[i];
  }

  vector<long long> dp(n, INF);
  dp[0] = 0;
  dp[1] = abs(h[1] - h[0]);
  for (int i = 2; i < n; i++) {
    for (int j = 1; j <= k; j++) {
      if (i - j >= 0) {
        chmin(dp[i], dp[i - j] + abs(h[i] - h[i - j]));
      }
    }
  }
  cout << dp[n - 1] << endl;
}
