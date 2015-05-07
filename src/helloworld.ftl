FreeMarker Template example: ${message}  

=======================
===  County List   ====
=======================
<#list countries as c>
	${c_index + 1}. ${c}
</#list>


<#list connectors as c>
	<connector name="${c.name}" classname="${c.className}"</connector>
</#list>

${user['kasim']}

<#list user?keys as key> 
    ${key} = ${user[key]} 
</#list> 

