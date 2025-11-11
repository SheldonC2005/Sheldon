import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
# Create the DataFrame from the sample data
data2 = {
    'Store_ID': ['S101', 'S102', 'S103', 'S101', 'S102', 'S103'],
    'City': ['Chennai', 'Coimbatore', 'Madurai', 'Chennai', 'Coimbatore', 'Madurai'],
    'Month': ['Jan', 'Jan', 'Jan', 'Feb', 'Feb', 'Feb'],
    'Revenue': [50000, 60000, np.nan, 52000, 61000, 55000],
    'Customer_Count': [400, 500, 450, 410, 480, 470],
    'Discount': ['5%', '10%', '5%', '5%', '8%', '6%']
}
df2 = pd.DataFrame(data2)
# Display the first few rows
print(df2.head())

# Get a summary of the DataFrame (types, non-nulls)
print(df2.info())
# Method 1: Imputation (filling with the median)
median_revenue = df2['Revenue'].median()
df_filled = df2.fillna({'Revenue': median_revenue})

# Method 2: Removal (dropping the row)
df_dropped = df2.dropna(subset=['Revenue'])
df2.groupby('City')['Revenue'].sum().plot(kind='bar', title='Total Revenue by City')
plt.show()
