 # <strong>Hacker Rank</strong> challenge <strong>day 27: Unit testing</strong>, solved using <strong>java 8</strong> programming language
 # 
 # <strong>Challenge</strong>
 # To help unit testing create the methods:
 # 
 # In the class TestDataEmptyArray create the get_array() method that return an empty array
 # 
 # 
 # In the class TestDataUniqueValues create the methods:
 # get_array() returns an array of size at least 2 with all unique elements
 # get_expected_result() returns the expected minimum value index for this array
 # 
 # In the class TestDataExactlyTwoDifferentMinimums:
 # get_array() returns an array where the minimum value occurs at exactly 2 indices
 # get_expected_result() returns the expected index 
 #
 # author Ed Barros - barrosef@gmail.com

def minimum_index(seq):
    if len(seq) == 0:
        raise ValueError("Cannot get the minimum value index from an empty sequence")
    min_idx = 0
    for i in range(1, len(seq)):
        if seq[i] < seq[min_idx]:
            min_idx = i
    return min_idx

from random import randint, sample
    
class TestDataEmptyArray(object):
    
    @staticmethod
    def get_array():
        return []

class TestDataUniqueValues(object):
    
    @staticmethod
    def get_array():
        return [1, 2, 3, 4]

    @staticmethod
    def get_expected_result():
        return 0

class TestDataExactlyTwoDifferentMinimums(object):
    
    @staticmethod
    def get_array():
        return [0, 0, 1]

    @staticmethod
    def get_expected_result():
        return 0

def TestWithEmptyArray():
    try:
        seq = TestDataEmptyArray.get_array()
        result = minimum_index(seq)
    except ValueError as e:
        pass
    else:
        assert False


def TestWithUniqueValues():
    seq = TestDataUniqueValues.get_array()
    assert len(seq) >= 2

    assert len(list(set(seq))) == len(seq)

    expected_result = TestDataUniqueValues.get_expected_result()
    result = minimum_index(seq)
    assert result == expected_result


def TestiWithExactyTwoDifferentMinimums():
    seq = TestDataExactlyTwoDifferentMinimums.get_array()
    assert len(seq) >= 2
    tmp = sorted(seq)
    assert tmp[0] == tmp[1] and (len(tmp) == 2 or tmp[1] < tmp[2])

    expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result()
    result = minimum_index(seq)
    assert result == expected_result

TestWithEmptyArray()
TestWithUniqueValues()
TestiWithExactyTwoDifferentMinimums()
print("OK")