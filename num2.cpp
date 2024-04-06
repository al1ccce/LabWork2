#include <iostream>
using namespace std;
void main() {
	// есть полных банок
	int n = 0; 
	cout << "full bottles: ";
	cin >> n;
// проверка на дурака
while (cin.fail() || n < 0) {
		system("cls");
		cout << "Enter INTEGER > 0" << endl;
		cin.clear();
		cin.ignore();
		cin >> n;
	}
	// пустых банок на обмен
	int m = 0; 
	cout << "empty bottles for exchange: ";
	cin >> m;
// проверка на дурака
while (cin.fail() || n < 0) {
		system("cls");
		cout << "Enter INTEGER > 0" << endl;
		cin.clear();
		cin.ignore();
		cin >> n;
	}
	// пустые банки после итерации
	int mc = n; 
	// переменная для проверки возможности обменяться
	int mcount = n; 
	// счетчик итераций (выпил + обменял)
	int count = 0;
	// оставшиеся пустые банки после обмена
	int ost = 0;
	// счетчик выпитых банок
	int drinkedBottles = 0;
	while (mcount > 0) {
		cout << string(n, 'F') << endl;
		drinkedBottles += n; 
		// выпил
		count++;
		mc = n + ost;
cout << string(mc, 'E') << endl;
		ost = mc % m;
		n = mc / m;
		// обменял
		count++;
		mc = ost;
		mcount = n;
	}
	cout << drinkedBottles << " " << count-1 << endl;
}
