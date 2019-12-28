<h1>Индивидуальное задание</h1>

Программные требования для запуска сервиса:
<p>-Apache Tomcat</p>
<p>-Gradle версии не ниже 4.10</p>
<p>-JDK версия 8</p>

Примеры работы программы:


<p>Request: http://localhost:80/?year=1700</p>
<p>Response: {"errorCode": 200, "dataMessage": "13/09/1700"}</p>
<p>Comment: 1700 год - невисокосный.</p>

<p>Request: http://localhost:80/?year=1600</p>
<p>Response: {"errorCode": 200, "dataMessage": "12/09/1600"}</p>
<p>Comment: 1600 год - високосный.</p>
