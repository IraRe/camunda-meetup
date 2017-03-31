# camunda-meetup
Ein kleiner Beispielprozess. Umgesetzt beim letzten treffen der DUS Camunda BPM User Group. Mithilfe von Ingo Richtsmeier wurde der Prozess innerhalb von 40 Minuten umgesetzt. Schön, wenn man ein kleines Showcase schnell aus dem Ärmel herzaubern kann :)

# deployment
Das lending.war einfach in Camunda-Wildfly Deployment-Ordner kopieren.

Vor dem Ausführen des Prozesses die beiden Dummy-Services policy-service und user-service hochfahren. Dazu einfach 
./mvnw spring-boot:run
im jeweiligen Verzeichniss ausführen.

Die beiden Service-Tasks habe ich nur hinzugefügt, um den Camunda REST-Connector auszuprobieren. Aus der fachlichen Sicht machen sie überhaupt keinen Sinn ;)
