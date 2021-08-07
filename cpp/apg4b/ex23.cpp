#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<long long> a(n);
  for (int i = 0; i < n; i++) {
    cin >> a[i];
  }
  map<long long, int> map;
  for (int i = 0; i < n; i++) {
    if (map.count(a[i])) {
      map[a[i]]++;
    } else {
      map[a[i]] = 1;
    }
  }
  int max_key = a[0];
  long long max_value = map[a[0]];
  for (int i = 0; i < n; i++) {
    if (map[a[i]] > max_value) {
      max_key = a[i];
      max_value = map[a[i]];
    }
  }
  cout << max_key << " " << max_value << endl;
}
