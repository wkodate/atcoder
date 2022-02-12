#include <bits/stdc++.h>
using namespace std;

int main() {
  vector<int> abc(3);
  cin >> abc.at(0) >> abc.at(1) >> abc.at(2);
  sort(abc.begin(), abc.end());
  if (abc.at(0) == 5 && abc.at(1) == 5 && abc.at(2) == 7) {
    cout << "YES" << endl;
    return 0;
  }
  cout << "NO" << endl;
}
