 # Hacker Rank challenge day 28: Regex, solved using java 8 programming language
 # 
 # Challenge
 # Create regex the check that name and e-mail is valid in lowercase form
 # 
 # @author barrosef@gmail.com

import re


N_MIN = 2
N_MAX = 30
EMAIL_RE = "^[a-z0-9]+[\._]?[a-z0-9]+@gmail+[.]\w{2,3}$"
N_CONSTRAINT_ERROR_MSG ="n = %i is not compliance with constraint %i <= n <= %i"

n = int(input().strip())
if N_MIN <= n <= N_MAX:
    names =[]
    for a0 in range(n):
        firstName,emailID = input().strip().split(' ')
        firstName,emailID = [str(firstName),str(emailID)]
        if re.match(EMAIL_RE, emailID):
            names.append(firstName)
           
    list2 = (sorted(names))
    for elem in list2:
        print (elem)
else:
    print(N_CONSTRAINT_ERROR_MSG, n, N_MIN, N_MAX)