#include <iostream>
using namespace std;


class TTowar{
public:
    TTowar(){};
    //#virtual string sprNazwa() = 0; ???????
    virtual string sprNazwa() = 0;
    virtual double sprRabat() = 0;
    virtual double cena() = 0;
};

class TProcesor : public TTowar{
public:
    TProcesor(string n, double r, double c){
        nazwa = n;
        rabat = r;
        cena_regularna = c;
    };
    string sprNazwa();
    void ustawNazwe(string n); // ustawia nazwe produktu
    void ustawRabat(double r); //ustawia cene rabatu
    double sprRabat();
    double cena();

private:
    double rabat;
    double cena_regularna;
    string nazwa;
};

string TProcesor::sprNazwa(){
    return nazwa;
}

void TProcesor::ustawNazwe(string n){
    nazwa = n;
}

void TProcesor::ustawRabat(double r){
    rabat = r;
}
double TProcesor::sprRabat(){
    return rabat;
}
double TProcesor::cena(){
    return cena_regularna - (cena_regularna * (0.01 * rabat));
}

void info(TProcesor *p[], int x){
    double sum = 0;
    for(int i = 0; i < x; i++){
        cout << p[i]->sprNazwa() <<endl;
        sum += p[i]->cena();
    }
    cout << sum;
}

int main() {

    TProcesor *p[2];

    p[0] = new TProcesor("Karol", 30, 100);
    p[1] = new TProcesor("Patryk", 20, 100);

    info(p, 2);

    return EXIT_SUCCESS;
}
