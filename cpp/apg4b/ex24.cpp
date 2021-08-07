#include <bits/stdc++.h>
using namespace std;

struct Clock {
  int hour;
  int minute;
  int second;

  void set(int h, int m, int s) {
    hour = h;
    minute = m;
    second = s;
  }

  string to_str() {
    stringstream hh, mm, ss;
    hh << setw(2) << setfill('0') << hour;
    mm << setw(2) << setfill('0') << minute;
    ss << setw(2) << setfill('0') << second;
    return hh.str() + ":" + mm.str() + ":" + ss.str();
  }

  void shift(int diff_second) {
    int s = hour * 60 * 60 + minute * 60 + second;
    s += diff_second;
    if (s < 0) {
      s += 86400;
    } else if (s == 86400) {
      s = 0;
    }
    hour = s / (60 * 60);
    minute = (s - hour * (60 * 60)) / 60;
    second = s - hour * (60 * 60) - minute * 60;
  }
};

int main() {
  int hour, minute, second;
  cin >> hour >> minute >> second;
  int diff_second;
  cin >> diff_second;

  Clock clock;
  clock.set(hour, minute, second);
  cout << clock.to_str() << endl;
  clock.shift(diff_second);
  cout << clock.to_str() << endl;
}
