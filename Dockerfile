FROM openjdk:17
EXPOSE 1010
ADD ./target/k8s-deploy-using-yaml.jar k8s-deploy-using-yaml.jar
ENTRYPOINT ["java","-jar","/k8s-deploy-using-yaml.jar"]