#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
  string word;
  cin >> word;
  char chars[] = {'a', 'i', 'u', 'e', 'o'};
  for(int i=0;i<sizeof(chars);i++) {
    word.erase(remove(word.begin(), word.end(), chars[i]), word.end());
  }

  cout << word << endl;
  return 0;
}
