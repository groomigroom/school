import seaborn as sb


#---------------------------------


var = ['a', 'a', 'b', 'c']
var

sb.countplot(x = var)


#---------------------------------

df = sb.load_dataset('titanic')
df

#---------------------------------

sb.countplot(data = df, x = 'pclass')
