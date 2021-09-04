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
  int n;
  cin >> n;
  long long w;
  cin >> w;
  vector<long long> weight(n);
  vector<long long> value(n);
  long long v_sum = 0;
  for (int i = 0; i < n; i++) {
    cin >> weight[i] >> value[i];
    v_sum += value[i];
  }

  vector<vector<long long>> dp(n + 1, vector<long long>(v_sum + 1));
  for (int i = 0; i <= n; i++) {
    for (int j = 0; j <= v_sum; j++) {
      dp[i][j] = INF;
    }
  }
  dp[0][0] = 0;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j <= v_sum; j++) {
      if (j - value[i] >= 0) {
        chmin(dp[i + 1][j], dp[i][j - value[i]] + weight[i]);
      }
      chmin(dp[i + 1][j], dp[i][j]);
    }
  }

  long long res = 0;
  for (int j = 0; j <= v_sum; j++) {
    if (dp[n][j] <= w) {
      res = j;
    }
  }
  cout << res << endl;
}
