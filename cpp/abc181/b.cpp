#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<vector<long long>> ab(n, vector<long long>(2));
  for (int i = 0; i < n; i++) {
    cin >> ab[i][0] >> ab[i][1];
  }

  long long sum = 0;
  for (int i = 0; i < n; i++) {
    sum += ab[i][1] * (ab[i][1] + 1) / 2 - ab[i][0] * (ab[i][0] - 1) / 2;
  }
  cout << sum << endl;
}
