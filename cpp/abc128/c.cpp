#include <bits/stdc++.h>
using namespace std;

int main() {
  int n, m;
  cin >> n >> m;
  vector<vector<int>> s(m);
  vector<int> p(m);

  for (int i = 0; i < m; i++) {
    int k;
    cin >> k;
    for (int j = 0; j < k; j++) {
      int sj;
      cin >> sj;
      s.at(i).push_back(sj-1);
    }
  }
  for (int i = 0; i < m; i++) {
    cin >> p.at(i);
  }

  int res = 0;
  for (int bit = 0; bit < (1 << n); bit++) {
    bool all = true;
    for (int i = 0; i < m; i++) {
      int count = 0;
      for (int v : s[i]) {
        if (bit & (1 << v)) {
          count++;
        }
      }
      if (count % 2 != p[i]) {
        all = false;
        break;
      }
    }
    if (all) {
      res++;
    }
  }
  cout << res << endl;
}
