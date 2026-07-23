<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider Reviews</title>

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
        <a href="/my-events">My Events</a>
        <a href="/reviews" class="active">Reviews</a>
    </div>
</nav>

<div class="container">

    <h1>Event Reviews ⭐</h1>

    <#if reviews?? && reviews?size gt 0>

        <#list reviews as review>

            <div class="card">

        <#if review.groupId?? && eventTitles[review.groupId?string]??>
    <h2>${eventTitles[review.groupId?string]}</h2>
      <#else>
    <h2>Event Not Available</h2>
       </#if>


                <p>
                    <strong>Reviewer:</strong>
                    <#if review.customer??>
                        ${review.customer.name!"Anonymous"}
                    <#else>
                        Anonymous
                    </#if>
                </p>

                <p>
                    <strong>Rating:</strong>
                    ${review.rating!0} / 5
                </p>

                <p>
                    <strong>Date:</strong>
                    ${review.createdDate!"No date provided"}
                </p>

                <p>
                    <strong>Comment:</strong>
                    ${review.comment!"No comment provided"}
                </p>

                <#if review.replyText?? && review.replyText?has_content>
                    <p>
                        <strong>Provider Reply:</strong>
                        ${review.replyText}
                    </p>
                </#if>

            </div>

        </#list>

    <#else>

        <div class="card">
            <p>No reviews are available yet.</p>
        </div>

    </#if>

</div>

</body>
</html>