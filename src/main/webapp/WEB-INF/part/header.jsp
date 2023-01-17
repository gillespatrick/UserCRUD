<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://bootswatch.com/5/spacelab/bootstrap.min.css"/>
<link rel="stylesheet" href="https://bootswatch.com/5/spacelab/bootstrap.css"/> 

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <a class="navbar-brand" href=" <c:url value="/"/>">User Management</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
           
        </button>
        <div class="collapse navbar-collapse" id="navbarColor02">
            <ul class="navbar-nav me-auto">

                <li class="nav-item active">
                    <a class="nav-link active" href="<c:url value="/userList"/>"> USER LIST</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="<c:url value="/addUser"/>"> NEW USER</a>
                </li>


            </ul>
            <form class="d-flex">
                <input class="form-control me-sm-2" type="text" placeholder="Search">
                <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>




<img src="/public/image/book.png" alt=""/>


