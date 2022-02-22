#include <bits/stdc++.h>
using namespace std;

int main() {
  cout << fixed << setprecision(15);

  int sx, sy, gx, gy;
  cin >> sx >> sy >> gx >> gy;
  cout << (double)(gx - sx) / (sy + gy) * sy + sx << endl;
}
