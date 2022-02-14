#include <bits/stdc++.h>
using namespace std;

int main() {
  double d, t, s;
  cin >> d >> t >> s;
  if (d / s <= t) {
    cout << "Yes" << endl;
    return 0;
  }
  cout << "No" << endl;
}
