## 1. Overview 

HobbyCircles is a backend API built with Java, Spring Boot, JPA, and PostgreSQL. It supports provider profiles, reviews, events, replies, and customer RSVP-related functionality.


## 2. UML Class Diagram

![HobbyCircles UML Class Diagram](../doc/UMLClassDiagram.jpg)

## 3. API Endpoints

## 3.1 Provider Endpoints

### Creating a provider profile

POST /api/providers

#### Request Body:
```json

{
  "name": "Allen",
  "email": "Allen123@example.com",
  "interests": "Hockey and Pokèmon",
  "description": "I enjoy going outdoors.",
  "location": "Raleigh, NC"
}
```

#### Response
```json
{
	"providerId": 3,
	"name": "Allen",
	"email": "Allen123@example.com",
	"interests": "Hockey and Pokèmon",
	"description": "I enjoy going outdoors.",
	"location": "Raleigh, NC"
}
```

### Get all providers

GET /api/providers

#### Response
```json
[
	{
		"providerId": 1,
		"name": "Yasmin",
		"email": "yasmin@example.com",
		"interests": "Movies, Coding",
		"description": "I sometimes enjoy organizing outdoor activities.",
		"location": "Greensboro, NC"
	},
	{
		"providerId": 2,
		"name": "John",
		"email": "John123n@example.com",
		"interests": "Movies and Coding",
		"description": "I enjoy organizing hobby events.",
		"location": "Greensboro, NC"
	},
    {
	"providerId": 3,
	"name": "Allen",
	"email": "Allen123@example.com",
	"interests": "Hockey and Pokèmon",
	"description": "I enjoy going outdoors.",
	"location": "Raleigh, NC"
}
]
```

### Get a Provider (Host) by id

GET /api/providers/{providerId}

### Example 

GET /api/providers/1

#### Update a provider profile

PUT /api/providers/{providerId}

#### Request body:
```json
{
  "name": "Yasmin",
  "email": "yasmin@example.com",
  "interests": "Movies, Coding, Hiking",
  "description": "I organize local and online hobby events.",
  "location": "Greensboro, NC"
}
```

#### Delete a provider

DELETE /api/providers/{providerId}

## 3.2 Event Endpoint

### Creating an event

POST /api/events/provider/{providerId}

#### Request Body:
```json
{
  "title": "Movie Night",
  "description": "A fun Disney movie night for local members.",
  "eventDate": "2026-07-20",
  "eventTime": "6:00 PM",
  "location": "Greensboro Library",
  "category": "Movies",
  "capacity": 25,
  "rsvpCount": 8
}
```

### Get all events

GET /api/events

### Get an event by the ID

GET /api/events/{eventId}

### Get all events for one provider

GET /api/events/provider/{providerId}

### View Provider Calendar 

GET /api/events/provider/{providerId}/calendar

### Update an event

PUT /api/events/{eventId}

### Delete an event

DELETE /api/events/{eventId}

## 3.3 Review Endpoints

### Get all reviews

GET /api/reviews

### Get reviews for an past event

GET /api/reviews/event/{eventId}

## 3.4 Reply Endpoints

### Create a reply to a review

POST /api/replies/review/{reviewId}

#### Request Body:
```json
{
  "providerReply": "Thank you for attending! I am glad you enjoyed the event. :D ",
  "replyDate": "2026-07-22"
}
```

### Get all replies 

GET /api/replies

### Get a reply by ID

GET /api/replies/{replyId}

### Delete a reply

DELETE /api/replies/{replyId}

## 4. Use Case Mapping

The API endpoints support the following SRS user stories.

### Provider Use Cases

| SRS Use Case | Related Endpoints |
|--------------|-------------------|
| **US-2 Create and manage provider profile** | `POST /api/providers`, `GET /api/providers/{providerId}`, `PUT /api/providers/{providerId}`, `DELETE /api/providers/{providerId}` |
| **US-4 Schedule and manage events** | `POST /api/events/provider/{providerId}`, `GET /api/events`, `GET /api/events/{eventId}`, `GET /api/events/provider/{providerId}`, `PUT /api/events/{eventId}`, `DELETE /api/events/{eventId}` |
| **US-6 View event calendar and RSVP counts** | `GET /api/events/provider/{providerId}` |
| **US-7 View reviews and reply to reviews** | `GET /api/reviews/event/{eventId}`, `POST /api/replies/review/{reviewId}`, `GET /api/replies`, `DELETE /api/replies/{replyId}` |