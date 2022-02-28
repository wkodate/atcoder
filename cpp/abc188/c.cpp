#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;
  vector<int> a(pow(2, n));
  vector<pair<int, int>> arr;
  for (int i = 0; i < pow(2, n); i++) {
    cin >> a[i];
    arr.push_back(make_pair(i + 1, a[i]));
  }
  vector<pair<int, int>> prev = arr;
  vector<pair<int, int>> curr = {};
  while (n > 1) {
    for (int i = 0; i < pow(2, n); i = i + 2) {
      if (prev[i].second > prev[i + 1].second) {
        curr.push_back(prev[i]);
      } else {
        curr.push_back(prev[i + 1]);
      }
    }
    n--;
    prev = curr;
    curr = {};
  }
  if (prev[0].second > prev[1].second) {
    cout << prev[1].first << endl;
  } else {
    cout << prev[0].first << endl;
  }
}
