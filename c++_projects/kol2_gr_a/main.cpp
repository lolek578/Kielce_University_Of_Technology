#include <iostream>

class TPrzelot{
public:
    int liczPas;
    int liczMiejsc;
    double cena;
    double procent();
    double wplaty();
};
double TPrzelot::procent(){
    return double(liczPas)/liczMiejsc * 100;
}
double TPrzelot::wplaty(){
    return liczPas * cena;
}
class TPrzelotNowy : public TPrzelot{
public:
    double koszty;
    double dochod();
};
double TPrzelotNowy::dochod(){
    return wplaty() - koszty;
}


int main(){

    TPrzelotNowy t;

    std::cout << "Podaj liczbe pasazerow: " << std::endl;
    std::cin >> t.liczPas;
    std::cout << "Podaj liczbe miejsc: " << std::endl;
    std::cin >> t.liczMiejsc;
    std::cout << "Podaj cene: " << std::endl;
    std::cin >> t.cena;
    std::cout << "procent wykorzystania miejsc: " << t.procent() << std::endl;
    std::cout << "suma wplat: " << t.wplaty() << std::endl;
    std::cout << "koszty: " << std::endl;
    std::cin >> t.koszty; // tego brakowało
    std::cout << "kwota dochodu za przelot: " << t.dochod() << std::endl;

    getchar();
    getchar();
    return 0;
}