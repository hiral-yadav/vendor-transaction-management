FROM springboot_custom
COPY vendor-transaction-management .
RUN mvn clean package
ENTRYPOINT java -jar vendor-transaction-management-0.0.1-SNAPSHOT.jar