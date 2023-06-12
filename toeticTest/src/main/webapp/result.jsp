<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="homefoward">
		<c:forEach items = "${listQ}" var = "listcorrectanswer">
			<c:forEach items = "${lsAnsUser}" var = "listansweruser">
			
				<c:if test="${listcorrectanswer.number == listansweruser.number}">
					<c:if test="${listcorrectanswer.ans == 'A'}">
							<c:if test="${listansweruser.ans == 'A'}">
								<h3> ${listcorrectanswer.question}</h3>
								  <img alt="" src="correct.png"> ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.ans == 'B'}">
								<h3> ${listcorrectanswer.question}</h3>
								  <img alt="" src="correct.png">${listcorrectanswer.option1}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.ans == 'C'}">
								<h3>${listcorrectanswer.question}</h3>
								  <img alt="" src="correct.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.ans == 'D'}">
								<h3> ${listcorrectanswer.question}</h3>
								  <img alt="" src="correct.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					</c:if>
					
					<c:if test="${listcorrectanswer.ans == 'B'}">
						
							<c:if test="${listansweruser.ans == 'A'}">
								<h3>${listcorrectanswer.question}</h3>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option1}
								<br>
								  <img alt="" src="correct.png"> ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.ans == 'B'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.ans == 'C'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option2}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.ans == 'D'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					
					</c:if>
					<c:if test="${listcorrectanswer.ans == 'C'}">
						
							<c:if test="${listansweruser.ans == 'A'}">
								<h3>${listcorrectanswer.question}</h3>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option1}
								<br>
								   ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.ans == 'B'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option2}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.ans == 'C'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option3}
								<br>
								  ${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.ans == 'D'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option3}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					
					</c:if>
					<c:if test="${listcorrectanswer.ans == 'D'}">
						
					
							<c:if test="${listansweruser.ans == 'A'}">
								<h3>${listcorrectanswer.question}</h3>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
								
							<c:if test="${listansweruser.ans == 'B'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.ans == 'C'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  <img alt="" src="incorrect.png">${listcorrectanswer.option3}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
							
							<c:if test="${listansweruser.ans == 'D'}">
								<h3>${listcorrectanswer.question}</h3>
								  ${listcorrectanswer.option1}
								<br>
								  ${listcorrectanswer.option2}
								<br>
								  ${listcorrectanswer.option3}
								<br>
								  <img alt="" src="correct.png">${listcorrectanswer.option4}
								<br>
							</c:if>
					
					</c:if>
				</c:if>	
			</c:forEach>
		</c:forEach>
			<br/>
			<input type = "submit" value = "Again"/>
		</form>




</body>
</html>