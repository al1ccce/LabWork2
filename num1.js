function moves(hodi, n, m) {
  for (let hod of hodi) {
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
        console.log(hod + " is undefined");
        return [-123, 0];
    }
  }
  return [n, m];
}

function findFigurePosition(n, m, hodi) {
  for (let i = 1; i <= n; i++) {
    for (let j = 1; j <= m; j++) {
      let [x, y] = moves(hodi, i, j);
      if (x > 0 && x <= n && y > 0 && y <= m) {
        return [i, j];
      }
      if (x === -123) {
        return "No";
      }
    }
  }
  return "No";
}

let n = parseInt(prompt("n = "));
let m = parseInt(prompt("m = "));
let hodi = prompt("Enter the moves: ");

let result = findFigurePosition(n, m, hodi);
console.log(result);
