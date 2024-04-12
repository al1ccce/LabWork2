use std::io;

fn moves(hodi: &str, n: i32, m: i32, nlocal: i32, mlocal: i32) -> (i32, i32) {
    let mut n = n;
    let mut m = m;
    let nlocal = nlocal;
    let mlocal = mlocal;
    for hod in hodi.chars() {
        match hod {
            'L' => m -= 1,
            'R' => m += 1,
            'D' => n += 1,
            'U' => n -= 1,
            _ => {
                println!("{} is undefined", hod);
                return (-123, 0);
            }
            
        }
        if m <= 0 || m > mlocal || n <= 0 || n > nlocal {
            return (-123, 0);
        }
    }
    (n, m)
}

fn main() {

    let mut n = String::new();
    let mut m = String::new();
    println!("n = ");
    io::stdin().read_line(&mut n).expect("Failed to read input");
    println!("m = ");
    io::stdin().read_line(&mut m).expect("Failed to read input");
    let n: i32 = n.trim().parse().expect("Invalid input");
    let m: i32 = m.trim().parse().expect("Invalid input");
    
    let mut hodi = String::new();
    io::stdin().read_line(&mut hodi).expect("Failed to read input");
    let hodi = hodi.trim();

    for i in 1..=n {
        for j in 1..=m {
            let p = moves(hodi, i, j, n, m);
            if (p.0 > 0 && p.0 <= n) && (p.1 > 0 && p.1 <= m) {
                println!("{} {}", i, j);
                std::process::exit(0);
            }
            }
        }
    println!("No");
    }
