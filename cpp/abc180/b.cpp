#include <bits/stdc++.h>
using namespace std;

int main() {
  cout << fixed << setprecision(15);

  int n;
  cin >> n;
  vector<long long> x(n);
  for (int i = 0; i < n; i++) {
    cin >> x[i];
  }

  long long md = 0;
  long long ed = 0;
  long long cd = 0;
  for (int i = 0; i < n; i++) {
    md += abs(x[i]);
    ed += abs(x[i]) * abs(x[i]);
    cd = max(abs(x[i]), cd);
  }
  cout << md << endl << sqrt(ed) << endl << cd << endl;
}
