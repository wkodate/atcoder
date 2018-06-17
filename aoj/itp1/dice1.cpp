#include <iostream>
using namespace std;

class Dice {
  public:
    Dice() {
      number = new int[6];
      work = new int[6];
    };

    void setLabel(int i, int label) {
      number[i] = label;
    }

    void roll(char dst) {
      for (int i = 0; i < 6; i++) {
        work[i] = number[i];
      }
      switch(dst) {
        case 'E':
          setNumber(work[3],work[1],work[0],work[5],work[4],work[2]);
          break;
        case 'N':
          setNumber(work[1],work[5],work[2],work[3],work[0],work[4]);
          break;
        case 'S':
          setNumber(work[4],work[0],work[2],work[3],work[5],work[1]);
          break;
        case 'W':
          setNumber(work[2],work[1],work[5],work[0],work[4],work[3]);
          break;
      }
    }

    void setNumber(int n0, int n1, int n2, int n3, int n4, int n5){
      number[0] = n0;
      number[1] = n1;
      number[2] = n2;
      number[3] = n3;
      number[4] = n4;
      number[5] = n5;
    }

    void printTop() {
      printf("%d\n",number[0]);
    }

  private:
    int* number;
    int* work;
};

int main() {
  Dice dice;
  int label;
  char ch;
  for(int i = 0; i<6; i++){
    scanf("%d", &label);
    dice.setLabel(i, label);
  }
  getchar();
  while((ch = getchar()) != '\n'){
    dice.roll(ch);
  }
  dice.printTop();
}
