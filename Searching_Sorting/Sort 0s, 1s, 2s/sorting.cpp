#include <iostream>;

using namespace std;

int sortArray(int a[], int n) {
  int j = 0;
  for (int i = 0; i < n; i++) {
    if (a[i] == 0) {
      if (i == j)
        j++;
      else {
        swap(a[i], a[j]);
        j++;
      }
    }
  }
  for (int i = j; i < n; i++) {
    if (a[i] == 1) {
      if (i == j)
        j++;
      else {
        swap(a[i], a[j]);
        j++;
      }
    }
  }
}

int main() {
  int t;
  cin >> t;
  while (t-- != 0) {
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
      cin >> a[i];
    sortArray(a, n);
    for (int i = 0; i < n; i++) {
      cout << a[i];
      cout << " ";
    }
  }
  return 0;
}