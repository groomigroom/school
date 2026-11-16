#11/16
#극단치
#IQR 
#상한 하한 값 구하

# boxplot
#상한값 하한값
#산점도
#그래프
#seaborn

#산점도는 점으로 찍어진 그래프이다.
'''
import pandas as pd
import numpy as np
import seaborn as sns

mpg = pd.read_csv('data/mpg.csv')
sns.scatterplot(data = mpg, x = 'displ', y = 'hwy')
'''
'''
import pandas as pd
import numpy as np
import seaborn as sns

mpg = pd.read_csv('data/mpg.csv')
sns.scatterplot(data = mpg, x = 'displ', y = 'hwy', hue = 'drv').set(xlim=[3,6], ylim=[10,30])
'''
'''
import pandas as pd
import numpy as np
import seaborn as sns

mpg = pd.read_csv('data/mpg.csv')
sns.scatterplot(data = mpg, x = 'cty', y = 'hwy', hue = 'drv')
'''
'''
import pandas as pd
import numpy as np
import seaborn as sns

midwest = pd.read_csv('data/midwest.csv')
sns.scatterplot(data = midwest, x = 'poptotal', y = 'popasian').set(xlim=(0, 500000), ylim = (0, 10000))
'''
'''
df_mpg = mpg.groupby('drv')\
.agg(mean_hwy = ('hwy', 'mean'))
df_mpg
'''
'''
order
value_counts().index
'''
'''
import pandas as pd
import numpy as np
import seaborn as sns

mpg = pd.read_csv('data/mpg.csv')

mpg['drv'].value_counts().index
Index(['f', '4', 'r'], dtype='object', name='drv')
sns.countplot(data = mpg, x = 'drv', order = mpg['drv'].value_counts().index)
'''
'''
import pandas as pd
import numpy as np
import seaborn as sns

mpg = pd.read_csv('data/mpg.csv')
df = mpg.query('category == "suv"').groupby('manufacturer', as_index=False)

# cty 평균 구하기
df = df['cty'].mean()

# 내림차순 정렬
df = df.sort_values('cty', ascending=False)

# 상위 5행 추출
df.head(5)
'''
'''
df_mpg = mpg.groupby('category', as_index = False)\
.agg(n = ('category', 'count'))\
.sort_values('n', ascending = False)
df_mpg
sns.barplot(data = df_mpg, x = 'category', y = 'n')
'''
