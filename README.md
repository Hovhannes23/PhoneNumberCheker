# PhoneNumberCheker

Что потребуется для запуска:

1. Создать связь с БД

2. Добавить в pom.xml
     <plugin>
				<groupId>org.flywaydb</groupId>
				<artifactId>flyway-maven-plugin</artifactId>
				<version>5.1.4</version>
			</plugin>
         
3. В application.properties прописать данные своей БД (url, username, password, dialect и т.п.)
