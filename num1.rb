def moves(hodi, n, m)
  hodi.each_char do |hod|
    case hod
    when 'L'
      m -= 1
    when 'R'
      m += 1
    when 'D'
      n += 1
    when 'U'
      n -= 1
    else
      puts "#{hod} is undefined"
      return [-123, 0]
    end
  end
  [n, m]
end

n = 0
m = 0
puts "n = "
n = gets.chomp.to_i
puts "m = "
m = gets.chomp.to_i
puts "moves = "
hodi = gets.chomp
(1..n).each do |i|
  (1..m).each do |j|
    p = moves(hodi, i, j)
    if p[0] > 0 && p[0] <= n && p[1] > 0 && p[1] <= m
      puts "#{i} #{j}"
      abort
    end
    if p[0] == -123
      abort "No"
    end
  end
end
puts "No"
