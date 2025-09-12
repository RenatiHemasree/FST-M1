import pytest
import pandas as pd
import math
def test_sqrt():
    num = 25
    assert math.sqrt(num) == 5
 
def testsquare():
   num = 7
   assert num*num == 40
 
def tesequality():
   assert 10 == 11

def test_equality():
    assert 10 == 11

def test_excel_data():
    df = pd.read_csv("./activities/sample.csv")
    assert df.shape == (3, 3)
    assert df["Usernames"][1] == "Charles"