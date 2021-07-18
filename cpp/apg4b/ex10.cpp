#include <bits/stdc++.h>
using namespace std;

int main() {
  int A, B;
  cin >> A >> B;
  int i = 0;
  string ans1 = "A:";
  while (i < A) {
    ans1 += "]";
    i++;
  }
  int j = 0;
  string ans2 = "B:";
  while (j < B) {
    ans2 += "]";
    j++;
  }
  cout << ans1 << endl;
  cout << ans2 << endl;
}
