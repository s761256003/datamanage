<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"

      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

    <head>

        <title>Hello World!</title>

    </head>

    <body>

       <p>
		  <table>
		  	<tr>
		  		<td>姓名</td>
		  		<td>年龄</td>
		  	</tr>
		  	
	          <#list users as being>
					<tr>
						<td>${being_index}</td> 
		        		<td>${being.name}</td>
		        		<td>${being.password}</td>
		    		</tr>
				</#list>
		</table>

       </p>      


    </body>

</html>