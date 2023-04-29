
# To deploy this code on AWS Lambda, follow these steps:

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
