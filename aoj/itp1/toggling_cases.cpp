#include <iostream>
#include <cctype>
#include <cstdio>
using namespace std;

int main() {
  char ch;
  while (1) {
    scanf("%c", &ch);
    if (islower(ch)) {
      cout << (char)toupper(ch);
    } else if (isupper(ch)) {
      cout << (char)tolower(ch);
    } else {
      cout << (char)ch;
    }
    if (ch == '\n') {
      break;
    }
  }

  return 0;
}
