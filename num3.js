function WhatTimeIsIt(number){
  let hours = Math.floor(number / 100);
  let minutes = number % 100;
  return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
}

function YesOrNo(number, n){
  if (WhatTimeIsIt(number)) {
    console.log("YES");
   } else {
    console.log("NO");
  }
}


let n = parseInt(prompt("n = "));
for (let i = 0; i < n; i++) {
  let x = parseInt(prompt("Enter the number: "));
  YesOrNo(x, n);
}
