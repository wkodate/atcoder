#include <bits/stdc++.h>
using namespace std;

vector<long long> enum_divisors(long long n) {
  vector<long long> res;
  for (long long i = 1; i * i <= n; i++) {
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

int main() {
  long long n;
  cin >> n;
  const auto &divs = enum_divisors(n);
  for (int i = 0; i < divs.size(); i++) {
    cout << divs.at(i) << endl;
  }
}
