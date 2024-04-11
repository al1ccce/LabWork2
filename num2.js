function main() {
  let n = 0;
  console.log("full bottles: ");
  n = parseInt(prompt());
  let m = 0;
  console.log("empty bottles for exchange: ");
  m = parseInt(prompt());
  let mc = n;
  let mcount = n;
  let count = 0;
  let ost = 0;
  let drinkedBottles = 0;
  while (mcount > 0) {
    console.log("F".repeat(n));
    drinkedBottles += n;
    count++;
    mc = n + ost;
    console.log("E".repeat(mc));
    ost = mc % m;
    n = Math.floor(mc / m);
    count++;
    mc = ost;
    mcount = n;
  }
  console.log(drinkedBottles + " " + (count - 1));
}

main();
