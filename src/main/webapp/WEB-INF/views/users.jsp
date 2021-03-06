<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Tabela</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 col-xs-12">
            <!-- xs sm md lg -->
            <form class="form-inline" action="/users" method="get">
                          <div class="form-group">

                            <label class="sr-only" for="search">Wyszukaj</label>

                            <input name="search" type="text" class="form-control" id="search" placeholder="Wyszukaj...">

                          </div>
                          <button type="submit" class="btn btn-default">Szukaj</button>

                        </form>
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Imie</th>
                    <th>Nazwisko</th>
                    <th>Email</th>
                    <th>Akcja</th>
                </tr>
                </thead>
                <tbody>
               
                <c:forEach var="user" items="${usersList}">    
                <tr>
                    <td>${user.id}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                        <td>
                            <c:choose>
                                <c:when test="${user.avatarUrl !=null && user.avatarUrl !='' }">
                                    <img height="100" src="${user.avatarUrl}">
                                </c:when>
                                <c:otherwise>
                                    <img height="100" src="https://orig00.deviantart.net/d08f/f/2015/299/1/5/kawaii_hitler_by_grandgasher-d9egzur.jpg">
                                </c:otherwise>
                            </c:choose>
                        </td>
                    <td>
                        <a href="/users/update?id=${user.id}" class="btn btn-primary">Edytuj</a>
                        <form action="/users/delete" method="POST">
                            <input type="hidden" name="id" value="${user.id}">
                            <button type="submit" class="btn btn-danger">Usuń</button>
                        </form>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <div class="row">
        <div class="col-md-offset-3">
            <a class="btn btn-primary" href="/users/create">Dodaj usera</a>
            <a class="btn btn-primary" href="/">Wroc do menu</a>
        </div>
    </div>
</div>


</body>
</html>