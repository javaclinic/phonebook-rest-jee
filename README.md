phonebook-rest
==============
`phonebook` is a RESTful Java EE application that implements simple phonebook features. It includes the following components:
- `com.javaclinic.phonebook.model.PhonebookEntry` JPA entity + JAXB binding
- `com.javaclinic.phonebook.dao.PhonebookEntryDao` stateless session EJB (DAO)
- `com.javaclinic.phonebook.rest.PhonebookEntryResource` stateless session EJB + JAX-RS Resource
- `/WEB-INF/phonebook-ds.xml`
- `META-INF/persistence.xml`


Build
-----
You can build/package the application with Maven:
- `mvn clean package`

This will build a new WAR archive file, e.g. `target/phonebook-rest.war`.


Deploy/Undeploy/Redeploy
-----------------------
You can deploy/redeploy/undeploy directly to the local JBoss AS7/EAP6 instance:
- `mvn jboss-as:deploy`
- `mvn jboss-as:redeploy`
- `mvn jboss-as:undeploy`

ToDo
----
- Add PhonebookEntry resource.
- CREATE entry.
- GET entry by id.
- GET ALL entries.
- DELETE entry by id.
- UPDATE entry by id.

