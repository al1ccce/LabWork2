use std::io;

fn what_time_is_it(number: i32) -> bool {
    let hours = number / 100;
    let minutes = number % 100;
    (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59)
}

fn yes_or_no(number: i32, n: i32) {
    if what_time_is_it(number) {
        println!("YES");
    } else {
        println!("NO");
    }
}

fn main() {
    let mut input = String::new();
    println!("n = ");
    io::stdin().read_line(&mut input).expect("Enter only int!");
    let n: i32 = input.trim().parse().expect("Enter only int!");

    for _ in 0..n {
        let mut input = String::new();
        println!("Enter the number: ");
        io::stdin().read_line(&mut input).expect("Enter only int!");
        let x: i32 = input.trim().parse().expect("Enter only int!");
        yes_or_no(x, n);
    }
}
