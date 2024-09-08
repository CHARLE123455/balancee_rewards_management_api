# Balancee_Rewards_Management_api
Overview
The Rewards Management API for Balanceè is designed to allow customers to retrieve their current cashback balance and view their cashback transaction history.
The API is built using Java Spring Boot with JWT-based authentication to secure endpoints, and it supports deployment with Docker and Azure.

# Prerequisites
Before setting up and running the project, ensure you have the following installed:
Java 22
Maven
Docker (for containerization)
Azure CLI (if deploying to Azure)
Postman (for testing the endpoints)

# API Documentation
1. Get Rewards Balance
Endpoint: GET /api/rewards/balance
Request Parameters:
customerId (query parameter) - The unique identifier for the customer.
Example Request:
GET /api/rewards/balance?customerId=12345
Authorization: Bearer <JWT_TOKEN>
Response:
{
  "customerId": 12345,
  "totalCashback": 100.0,
  "currentBalance": 50.0
}
2. Get Cashback History
Endpoint: GET /api/rewards/history
Request Parameters:
customerId (query parameter) - The unique identifier for the customer.
Example Request:
GET /api/rewards/history?customerId=12345
Authorization: Bearer <JWT_TOKEN>
Response:
[
  {
    "transactionId": 1,
    "transactionDate": "2024-01-01",
    "amountEarned": 20.0,
    "description": "Booking cashback"
  },
  {
    "transactionId": 2,
    "transactionDate": "2024-02-01",
    "amountEarned": 30.0,
    "description": "Shopping cashback"
  }
]
