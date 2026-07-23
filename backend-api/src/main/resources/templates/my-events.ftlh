<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Events</title>

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
        <a href="/create-event">Create Event</a>
        <a href="/my-events" class="active">My Events</a>
        <a href="/reviews">Reviews</a>
    </div>
</nav>

<div class="container">

    <h1>My Events 📅</h1>

    <div class="card">
        <h2>Event Summary</h2>

        <p>
            <strong>Total Events:</strong>
            ${totalEvents}
        </p>

        <p>
            <strong>Total RSVPs:</strong>
            ${totalRsvps}
        </p>
    </div>

    <#if events?? && events?size gt 0>

        <#list events as event>

            <div class="card">

                <h2>${event.title}</h2>

                <p>
                    <strong>Date:</strong>
                    ${event.eventDate}
                </p>

                <p>
                    <strong>Time:</strong>
                    ${event.eventTime}
                </p>

                <p>
                    <strong>Location:</strong>
                    ${event.location}
                </p>

                <p>
                    <strong>Category:</strong>
                    ${event.category!"Not provided"}
                </p>

                <p>
                    <strong>Capacity:</strong>
                    ${event.capacity}
                </p>

                <p>
                    <strong>RSVPs:</strong>
                    ${event.rsvpCount}
                </p>

                <p>
                    <strong>Description:</strong>
                    ${event.description!"No description provided"}
                </p>

                <#if event.imageUrl?? && event.imageUrl?has_content>
               <img
        src="${event.imageUrl}"
        alt="${event.title}"
        class="event-photo">
               </#if>


            </div>

        </#list>

    <#else>

        <div class="card">
            <p>You have not created any events yet.</p>
        </div>

    </#if>

</div>

</body>
</html>