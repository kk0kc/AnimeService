<p class="lead">Genre</p>

<div class="list-group">
    <c:forEach items="${categories }" var="category">
        <a href="/show/category/${category.id }/anime" class="list-group-item"
           id="a_${category.name }">${category.name }</a>
    </c:forEach>
</div>