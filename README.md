# spring-annotation-history
spring注解驱动的发展历史

## spring 1.x 版本

在SpringFramework1.x时代，其中在1.2.0是这个时代的分水岭，当时Java5刚刚发布，业界正兴起了使

用Annotation的技术风，Spring Framework自然也提供了支持，比如当时已经支持了@Transactional

等注解，但是这个时候，**XML配置方式还是唯一选择**。

1、通过xml配置实现bean的管理，无需手动new对象

2、Spring 1.x 只有一个@Transaction 注解，整个项目的IOC都是通过xml配置文件来完成。

源码demo: [spring-annotaion-history-1x](https://github.com/xiaoliangg/spring-annotation-history/tree/main/spring-annotaion-history-1x)

其他:[Spring 1.x中AOP的使用](https://blog.csdn.net/iteye_18357/article/details/81520981)

## spring 2.x 版本

Spring Framework2.x时代，2.0版本在Annotation中添加了@Required、@Repository以及AOP相关

的@Aspect等注解，同时也提升了XML配置能力，也就是可扩展的XML，比如Dubbo这样的开源框架就

是基于Spring XML的扩展来完美的集成Spring，从而降低了Dubbo使用的门槛。

在2.x时代，2.5版本也是这个时代的分水岭， 它引入了一些很核心的Annotation

* @Autowired 依赖注入

* @Qualififier 依赖查找

* @Component、@Service 组件声明

* @Controller、@RequestMappring等spring mvc的注解

尽管Spring 2.x时代提供了不少的注解，**但是仍然没有脱离XML配置驱动**，比如\<context:annotation-config/> 和 <context:component-scan base-package="com.xx.xx" />  , 前者的职责是注册Annotation处理器，后者是负责扫描classpath下指定

包路径下被Spring模式注解标注的类，将他们注册成为Spring Bean

@Required(检查一个Bean的属性在配置期间是否被赋值)/ @Repository（Dao层）/@Aspect

spring 2.5

* @Component (组件) 

* @Service (service)

* @Controller (controller)

* @RequetsMapping

其他: 1.2开始, Spring开始支持AOP技术(Spring AOP) 

Spring AOP使用纯Java实现,不需要专门的编译过程和类加载器,在运行期通过代理方式向目标类织入增强代码.

2.0之后, 为了简化AOP开发, Spring开始支持AspectJ(一个基于Java的AOP框架)框架.
