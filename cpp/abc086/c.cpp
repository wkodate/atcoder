#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<int> t(n), x(n), y(n);
  for (int i = 0; i < n; i++) {
    cin >> t[i] >> x[i] >> y[i];
  }
  int prev_x = 0;
  int prev_y = 0;
  int prev_t = 0;
  for (int i = 0; i < n; i++) {
    int d = abs(x[i] - prev_x) + abs(y[i] - prev_y);
    int time = t[i] - prev_t;
    if (time < d || (time - d) % 2 != 0) {
      cout << "No" << endl;
      return 0;
    }
    prev_x = x[i];
    prev_y = y[i];
    prev_t = t[i];
  }
  cout << "Yes" << endl;
}
