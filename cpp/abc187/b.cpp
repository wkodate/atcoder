#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<int> x(n);
  vector<int> y(n);
  for (int i = 0; i < n; i++) {
    cin >> x[i] >> y[i];
  }

  int count = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
      double s = (double)(y[j] - y[i]) / (x[j] - x[i]);
      if (s >= -1 && s <= 1) {
        count++;
      }
    }
  }
  cout << count << endl;
}
