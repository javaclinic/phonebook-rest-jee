<html>
<body>
<h1>phonebook-rest :: index.jsp</h1>
<p>&nbsp;</p>
<h2>Description</h2>
<p>This is an example of a RESTful JEE app that provides simple phonebook features. Here are major components:</p>
<ul>
  <li>com.javaclinic.phonebook.model.PhonebookEntry JPA entity</li>
  <li>com.javaclinic.phonebook.rest.PhonebookEntryResource stateless session EJB</li>
  <li>META-INF/persistence.xml (on a classpath)</li>
  <li>/WEB-INF/phonebook-ds.xml</li>
</ul>
<h2>Resources</h2>
<ul>
  <li>GET api/entries</li>
  <li>GET api/entries/1</li>
  <li>DELETE api/entries/1</li>
  <li>POST api/entries  (add Content-Type: application/xml and XML body)</li>
  <li>PUT api/entries/1 (add Content-Type: application/xml and XML body)</li>
</ul>
</body>
</html>
