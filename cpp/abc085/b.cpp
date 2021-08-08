#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  int d[n];
  set<int> s;
  for (int i = 0; i < n; i++) {
    cin >> d[i];
    s.insert(d[i]);
  }
  cout << s.size() << endl;
}
