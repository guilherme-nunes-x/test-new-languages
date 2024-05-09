# Python code to draw the given pattern

rows = 7
columns = 17

# Print the top border
print("+" + "-" * columns + "+")

# Print the inner part of the pattern
for i in range(rows):
    if i == 0:
        # Print the first row
        print("|" + " " * 2 + "K" + " " * 3 + "C" + " " * 4 + "7" + " " * 2 + "|" + " " * 3 + "X" + " " * 2 + "2" + " " * 4 + "00" + " " * 2 + "|" + " " * 2 + "Oll" + " " * 3 + "|" + " " * 2 + "99" + "+" + " " * 2 + "1" + " " * 3 + "=" + " " * 2 + "100" + " " * 2 + "|" + " " * 2 + "%" + " " * 2 + "8" + " " * 3 + "9" + " " * 4 + "|")
    elif i == 1:
        # Print the second row
        print("|" + " " * 14 + "+" + " " * 2 + "|")
    else:
        # Print the rest of the rows
        print("|" + " " * columns + "|")

# Print the bottom border
print("+" + "-" * columns + "+")