#include <bits/stdc++.h>
using namespace std;

struct Utils {

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