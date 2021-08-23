#include <bits/stdc++.h>
using namespace std;

vector<int> three_five_seven = {3, 5, 7};
vector<int> tfs;

void dfs(int num, int n_size) {
  if (to_string(num).size() > n_size) {
    return;
  }
  if (num >= 357 
  && to_string(num).find("3") != string::npos
  && to_string(num).find("5") != string::npos
  && to_string(num).find("7") != string::npos ) {
    tfs.push_back(num);
  }
  for (int i = 0; i < three_five_seven.size(); i++) {
    dfs(num * 10 + three_five_seven[i], n_size);
  }
}

int main() {
  long long n;
  cin >> n;
  for (int i = 0; i < three_five_seven.size(); i++) {
    dfs(three_five_seven[i], to_string(n).size());
  }
  sort(tfs.begin(), tfs.end());
  int count = 0;
  for (int i = 0; i < tfs.size(); i++) {
    if (tfs[i] > n) {
      break;
    }
    count++;
  }
  cout << count << endl;
}
