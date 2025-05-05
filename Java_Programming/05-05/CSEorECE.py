# CSE or ECE

row = int(input())
col = int(input())
seat_no = int(input())

if (seat_no <= col) or (seat_no % col == 0) or (seat_no % col == 1):
    print("CSE")
else:
    print("ECE")
