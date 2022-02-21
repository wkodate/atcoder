#include <bits/stdc++.h>
using namespace std;

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

int main() {
  int n;
  cin >> n;
  vector<int> a(n);
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }
  map<long long, long long> map;
  for (int i = 0; i < n; i++) {
    vector<pair<long long, long long>> pf = prime_factorize(a[i]);
    for (int j = 0; j < pf.size(); j++) {
      if (map.count(pf[j].first)) {
        map[pf[j].first] = map[pf[j].first] + 1;
      } else {
        map[pf[j].first] = 1;
      }
    }
  }
  int maxKey = 0;
  int maxValue = 0;
  for (auto p : map) {
    if (maxKey == 0) {
      maxKey = p.first;
      maxValue = p.second;
      continue;
    }
    if (p.second > maxValue) {
      maxKey = p.first;
      maxValue = p.second;
    }
  }
  cout << maxKey << endl;
}
