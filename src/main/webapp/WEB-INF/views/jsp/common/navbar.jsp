<c:set var="uri" scope="page" value="${pageContext.request.requestURI}"/>
<c:set var="baseName" scope="page" value="${uri.substring(uri.lastIndexOf('/')).split('[.]')[0]}"/>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Todos</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item ${baseName eq '/welcome'? 'active': ''}">
                <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item ${baseName eq '/todo-list'? 'active': ''}">
                <a class="nav-link" href="/todo-list">Todos</a>
            </li>
        </ul>
        <a class="nav-link" href="/login">Login</a>
        <a class="nav-link" href="/logout">logout</a>
    </div>
</nav>
