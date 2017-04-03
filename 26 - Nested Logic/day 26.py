def fine(rd, dd):
    ydif = rd[2] - dd[2]
    mdif = rd[1] - dd[1]
    ddif = rd[0] - dd[0]

    if ydif > 0:
        return 10000
    elif ydif == 0 and mdif > 0:
        return (500 * mdif)
    elif mdif == 0 and ddif > 0:
        return (15 * ddif)
    else:
        return 0


return_date = [int(tempd) for tempd in input().strip().split()]
due_date = [int(tempd) for tempd in input().strip().split()]
print(fine(return_date, due_date))
