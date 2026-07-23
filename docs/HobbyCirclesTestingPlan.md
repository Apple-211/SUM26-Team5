**Project Name:**   HobbyCircles
**Version:** 1.0
**Date:**  July 22, 26
**Purpose:** Test plan for HobbyCircles application

## Actors
- Provider P: Event Host
- Customer C: User seeking to make connection
- Service S: Attend event offered by the Provider (Host)

#### 1. Customer: Sign up and browse/join hobby circles
1. opens `signup.html` and enters name, email, password.
2. submits and their profile is created.
3. searches for groups on `search.html`, opens one, and views its details.

#### 2. Customer: Log in
1. opens `login.html` and enters email and password.
2. is logged in and taken to their dashboard.

#### 3. Customer: RSVP to an event
1. RSVPs to an upcoming event.
2. sees the RSVP on their dashboard.

#### 6. Customer: Leave a review
1. opens `review.html` for a group they attended.
2. submits a rating and comment.
3. sees the review saved under that group.

  
#### 5. Provider: US-PROV-02 - Create a profile to start creating events!
1. Provider goes to the application and clicks create profile
2. Provider fills out the form and click create to submit form
3. Confirmation of profile created shows up

#### 6. Provider: US-PROV-04 - Create events
1. Provider opens the Create Event page.
2. Provider enters the event title, description, date, time, location, category, and capacity.
3. Provider submits the form.

#### 7. Provider: US-PROV-06 - Provider can view their Events
1. Provider opens the 'My Events' page.
2. Shows events created by the provider. 

#### 8. Provider: US-PROV-07 - View reviews 
1. Provider opens the Reviews page.
2. Submitted customer reviews are displayed.

## CROSS-CUTTING TEST SCENARIOS (Non-Functional Requirements)

### Performance Requirements

**Scenario P1: Platform stays up**
- **Steps:** Access the app at different times over the week.
- **Expected Outcome:** App is available 99.5% of the time

**Scenario P2:**
- **Setup:** 
- **Steps:**
  1. x
  2. y
- **Expected Outcome:** 

### Security & Privacy Requirements

**Scenario S1: Wrong password is rejected**
- **Steps:** Log in with correct email, wrong password.
- **Expected Outcome:** Login fails.

### Usability Requirements

**Scenario U1:New customer can sign up and RSVP quickly
- **Steps:** Sign up, browse groups, RSVP to an event.
- **Expected Outcome:** Done in under 5 minutes with no errors.

**Scenario U2:**
- **Setup:** 
- **Steps:**
  1. x
  2. y
- **Expected Outcome:** 
