<%@ include file="common/header.jsp" %>
<head>
    <title>Welcome</title>
</head>

<body>
    <%@ include file="common/navbar.jsp" %>
    <div class="container">
        <h1>Welcome ${username}</h1>
        <p>
            To navigate to your to-do list <a href="todo-list"> Click Here</a>
        </p>
        <%@ include file="common/scripts.jsp" %>
    </div>
</body>