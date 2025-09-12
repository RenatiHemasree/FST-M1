# Import pandas
import pandas as pd

# Create a dataset
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a dataset into a dataframe
df = pd.DataFrame(data)

# write the dataframe to a CSV file
df.to_csv("./activities/sample.csv", index=False)
#Activity 18
# print the values only in the usernames column
input_data = pd.read_csv("./activities/sample.csv")
print(input_data["Usernames"])
#print the username and password of the second row
print(input_data["Usernames"][1], input_data["Passwords"][1])
#sort usernames in ascending order
print(input_data.sort_values("Usernames"))
print(input_data.sort_values("Passwords", ascending=False))