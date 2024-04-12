#include <iostream>
#include <string>
using namespace std;
// функция, которая возвращает конечную позицию фигуры
pair<int, int> moves(string hodi, int n, int m, int nlocal, int mlocal) {
    // перебор каждого действия из строки
    for (char hod : hodi) {
        switch (hod) {
        case 'L':
            m--;
            break;
        case 'R':
            m++;
            break;
        case 'D':
            n++;
            break;
        case 'U':
            n--;
            break;
        default:
            cout << hod << " is undefined" << endl;
            pair<int, int> p = make_pair(-123, 0);
            return p;
            break;
        }
        if ((m <= 0 || m > mlocal) || (n <= 0 || n > nlocal)) {
            pair<int, int> p = make_pair(0, 0);
            return p;
        }
    }
    pair<int, int> p = make_pair(n, m);
    return p;
}
int main() {
    int n, m = 0;
    cout << "n = ";
    cin >> n;
    while (cin.fail() || n < 0) {
        system("cls");
        cout << "Enter INTEGER > 0" << endl;
        cin.clear();
        cin.ignore();
        cin >> n;
    }
    cout << "m = ";
    cin >> m;
    while (cin.fail() || m < 0) {
        system("cls");
        cout << "Enter INTEGER > 0" << endl;
        cin.clear();
        cin.ignore();
        cin >> m;
    }
    cout << "moves = ";
    string hodi;
    cin >> hodi;
    // идем по строкам 
    for (int i = 1; i <= n; i++) {
        // идем по столбцам
        for (int j = 1; j <= m; j++) {
            pair<int, int> p = moves(hodi, i, j, n, m);
            // если фигура не вышла за пределы доски - вывод + выход
            if ((p.first > 0 && p.first <= n) && (p.second > 0 && p.second <= m)) {
                cout << i << " " << j << endl;
                exit(1);
            }
            // если неправильная команда - выход
            if (p.first == -123) {
                exit(-123);
            }
        }
    }
    cout << "NO" << endl;
    return 0;
}
