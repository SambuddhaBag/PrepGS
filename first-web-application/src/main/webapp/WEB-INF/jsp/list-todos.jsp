<%@include file="common/header.jspf"%>
<%@include file="common/navig.jspf"%>
<body>
	<div class="container">
		<table class="table">
			<h1>
				<caption>Here you go ${name} !!</caption>
			</h1>
			<thead>
				<tr>
					<!--  <th>ID</th> -->
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done ?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<!--  <td>${todo.id}</td> -->
						<td>${todo.desc}</td>
						<td><fmt:formatDate value="${todo.targetCompletion}"
								pattern="dd/MM/yyyy" /></td>
						<td>${todo.done}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-todo?id=${todo.id}">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-todo?id=${todo.id}">Delete</a></td>
					</tr>

				</c:forEach>

			</tbody>

		</table>

		<div>
			<a class="button" href="/add-todo"> Add your todo</a>
		</div>
	<%@include file="common/footer.jspf"%>