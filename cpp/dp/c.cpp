#include <bits/stdc++.h>
using namespace std;

template <class T> inline bool chmax(T &a, T b) {
  if (a < b) {
    a = b;
    return true;
  }
  return false;
}

int main() {
  int n;
  cin >> n;
  vector<vector<int>> abc(3, vector<int>(n));
  for (int i = 0; i < n; i++) {
    cin >> abc[0][i] >> abc[1][i] >> abc[2][i];
  }

  vector<vector<int>> dp(3, vector<int>(n));
  dp[0][0] = abc[0][0];
  dp[1][0] = abc[1][0];
  dp[2][0] = abc[2][0];
  for (int i = 1; i < n; i++) {
    chmax(dp[0][i], max(dp[1][i - 1], dp[2][i - 1]) + abc[0][i]);
    chmax(dp[1][i], max(dp[2][i - 1], dp[0][i - 1]) + abc[1][i]);
    chmax(dp[2][i], max(dp[0][i - 1], dp[1][i - 1]) + abc[2][i]);
  }

  cout << max(dp[0][n - 1], max(dp[1][n - 1], dp[2][n - 1])) << endl;
}
