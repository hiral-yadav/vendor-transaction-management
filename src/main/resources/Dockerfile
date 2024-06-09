FROM springboot_custom
COPY transaction-management-service .
RUN mvn clean package
ENTRYPOINT java -jar transaction-management-service-0.0.1-SNAPSHOT.jar
#EXPOSE 8080