def moves(hodi, n, m, nlocal, mlocal)
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
      return -123, 0
    end
    
    if n <= 0 || n > nlocal || m <= 0 || m > nlocal
      return 0, 0
    end
  end
  
  return n, m
end
puts "n = "
n = gets.chomp.to_i
puts "m = "
m = gets.chomp.to_i
hodi = gets.chomp

(1..n).each do |i|
  (1..m).each do |j|
    nnew, mnew = moves(hodi, i, j, n, m)
    
    if (nnew > 0 && nnew <= n) && (mnew > 0 && mnew <= m)
      puts "#{i} #{j}"
      exit
    end
    
    if nnew == -123
      puts 'No'
      exit
    end
  end
end

puts 'No'
