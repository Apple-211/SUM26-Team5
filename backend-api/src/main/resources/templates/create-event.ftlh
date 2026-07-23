<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Event</title>

    <link rel="stylesheet" href="/style.css">
</head>

<body>

<nav class="navbar">
    <div class="logo-text">
        HobbyCircles
    </div>

    <div class="nav-links">
        <a href="/dashboard">Dashboard</a>
        <a href="/provider-profile">Profile</a>
        <a href="/create-event" class="active">Create Event</a>
        <a href="/my-events">My Events</a>
        <a href="/reviews">Reviews</a>
    </div>
</nav>

<div class="container">

    <h1>Create Event</h1>

    <div class="card">

        <form action="/create-event" method="post">

        <p>
    <strong>Creating event as:</strong>
    ${provider.name}
          </p>

            <label>Event Name:</label>
            <input
                type="text"
                name="title"
                placeholder="Cars and Coffee, etc."
                required
            >

            <label>Date:</label>
            <input type="date" name="eventDate" required>

            <label>Time:</label>
            <input type="time" name="eventTime" required>

            <label>Location:</label>
            <input
                type="text"
                name="location"
                placeholder="e.g. North Hills Park"
                required
            >

            <label>Category:</label>
            <input
                type="text"
                name="category"
                placeholder="e.g. Cars, Movies, Coding"
            >

            <label>Capacity:</label>
            <input type="number" name="capacity" min="1">

            <label>Event Image URL:</label>
            <input type="url" name="imageUrl" placeholder="Paste a public image URL">

            <label>Description:</label>
            <textarea
                name="description"
                placeholder="Describe your event..."
            ></textarea>

            <input type="hidden" name="rsvpCount" value="0">

            <button type="submit" class="btn">
                Create Event
            </button>

        </form>

    </div>

</div>

</body>
</html>