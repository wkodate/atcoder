#include <bits/stdc++.h>
using namespace std;

int main() {
  long long x, k, d;
  cin >> x >> k >> d;
  if (abs(x) / d >= k) {
    if (x >= 0) {
      cout << abs(x - d * k) << endl;
    } else {
      cout << abs(x + d * k) << endl;
    }
    return 0;
  }
  if ((k - abs(x) / d) % 2 == 0) {
    cout << abs(x % d) << endl;
  } else {
    if (x >= 0) {
      cout << abs(x % d - d) << endl;
    } else {
      cout << abs(x % d + d) << endl;
    }
  }
}
