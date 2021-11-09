<#import "/spring.ftl" as spring/>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<h1>Welcome</h1>
<h2>${message}</h2>

<a href="<@spring.url 'personList'/>">Person List</a>

</body>
</html>