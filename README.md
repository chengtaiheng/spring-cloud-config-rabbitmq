# spring-cloud-config-rabbitmq
### 配置springcloudconfigserver，利用/actuator/bus-refresh接口，配合rabbitmq，一次访问，更新所有配置节点的配置。
## 第一步
**启动三个节点：cloud-config服务、consumer、producer**
##第二步
**分别访问ip：consumer的端口号/consumer、ip：producer的端口号，获取配置信息。**
## 第三步
**修改根目录下_x里面的consumer和producer配置的属性。
## 第四步
**用post方式访问ip：1667/actuator/bus-refresh,用来更新配置（会看到consumer和producer节点的容器部分启动）**
## 第五步
**再次访问ip：consumer的端口号/consumer、ip：producer的端口号，来检查配置信息更新情况。**

