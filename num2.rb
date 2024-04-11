puts "full bottles: "
n = gets.chomp.to_i
puts "empty bottles for exchange: "
m = gets.chomp.to_i
mc = n
mcount = n
count = 0
ost = 0
drinkedBottles = 0

while mcount > 0
  puts "F" * n
  drinkedBottles += n
  count += 1
  mc = n + ost
  puts "E" * mc
  ost = mc % m
  n = mc / m
  count += 1
  mc = ost
  mcount = n
end

puts "#{drinkedBottles} #{count-1}"
