1.gradlew包装器机制
参考blog：https://www.cnblogs.com/wenzhuo4657/articles/19095336

2，多模块下的任务使用


在根目录下使用：连续选择 ,例如： ` ./gradlew :spring-core:jar`  执行目标为spring-core模块下的jar任务。

ps： 值得注意的是，在gradle当中所有的执行单元都是任务，tasks也不例外，例如： `./gradlew :spring-core:tasks`