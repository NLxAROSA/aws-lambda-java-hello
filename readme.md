This is a simple Hello World application for use with AWS Lambda.

Usage:

* Build the JAR using 'gradlew fatJar'
* Upload the JAR into your AWS Lambda console
* Use 'io.bymbl.aws.lambda.poc.HelloLambda::myHandler' as handler name.
* Pick an existing role or create a new one
* To test, supply a string as the input message, such as "Lars"
* This will result in the output "Hello Lars"

Check the AWS Lambda documentation at http://docs.aws.amazon.com/lambda/latest/dg/lambda-app.html for more information.