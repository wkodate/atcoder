#include <bits/stdc++.h>
using namespace std;

struct Utils {

  // sort, asc/desc
  void sort_array(int n, vector<int> a) {
    // asc
    sort(a.begin(), a.end());
    // desc
    sort(a.begin(), a.end(), greater<int>());
  }

  bool ends_with() {
    string s = "abc";
    string suffix = "ab";
    if (s.size() < suffix.size()) {
      return false;
    }
    return equal(rbegin(suffix), rend(suffix), rbegin(s));
  }

  // bit全探索
  void bitSearch(int n, vector<int> a) {
    for (int bit = 0; bit < (1 << n); bit++) {
      int sum = 0;
      for (int i = 0; i < n; i++) {
        if (bit & (1 << i)) {
          sum += a[i];
        }
      }
    }
  }
};

int main() {
  Utils utils;

  utils.bitSearch();
}