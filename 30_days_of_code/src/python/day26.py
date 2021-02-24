 # Hacker Rank challenge day 26: Nested Logic, solved using Go programming language
 #
 # Challenge
 #
 # Calculate the fine like as:
 # When return date is late in days fine is (days difference * 15)
 # When return date is late in months fine is (months differences * 500)
 # When return date is late in years fine is 10000
 # When no late return fine is 0
 #
 # @author Ed Barros - barrosef@gmail.com

actually = str(input()).split(" ")
da = int(actually[0])
ma = int(actually[1])
ya = int(actually[2])

expected = str(input()).split(" ")
de = int(expected[0])
me = int(expected[1])
ye = int(expected[2])

fine = 0

if ya > ye:
    fine = 10000
elif ya == ye and ma > me:
    fine = (ma - me) * 500
elif ya == ye and ma == me and da > de:
    fine = (da - de) * 15

print(fine)