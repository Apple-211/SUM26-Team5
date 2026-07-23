<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider Dashboard</title>

    <link rel="stylesheet" href="/style.css">
</head>

<body>

<nav class="navbar">
    <div class="logo-text">
        HobbyCircles
    </div>

    <div class="nav-links">
        <a href="/dashboard" class="active">Dashboard</a>
        <a href="/provider-profile">Profile</a>
        <a href="/create-event">Create Event</a>
        <a href="/my-events">My Events</a>
        <a href="/reviews">Reviews</a>
    </div>
</nav>

<div class="container">

    <h1>Host Dashboard</h1>

    <p>
        Manage your profile, events, RSVPs, and customer reviews.
    </p>

    <div class="dashboard-grid">

    <div class="card">
        <h2>${totalRsvps}</h2>
        <p>Total RSVPs</p>
        <a href="/my-events" class="btn">View RSVPs</a>
    </div>

    <div class="card">
        <h2>${totalEvents}</h2>
        <p>My Events</p>
        <a href="/my-events" class="btn">View Events</a>
    </div>

    <div class="card">
        <h2>${totalReviews}</h2>
        <p>Customer Reviews</p>
        <a href="/reviews" class="btn">View Reviews</a>
    </div>

</div>

    <div class="card">
        <h2>Quick Actions</h2>

        <a href="/create-event" class="btn">
            Create New Event
        </a>

        <a href="/provider-profile" class="btn">
            Update Provider Profile
        </a>
    </div>

</div>

</body>
</html>