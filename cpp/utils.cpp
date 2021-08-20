#include <bits/stdc++.h>
using namespace std;

struct Utils {

  // sort, asc/desc
  void sort_array(int n, vector<int> a) {
    sort(a.begin(), a.end());
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
  void bitSearch() {
    // 3ビットのビット列をすべて列挙する
    for (int tmp = 0; tmp < (1 << 3); tmp++) {
      bitset<3> s(tmp);
      // (ビット列sに対する処理)
    }
  }
};

int main() {
  Utils utils;

  utils.bitSearch();
}