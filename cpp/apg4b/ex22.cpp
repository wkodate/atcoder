#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;
  vector<pair<int, int>> ab(N);
  for (int i = 0; i < N; i++) {
    int a, b;
    cin >> a >> b;
    ab[i] = make_pair(b, a);
  }
  sort(ab.begin(), ab.end());
  for (int i = 0; i < N; i++) {
    int a, b;
    tie(b, a) = ab[i];
    cout << a << " " << b << endl;
  }
}
