#include <bits/stdc++.h>
using namespace std;

int main() {
  string n;
  cin >> n;
  int sum = 0;
  for (int i = 0; i < n.length(); i++) {
    sum += atoi(n.substr(i, 1).c_str());
  }
  if (sum % 9 == 0) {
    cout << "Yes" << endl;
  } else {
    cout << "No" << endl;
  }
}
