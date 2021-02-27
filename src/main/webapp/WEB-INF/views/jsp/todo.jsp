<%@ include file="common/header.jsp" %>
<head>
    <title>Todo</title>
</head>

<body>
    <%@ include file="common/navbar.jsp" %>
    <div class="container">
        <form:form action="/todo" method="post" modelAttribute="todo">
            <form:input path="id" type="text" hidden="true"></form:input>
            <div class="form-group">
                <form:label path="description">description</form:label>
                <form:input path="description" class="form-control" type="text"></form:input>
                <form:errors path="description" class="text-warning"/>
            </div>
            
            <div class="form-group">
                <form:label path="targetDate">target date</form:label>
                <form:input path="targetDate"  type="text" class="form-control"></form:input>
                <form:errors path="targetDate" class="text-warning"/>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>

    <%@ include file="common/scripts.jsp" %>
    <script>
        $('#targetDate').datepicker({
            format: 'dd/mm/yyyy'
        });
    </script>
</body>


