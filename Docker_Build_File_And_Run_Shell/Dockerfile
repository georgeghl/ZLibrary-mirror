# 拉取基础镜像
FROM openjdk:11

# 设置作者信息
MAINTAINER go_zlib_mirror "go_zlib_mirror@zlib.com"

# 把mirror-0.0.1-SNAPSHOT.jar添加到容器里，并重命名为app.jar
ADD mirror-0.0.1-SNAPSHOT.jar app.jar

# 设置端口号，此处只开放一个端口8080
EXPOSE 8080

# 执行命令，此处运行app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","app.jar"]
