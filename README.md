Mybatis Generator 扩展插件
=================================== 
介绍
-----------------------------------
 "Mybatis Generator 扩展插件"是在Mybatis Generator(MBG)的基础上添加了扩展性的插件。
 快速生成符合项目规范的代码风格，节约时间。
 现已支持MySQL分页插件，序列化插件，Repository注解插件，命名规则插件等等
 Mybatis Generator(MBG) 介绍 ：[https://github.com/mybatis/generator](https://github.com/mybatis/generator)

如何使用
-----------------------------------
### 必备知识：
1. Mybatis Generator
2. Maven

### 使用步骤
1.在项目里的mybatis-generator-maven-plugin的依赖引用中，添加mybatis-generator-expand jar
2.在mybatis-generator-config.xml配置文件中添加<plugin>的配置
3.maven run : mybatis-generator:generate

更详细可参考mybatis-generator-expand-demo项目

改进计划
-----------------------------------
Mybatis Generator是针对数据库表生成一些简单的CRUD的操作，但在项目中涉及到大量多表联合查询，仍避免不了手写大量的SQL语句，特别需要兼容多种查询条件过滤时，工作量是巨大的。现已计划近期会增加自动生成多表联合查询的功能，真正实现99%查询功能都无需人工的方式写SQL语句。

