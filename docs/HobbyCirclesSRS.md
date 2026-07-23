# Hobby Circles SRS 
Requirements – Starter Template

Project Name: HobbyCircles
Team: Yasmin Castro-Cervantes (Provider) and Ashley Crespo (User)
Course: CSC 340
Version: 1.0
Date: 2026-06-29

1. Overview
Vision. Connects users with online and local groups based around shared hobbies. It solves the problem of hobby groups and community activites being scattered across multiple apps and websites, making them difficult to find and organize.HobbyCircles makes it simple to find active groups, get involved with events, and create connections.

Glossary Terms used in the project

HobbyCircles: A small group of users brought together around a shared interest or hobby. 
Event: A scheduled meeting created by a Hobby Circle.

Primary Users / Roles.

Customer (Student/Pet Owner/etc. Basically anyone!) — Join groups and participate in events that match their interests.
Provider (Organizer/Circle leader) — Create a hobby circle and schedule events.
SysAdmin (optional) — Manage platform safety (If we include it).

Scope (this semester)
1. Group pages - Creating and joining hobby circles.
2. Creating a profile - User account creation and login
3. Event - Basic event creation within circles
4. RSVP - Users can RSVP in order to join an event. 

Out of scope (deferred).
1. Payment or premium subscription features.
2. Chat or messaging system.
3. AI powered recommendations.
4. Video calling. 

This document is requirements‑level and solution‑neutral; design decisions (UI layouts, API endpoints, schemas) are documented separately.


2. Functional Requirements (User Stories)

Write each story as: As a <role>, I want <capability>, so that <benefit>. Each story includes at least one Given/When/Then scenario.


2.1 Customer Stories - Ashley

US-1 – Create a user profile
Story: As a customer, I want to create a user profile so that I can personalize my experience and join hobby circles.
Acceptance:

Scenario: Create a user profile
    Given I am not registered
    When I provide valid registration details and submit
    Then my profile should be created and I should be logged in

US-3 – Browse and join hobby circles
Story: As a customer, I want to search for groups by interest or location so that I can find and join hobby circles that match what I enjoy.
Acceptance:

Scenario: Browse and join a hobby circle
    Given I am logged in as a customer
    When I search for groups by interest or location
    Then I should see a list of relevant hobby circles I can join

US-5 – RSVP to an event
Story: As a customer, I want to RSVP to an event so that I can confirm my attendance and keep track of upcoming activities.
Acceptance:

 Scenario: RSVP to an event
    Given I am logged in and a member of a hobby circle
    When I select an upcoming event and choose to RSVP
    Then my RSVP should be saved and the event should appear on my schedule

2.2 Provider Stories - Yasmin

US-2 --
Story: As a provider, I want to create a profile so that I attract users to my hobby circle event. 
Acceptance:

Scenario: <happy path>
  Given I am a registered provider and logged into the HobbyCircles platform
  When  I create and sumbit my profile with details such as my bio, interests, etc.
  Then  my profile is saved successfully and displayed to users browsing similar interest in hobby circles. 

US-4 --
Story: As a provider, I want to create multiple events so that I can bring people together with similar interest. 
Acceptance:

Scenario: Happy path
  Given I am a registered provider and I am logged into my HobbyCircles account with access to my hobby circle.
  When I create a new event by entering event details such as title, description, date, time, and location and submit. 
  Then the event is successfully created and displayed for users to RSVP.


US-6 --
Story: As a provider, I want to have a list of my events so that I can stay organized and track RSVPs.

Acceptance:

Scenario: Happy path
Given I am a registered provider and logged into the HobbyCircles platform
When I access my Events and view my  events with RSVP details
Then I can see all my events organized by date along with the number of users who have RSVPs.


US-7 --
Story: As a provider, I want to see reviews based on past events so that I can improve my hosting skills and create a positive experience for everyone.

Acceptance:

Scenario: Happy path
Given I am a registered provider and logged into the HobbyCircles platform
When I navigate to my past events and view user reviews and ratings
Then I can see feedback from users which helps me improve future events and enhance user experience



2.3 SysAdmin Stories < - Optional 

US‑30 —
Story: As a sysadmin, I want … so that …
Acceptance:

Scenario: <happy path>
  Given <preconditions>
  When  <action>
  Then  <observable outcome>
US‑31 —
Story: As a sysadmin, I want … so that …
Acceptance:

Scenario: <happy path>
  Given <preconditions>
  When  <action>
  Then  <observable outcome>


3. Non‑Functional Requirements (make them measurable)
Performance: 95% of searches and page loads return results in under 2 seconds.
Availability/Reliability: The platform should be available 99.5% of the time, with maintenance windows announced in advance.
Security/Privacy: Passwords and user data must be encrypted in transit and at rest.
Usability: A new user should be able to register, join a circle, and RSVP to an event within 5 minutes.


4. Assumptions, Constraints, and Policies
Users need a modern browser and stable internet connection.
Users must agree to terms of use upon registration.
Providers are responsible for their own group and event content.
Admins can remove any content that violates platform rules.


5. Milestones (course‑aligned)
M1 Requirements — this file + stories opened as issues.
M2 High‑fidelity prototype — core customer/provider flows fully interactive.
M3 Design — architecture, schema, API outline.
M4 Backend API — key endpoints + tests.
M5 Increment — ≥2 use cases end‑to‑end.
M6 Final — complete system & documentation.


6. Change Management
Stories are living artifacts; changes are tracked via repository issues and linked pull requests.
Major changes should update this SRS. 

