use std::io;

fn main() {
    let mut n: i32 = {
        let mut input = String::new();
        println!("full bottles: ");
        io::stdin().read_line(&mut input).expect("Type only 1 NUMBER!");
        input.trim().parse().expect("Type only 1 NUMBER!")
    };
    let mut m: i32 = {
        let mut input = String::new();
        println!("empty bottles for exchange: ");
        io::stdin().read_line(&mut input).expect("Type only 1 NUMBER!");
        input.trim().parse().expect("Type only 1 NUMBER!")
    };
    let mut mc = n;
    let mut mcount = n;
    let mut count = 0;
    let mut ost = 0;
    let mut drinkedBottles = 0;

    while mcount > 0 {
        println!("{}", "F".repeat(n as usize));
        drinkedBottles += n;
        count += 1;
        mc = n + ost;
        println!("{}", "E".repeat(mc as usize));
        ost = mc % m;
        n = mc / m;
        count += 1;
        mc = ost;
        mcount = n;
    }

    println!("{} {}", drinkedBottles, count - 1);
}
