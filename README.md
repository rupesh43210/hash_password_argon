# About Argon2 


Argon2 is a memory-hard, password-hashing algorithm that is designed to be resistant to both GPU-based and ASIC-based attacks. It is the winner of the Password Hashing Competition (PHC) and is recommended by experts for password storage.

## Customization

## 1. Time Cost: 
The amount of time (in iterations) that the algorithm spends computing a hash. Increasing the time cost will make the algorithm slower and more memory-intensive, which can make it harder for an attacker to crack the hash.

### 2. Memory Cost: 
The amount of memory (in kibibytes) that the algorithm uses to compute a hash. Increasing the memory cost will make the algorithm more memory-intensive, which can make it harder for an attacker to crack the hash.

### 3. Parallelism: 
The degree of parallelism (i.e., the number of threads) used by the algorithm. Increasing the parallelism will make the algorithm faster, but it will also increase the memory requirements.

### 4. Salt: 
A randomly generated string that is added to the input password before hashing. The salt makes it harder for an attacker to use precomputed tables to crack the hash.

### 5. Pepper:
Argon2 also supports the use of a secret input known as a "pepper". A pepper is a secret value that is added to the password before hashing. Unlike a salt, which is typically stored alongside the hashed password, a pepper is not stored in the database and must be kept secret by the application or system that is using Argon2.

### 6. Hash Length: 
The length (in bytes) of the hash output. The longer the hash, the harder it is to crack.

### Types of Argon2: 
Argon2 has three different variants: Argon2d, Argon2i, and Argon2id. Argon2d is designed to be faster and more memory-intensive, while Argon2i is designed to be slower and more resistant to side-channel attacks. Argon2id is a hybrid of Argon2d and Argon2i.

Customizing these options allows for a wide range of hash output sizes and computational requirements, making Argon2 a versatile and secure option for password storage.





## To deploy this code on AWS Lambda, follow these steps:

### 1. Install the required libraries in your local Python environment, if you haven't

```pip install argon2-cffi```

### 2. Package the Lambda function with its dependencies:

```mkdir package
pip install argon2-cffi -t package/
cp your_python_script.py package/
cd package
zip -r lambda_function.zip .
```
Replace your_python_script.py with the name of the Python file containing your Lambda function code.

3. Create a new Lambda function on the AWS Management Console.

4. Upload the lambda_function.zip file as the function package.

5. Set the handler to your_python_script.lambda_handler.

6. Set the runtime to Python 3.8 or later.

7. Configure the Lambda function's memory, timeout, and other settings as needed.

8. Save and test your Lambda function.

### Remember to replace your_python_script with the actual name of your Python file.


