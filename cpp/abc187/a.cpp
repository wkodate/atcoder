#include <bits/stdc++.h>
using namespace std;

int main() {
  int a, b;
  cin >> a >> b;
  int asum = 0;
  int bsum = 0;
  while (a > 0) {
    asum += a % 10;
    a /= 10;
  }
  while (b > 0) {
    bsum += b % 10;
    b /= 10;
  }
  cout << max(asum, bsum) << endl;
}
