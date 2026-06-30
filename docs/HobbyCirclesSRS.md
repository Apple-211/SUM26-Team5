# Hobby Circles SRS 
Requirements – Starter Template

Project Name: HobbyCircles
Team: Yasmin Castro-Cervantes (Provider) and Ashley Crespo 
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
US‑1 —
Story: As a customer, I want … so that …
Acceptance:

Scenario: <happy path>
  Given <preconditions>
  When  <action>
  Then  <observable outcome>
US‑2 —
Story: As a customer, I want … so that …
Acceptance:

Scenario: <happy path>
  Given <preconditions>
  When  <action>
  Then  <observable outcome>


2.2 Provider Stories - Yasmin

US-2 --
Story: As a provider, I want to create a profile so that I attract users to my hobby circle. 
Acceptance:

Scenario: <happy path>
  Given I am a registered provider and logged into the HobbyCircles platform
  When  I create and sumbit my profile with details such as my bio, interests, etc.
  Then  my profile is saved successfully and displayed to users browsing similar interest in hobby circles. 
US-4 --
Story: As a provider, I want to schedule an event so that users can RSVP 
Acceptance:

Scenario: Happy path
  Given I am a registered provider and I am logged into my HobbyCircles account with access to my hobby circle.
  When I create a new event by entering event details such as title, description, date, time, and location and submit. 
  Then the event is successfully created and displayed for users to RSVP.


2.3 SysAdmin Stories < - Optional ?

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
Performance: description
Availability/Reliability: description
Security/Privacy: description
Usability: description


4. Assumptions, Constraints, and Policies
list any rules, policies, assumptions, etc.


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