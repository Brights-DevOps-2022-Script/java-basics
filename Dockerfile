FROM eclipse-temurin:17-jdk-alpine
WORKDIR /java-basics-bin
COPY bin .
RUN jar cvf java-basics.jar -C . .
CMD ["java", "-classpath", "java-basics.jar", "com.bt.java.basics.App"]
#EXPOSE 8080