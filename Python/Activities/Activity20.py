# Import pandas
import pandas 
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('./activities/sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer.close()
input_data = pandas.read_excel("./activities/sample.xlsx", sheet_name='Sheet1')
print("Shape: ", input_data.shape)
print("========== DataFrame Shape ==========")
print("Rows: ", input_data.shape[0], "Columns: ", input_data.shape[1])
# Print the data in the emails column only
print("========== Emails Column ==========")
print(input_data["Email"])
# Sort the data based on FirstName in ascending order and print the data
print("========== Sorted by FirstName ==========")
print(input_data.sort_values(by="FirstName"))