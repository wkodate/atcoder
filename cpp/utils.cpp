#include <bits/stdc++.h>
using namespace std;

struct Utils {

  const long long INF = 1LL << 60;

  int MOD = 1000000007;

  // 多次元配列
  vector<vector<int>> data(3, vector<int>(4));

  template <class T> inline bool chmin(T &a, T b) {
    if (a > b) {
      a = b;
      return true;
    }
    return false;
  }

  template <class T> inline bool chmax(T &a, T b) {
    if (a < b) {
      a = b;
      return true;
    }
    return false;
  }

  // sort, asc/desc
  void sort_array(int n, vector<int> a) {
    // asc
    sort(a.begin(), a.end());
    // desc
    sort(a.begin(), a.end(), greater<int>());
  }

  bool contains(string s, string t) { return s.find(t) != string::npos; }

  bool ends_with() {
    string s = "abc";
    string suffix = "ab";
    if (s.size() < suffix.size()) {
      return false;
    }
    return equal(rbegin(suffix), rend(suffix), rbegin(s));
  }

  // 約数列挙。小さい順に返す
  vector<long long> enum_divisors(long long n) {
    vector<long long> res;
    for (long long i = 0; i <= n; i++) {
      if (n % i == 0) {
        res.push_back(i);
        if (n / i != i) {
          res.push_back(n / i);
        }
      }
    }
    sort(res.begin(), res.end());
    return res;
  }

  // 素因数分解
  vector<pair<long long, long long>> prime_factorize(long long n) {
    vector<pair<long long, long long>> res;
    for (long long i = 2; i * i <= n; i++) {
      if (n % i != 0) {
        continue;
      }
      long long ex = 0;
      while (n % i == 0) {
        ex++;
        n /= i;
      }
      res.push_back({i, ex});
    }
    if (n != 1) {
      res.push_back({n, 1});
    }
    return res;
  }

  // bit全探索
  void bitSearch(int n, vector<int> a) {
    for (int bit = 0; bit < (1 << n); bit++) {
      int sum = 0;
      for (int i = 0; i < n; i++) {
        if (bit & (1 << i)) {
          sum += a[i];
        }
      }
    }
  }

  // LCS: Longest Common Subsequence
  int longestCommonSubsequence(string text1, string text2) {
    vector<vector<int>> dp(text1.size() + 1, vector<int>(text2.size() + 1));
    for (int i = 0; i < text1.size(); i++) {
      for (int j = 0; j < text2.size(); j++) {
        if (text1[i] == text2[j]) {
          chmax(dp[i + 1][j + 1], dp[i][j] + 1);
        }
        chmax(dp[i + 1][j + 1], dp[i + 1][j]);
        chmax(dp[i + 1][j + 1], dp[i][j + 1]);
      }
    }
    return dp[text1.size()][text2.size()];
  }

  // Binary search
  int binary_search(vector<int> a, int key) {
    // ai < key を満たすiの個数
    return lower_bound(a.begin(), a.end(), key) - a.begin();
  }

  // Binary search めぐる式
  int binary_search(vector<int> a, int key) {
    int left = -1;
    int right = (int)a.size();
    while (right - left > 1) {
      int mid = left + (right - left) / 2;
      if (a[mid] >= key) {
        right = mid;
      } else {
        left = mid;
      }
    }
    return right;
  }
};

int main() {}