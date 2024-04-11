def what_time_is_it(number)
  hours = number / 100
  minutes = number % 100
  (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59)
end

def yes_or_no(number, n)
  if what_time_is_it(number)
    puts "YES"
  else
    puts "NO"
  end
end

print "n = "
n = gets.chomp.to_i

n.times do
  print "Enter the number: "
  x = gets.chomp.to_i
  yes_or_no(x, n)
end
