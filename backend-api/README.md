## Live API
Deployed on Render: https://sum26-team5.onrender.com

## Customer Endpoints (Ashley Crespo)

### Customer

Create customer profile (Sign up): POST /api/customers
{
  "name": "Ashley Crespo",
  "email": "ashley@example.com",
  "password": "password123",
  "hobbies": "hiking, coding",
  "location": "Greensboro, NC",
  "accountStatus": "active"
}

Customer login: POST /api/customers/login
{
  "email": "ashley@example.com",
  "password": "password123"
}

Modify customer profile: PUT /api/customers/{customerId}
{
  "name": "Ashley Crespo",
  "email": "ashley@example.com",
  "password": "password123",
  "hobbies": "hiking, board games",
  "location": "Raleigh, NC",
  "accountStatus": "active"
}

### Rsvp (Subscribe to available services)

Join a group: POST /api/customers/{customerId}/rsvps
{
  "groupId": 1
}

### Review (Write reviews for subscribed services)

Write a review: POST /api/customers/{customerId}/reviews
{
  "groupId": 1,
  "rating": 5,
  "comment": "Great group, super welcoming!"
}

## Use Case Mapping (Customer)

| Use Case | Endpoint |
|---|---|
| Create customer profile | POST /api/customers |
| Customer login | POST /api/customers/login |
| Modify customer profile | PUT /api/customers/{customerId} |
| Subscribe to available services (join a group) | POST /api/customers/{customerId}/rsvps |
| Write reviews for subscribed services | POST /api/customers/{customerId}/reviews |
