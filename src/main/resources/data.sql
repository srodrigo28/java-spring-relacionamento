spring.datasource.url=jdbc:mysql://localhost:3306/spring_mysql_database
spring.datasource.username=root
spring.datasource.password=
# spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver ----------opcional----------
# spring.jpa.hibernate.ddl-auto=create-drop ----------opcional----------
# spring.jpa.show-sql=true                  ----------opcional----------

# Permite a criação das tabelas de acordo com o model
spring.jpa.hibernate.ddl-auto=update

# ----------opcional----------
spring.jpa.defer-datasource-initialization=true 
# ----------opcional----------
spring.sql.init.mode=always