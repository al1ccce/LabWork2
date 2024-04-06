#include <iostream>
#include <vector>
using namespace std;
// функция определяет, является ли число временем в формате Hours:Minutes
bool WhatTimeIsIt(int number) {
    int hours = number / 100;
    int minutes = number % 100;
    return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
}
// получает значение из функции WhatTimeIsIt, если true -> YES, если false -> NO
void YesOrNo(vector<int> numbers, int n) {
    for (int i = 0; i < n; i++) {
        if (WhatTimeIsIt(numbers[i])) {
            cout << "YES ";
        }
        else {
            cout << "NO ";
        }
    }
    cout << endl;
}

int main() {
    // количество чисел
    int n = 0;
    cout << "n = ";
    cin >> n;
    while (cin.fail() || n < 0) {
        system("cls");
        cout << "Enter INTEGER > 0" << endl;
        cin.clear();
        cin.ignore();
        cin >> n;
    }
    // вектор с числами
    vector<int> numbers;
    int x = 0;
    // ввод n чисел 
    for (int i = 0; i < n; i++) {
        cout << "Enter " << i + 1 << " number: ";
        cin >> x;
        while (cin.fail() || x < 0) {
            system("cls");
            cout << "Enter INTEGER > 0" << endl;
            cin.clear();
            cin.ignore();
            cin >> x;
        }
        numbers.push_back(x);
    }
    YesOrNo(numbers, n);
}
