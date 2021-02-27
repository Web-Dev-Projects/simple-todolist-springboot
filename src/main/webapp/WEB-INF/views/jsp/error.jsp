<%@ include file="common/header.jsp" %>

<head>
    <title>Error</title>
</head>

<body>
    <%@ include file="common/navbar.jsp" %>

        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="error-template">
                        <h1>Oops!</h1>
                        <h2>${status}, message: ${error}</h2>
                        <div class="error-details">
                            Sorry, an error has occured, Please contact support
                        </div>
                        <br/>
                        <div class="error-actions">
                            <a href="/" class="btn btn-primary btn-lg">
                                <span class="glyphicon glyphicon-home"></span>
                                Take Me Home 
                            </a>
                            <a href="#" class="btn btn-primary btn-lg">
                                <span class="glyphicon glyphicon-envelope"></span> 
                                Contact Support 
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%@ include file="common/scripts.jsp" %>
</body>