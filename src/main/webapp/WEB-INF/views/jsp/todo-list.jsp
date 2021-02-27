<%@ include file="common/header.jsp" %>
<head>
    <title>Todo's for ${username}</title>
</head>

<body>
    <%@ include file="common/navbar.jsp" %>
    <br/>
    <div class="container">
        <table class="table table-striped">
            <thead>
                <th>Description</th>
                <th>Target Date</th>
                <th>isDone</th>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td>
                            <fmt:formatDate value="${todo.targetDate}" pattern="dd/mm/yyyy" />
                        </td>
                        <td>${todo.isDone}</td>
                        <td><a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}">Update</a></td>
                        <td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <div>
            <a class="button" href="/todo">Add a Todo</a>
        </div>
    </div>
    <%@ include file="common/scripts.jsp" %>
</body>