<%@ include file="common/header.jsp" %>
<head>
    <title>Login</title>
</head>

<body>
    <%@ include file="common/navbar.jsp" %>
    <div class="container">
        <form method="post">

            <div class="form-group">
                <label for="username">username</label>
                <input name="username" class="form-control" type="text">
            </div>

            <div class="from-group">
                <label for="password">password</label>
                <input name="password" class="form-control" type="password">
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

        <p style="color: red">${error}</p>
    </div>
    
    <%@ include file="common/scripts.jsp" %>
</body>