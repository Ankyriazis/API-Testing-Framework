#!/bin/bash

# Navigate to the Postman collection directory
cd ../postman/collections

# Run the Postman tests using Newman
newman run api-tests.postman_collection.json -e ../environments/dev.postman_environment.json --reporters cli,json --reporter-json-export newman-report.json

# Check if the tests were successful
if [ $? -eq 0 ]; then
  echo "All tests passed successfully."
else
  echo "Some tests failed. Please check the report for details."
fi