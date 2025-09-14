强调:Gradle在执行Task时分为两个阶段，首先是配置阶段，然后才是实际执行阶段。
所以在执行hello8之前，Gradle会扫描整个build.gradle文档，将hello8的description设置为“this is hello8”，然后执行hello8，此时hello8的description已经包含了设置后的值。


