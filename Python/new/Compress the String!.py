from itertools import groupby
for key, group in groupby(input()):
   print('({}, {})'.format(len(list(group)), key), end=" ")