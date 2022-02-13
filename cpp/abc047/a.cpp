#include <bits/stdc++.h>
using namespace std;

int main() {
  vector<int> abc(3);
  cin >> abc.at(0) >> abc.at(1) >> abc.at(2);
  sort(abc.begin(), abc.end());
  if (abc[0] + abc[1] == abc[2]) {
    cout << "Yes" << endl;
    return 0;
  }
  cout << "No" << endl;
}
