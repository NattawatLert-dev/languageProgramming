# Variables = A container for a value (String , unteger, float, boolean)
#             A variable behaves as if it was the value is contains

#String
first_name = "Tle"
food = "pizza"
email = "fake123@gmail.com"

print(f"Hello {first_name}")
print(f"You like {food}")
print(f"Your email is: {email}")

#Integers
age = 21
quantity = 3
num_of_students = 30

print(f"You are {age} years old")
print(f"You are buying {quantity} items")
print(f"Your class has {num_of_students} students")

#Float
price = 10.99
gpa = 3.2
distance = 5.5

print(f"The price is {price}")
print(f"Your gpa is: {gpa}")
print(f"You ran {distance}km")

#Boolean
is_student = True


print(f"Are you a student?: {is_student}")

if is_student:
    print(f"YOu are a student")
else:
    print("You are NOT a student")