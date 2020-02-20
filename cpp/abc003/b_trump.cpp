#include <iostream>
#include <string>

using namespace std;

int main() {
  string row1, row2;
  cin >> row1 >> row2;

  string result;
  const char *row1_char = row1.c_str();
  const char *row2_char = row2.c_str();
  char at_mark[] = {'a','t','c','o','d','e','r'};

  int win = 1;
  for(int i=0;i<sizeof(row1_char);i++) {
    if(row1_char[i] != row2_char[i] && row1_char[i] != '@' && row2_char[i] != '@') {
      win = 0;
      break;
    }
    if(row1_char[i] == '@' && row2_char[i] == '@') {
      continue;
    }
    if(row1_char[i] == '@' || row2_char[i] == '@') {
      win=0;
      for(int j=0;j<sizeof(at_mark);j++) {
        if((row1_char[i] == '@' && at_mark[j] == row2_char[i])
            || (row2_char[i] == '@' && at_mark[j] == row1_char[i])) {
          win=1;
          break;
        }
      }
      if(!win) {
        break;
      }
    }
  }

  if(win) {
    result = "You can win";
  } else {
    result = "You will lose";
  }

  cout << result << endl;
  return 0;
}
