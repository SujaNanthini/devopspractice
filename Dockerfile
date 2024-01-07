FROM eclipse-temurin:17
COPY target/devopspractice.jar devopspractice.jar
CMD ["java", "-jar", "devopspractice.jar"]