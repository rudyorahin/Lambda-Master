# AWS Lambda Even/Odd Checker

## Overview
This project consists of an AWS Lambda function that checks if a given number is even or odd. The function receives a JSON payload containing an integer, processes it, and responds with a message indicating whether the integer is even or odd.

## Purpose
The purpose of this Lambda function is to provide a simple API endpoint, which can be triggered through AWS API Gateway, to check the parity of a number. This can be useful in applications that require quick checks for number properties without the need for a full backend service.

## Usage

### Sending a Request:
To use this function, send a POST request with a JSON payload containing the number you want to check:

```json
{
  "input": YOUR_NUMBER_HERE
}
```

## Response
The function will respond with a message indicating the parity of the number:

```json
{
  "answer": "YOUR_NUMBER_HERE is even"
}
```

OR

```json
{
  "answer": "YOUR_NUMBER_HERE is odd"
}
```

## Setup
1. Deploy this code as an AWS Lambda function.
2. Set up an API Gateway trigger for the Lambda function.
3. Use the generated API endpoint to send POST requests.

## Logging
The function uses the `org.apache.logging.log4j` library for logging purposes. Errors, inputs, and outputs are logged for debugging and monitoring.

## License
Copyright © 2023 Rudy Orahin.
Licensed under the MIT License. See LICENSE for more information.

```yaml

---

Feel free to modify the README to better suit your project. Don't forget to add a `LICENSE` file in your GitHub repository and paste the MIT License text into it, crediting you as the copyright holder.
```
