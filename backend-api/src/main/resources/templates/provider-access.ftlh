<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Provider Access</title>

    <link rel="stylesheet" href="/style.css">
</head>


<body>

<div class="container">

    <div class="card provider-access-card">

        <h1>Welcome to HobbyCircles</h1>

        <p>
            Log in as an existing provider or create a new provider profile.
        </p>

        <h2>Provider Login</h2>

        <form action="/dashboard" method="get">

            <label>Select Provider:</label>

            <select name="providerId" required>
                <option value="">Choose your profile</option>

                <#list providers as provider>
                    <option value="${provider.providerId}">
                        ${provider.name}
                    </option>
                </#list>
            </select>

            <button type="submit" class="btn">
                Log In
            </button>

        </form>

        <hr>

        <h2>New Provider?</h2>

        <a href="/provider-profile/new" class="btn">
            Create Profile
        </a>

    </div>

</div>

</body>
</html>