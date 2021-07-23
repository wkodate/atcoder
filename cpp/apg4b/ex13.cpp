#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;
  int sum = 0;
  vector<int> scores(N);
  for (int i = 0; i < N; i++) {
    cin >> scores.at(i);
    sum += scores.at(i);
  }
  int avg = sum / N;
  for (int i = 0; i < N; i++) {
    cout << abs(scores.at(i) - avg) << endl;
  }
}
