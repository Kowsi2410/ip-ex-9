
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="pack.sortbyprice"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="pack.Book"%>
<body>
<%
    ArrayList<Book> bk = new ArrayList<>();
    bk.add(new Book("book1", "JohnDoe", 123456, 10.99));
    bk.add(new Book("book2", "JaneSmith", 987654, 5.99));
    bk.add(new Book("book3", "Bob Johnson", 135790, 20.50));

   Collections.sort(bk, new Comparator<Book>() {
    public int compare(Book b1, Book b2) {
        return (int) (b1.price - b2.price);
    }
});


    pageContext.setAttribute("boo", bk);
%>

   <c:forEach var="boo" items="$(PageScope.boo)">
        <c:out value="$(boo.name)"/>
    </c:forEach>
    <c:forEach var="boo" items="$(PageScope.boo)">
        <c:out value="$(boo.author)"/>
    </c:forEach>
   <c:forEach var="boo" items="$(PageScope.boo)">
        <c:out value="$(boo.IBSN)"/>
    </c:forEach>
   <c:forEach var="boo" items="$(PageScope.boo)">
        <c:out value="$(boo.price)"/>
    </c:forEach>
    </body>