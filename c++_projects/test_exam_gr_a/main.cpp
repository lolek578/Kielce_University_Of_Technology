#include <iostream>
#include <cstdlib>

using namespace std;

// --- PRACOWNIK ---
class TPracownik{
public:
    TPracownik(){};
    virtual string sprNazwisko() = 0;
    virtual int sprStaz() = 0;
    virtual double pensja()=0;
};
// --- KIEROWNIK ---
class TKierownik : public TPracownik{
public:
    TKierownik(string n, int s, double p){
      nazwisko = n;
      staz = s;
      podstawa = p;
    };
    string sprNazwisko();
    int sprStaz();
    double pensja();
    void ustawNazwisko(string n);
    void ustawStaz(int n);
    void ustawPodstawe(double n);

private:
    string nazwisko;
    int staz;
    double podstawa;
};

string TKierownik::sprNazwisko() {return nazwisko;}
int TKierownik::sprStaz(){return staz;}
double TKierownik::pensja(){return podstawa + staz * 0.01 * podstawa;}
void TKierownik::ustawNazwisko(string n) {nazwisko = n;}
void TKierownik::ustawStaz(int n) {staz = n;}
void TKierownik::ustawPodstawe(double n) {podstawa = n;}

// --- MECHANIK ---
class TMechanik: public TPracownik{
public:
    TMechanik(string n, int s, double p){
        nazwisko = n;
        staz = s;
        podstawa = p;
    };
    string sprNazwisko();
    int sprStaz();
    double pensja();
    void ustawNazwisko(string n);
    void ustawStaz(int n);
    void ustawPodstawe(double n);

private:
    string nazwisko;
    int staz;
    double podstawa;
};

string TMechanik::sprNazwisko() {return nazwisko;}
int TMechanik::sprStaz(){return staz;}
double TMechanik::pensja(){return podstawa + staz * 0.01 * podstawa;}
void TMechanik::ustawNazwisko(string n) {nazwisko = n;}
void TMechanik::ustawStaz(int n) {staz = n;}
void TMechanik::ustawPodstawe(double n) {podstawa = n;}



void info(TPracownik *p[], int n){
    double suma = 0;
    for(int i = 0; i < n; i++){
        cout << p[i]-> sprNazwisko() << endl;
        cout << p[i]-> sprStaz() << endl;
        cout << p[i]-> pensja() << endl;
        suma += p[i]-> pensja();
    }
    cout << "Suma wydatkow na pensje: " << suma << endl;
}


int main(){

    int n = 3;
    TPracownik *p[n];

    p[0] = new TKierownik("Daniel", 5, 50);
    p[1] = new TKierownik("Slawek", 10, 500);
    p[2] = new TMechanik("Jacek", 10, 500);

    info(p, n);

    return EXIT_SUCCESS;
}
