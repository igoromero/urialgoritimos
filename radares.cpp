#include <iostream>
#include <stdlib.h>
using namespace std;

int *opcao;
bool *t_radar;
int *lucros;
int *posicao;

int LIMITE = 1000 * 1000 + 10;

int main() {
  int casos; 
  cin >> casos;

  //opcao = new int[LIMITE];
  
    for(int i = casos; i > 0; i--){

    opcao = new int[LIMITE];
    t_radar = new bool[LIMITE];
    lucros = new int[LIMITE];
      // ler entradas 
        int rads, dist;

         cin >> rads;
         cin >> dist;

    posicao = new int[rads];
    // passando as posicoes
    for (int i = 0; i < rads; i++) {
    
      cin >> posicao[i];
      t_radar[posicao[i]] = true;
    }
  //for do lucro 
    for (int i = 0; i < rads; i++) {
      int lucro;
      cin >> lucro;
    lucros[posicao[i]] = max(lucros[posicao[i]], lucro);
    }

    for (int i = LIMITE - 2; i >= 0; --i) {
      int in, ex;
      opcao[i] = opcao[i + 1];

      if (t_radar[i] && i + dist < LIMITE){
        in = lucros[i] + opcao[i + dist];
        ex = opcao[i];
        opcao[i] = max(ex, in);
      }
    }
    cout << (opcao[0]) << endl;
  }
  return 0;
}

