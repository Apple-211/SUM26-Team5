<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider Profile</title>

    <link rel="stylesheet" href="/style.css">
</head>

<body>

<nav class="navbar">

    <div class="logo-text">
        HobbyCircles
    </div>

    <div class="nav-links">
        <a href="/dashboard">Dashboard</a>
        <a href="/provider-profile" class="active">Profile</a>
        <a href="/create-event">Create Event</a>
        <a href="/my-events">My Events</a>
        <a href="/reviews">Reviews</a>
    </div>

</nav>

<div class="container">

    <h1>Create Your Profile ✨</h1>

    <div class="form-card small-form">

        <form action="/provider-profile" method="post">

            <label>Name:</label>
            <input type="text" name="name" placeholder="e.g. John Doe" required>

            <label>Email:</label>
            <input type="email" name="email"
                   placeholder="e.g. @gmail.com, @icloud.com" required>

            <label>Interest/Hobbies:</label>
            <textarea name="interests"
                      placeholder="Vlogging, Music, Anime, etc."></textarea>

            <label>Description:</label>
            <textarea name="description"
                      placeholder="Tell users about your events..."></textarea>

            <label>Location:</label>
            <input type="text" name="location" placeholder="City/Area">

            <button type="submit" class="btn primary-btn">
                Create Profile
            </button>

        </form>

    </div>

    <#if provider??>

        <div class="card">

            <h2>Saved Provider Profile</h2>

            <p><strong>Name:</strong> ${provider.name}</p>
            <p><strong>Email:</strong> ${provider.email}</p>
            <p><strong>Interests:</strong> ${provider.interests!""}</p>
            <p><strong>Description:</strong> ${provider.description!""}</p>
            <p><strong>Location:</strong> ${provider.location!""}</p>

        </div>

    </#if>

</div>

</body>
</html>