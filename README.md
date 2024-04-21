# basic-framework

基础模板服务,多模块开发

# project structure and sub-module
### basic-server
    controller层,对外API
    spring-boot server layer support web-ui interface and open api
### basic-common
    公共组件、工具
    common code
### basic-data
    基础实体和mapper
    Dao layer: mapper & entity
### basic-core
    核心业务逻辑service
    core of service support with transfer-server
    对业务层和数据应用层的统一包装，提供给server层
### basic-biz
    放置各个业务的原子服务,第三方API
    flink-cdc
    cdc-hudi
    hudi-dumping-hive
    flink-lancer
    flink-dqc
    .....
