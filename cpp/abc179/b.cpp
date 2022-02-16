#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<vector<int>> d(n, vector<int>(2));
  for (int i = 0; i < n; i++) {
    cin >> d[i][0] >> d[i][1];
  }

  for (int i = 1; i < n - 1; i++) {
    if (d[i - 1][0] == d[i - 1][1] && d[i][0] == d[i][1] &&
        d[i + 1][0] == d[i + 1][1]) {
      cout << "Yes" << endl;
      return 0;
    }
  }
  cout << "No" << endl;
}
