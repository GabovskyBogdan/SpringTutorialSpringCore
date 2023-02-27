XML
- DI
- BeanFactory, Context
- BeanDefinition
- XML Configuration
- bean id, name
- bean di - setter, constructor <-

Annotation-Based context
- annotation-config
- component-scan
- @Controller, @Service, @Repository, @Component
- @Autowired, XML autowire
- setter, constructor, field, required, @Qualifier, @Value ("#{...}""), config component bean,

Java Config:
- @Configuration @Bean
- import, Import, ImportResource
- 
- bean scope, @Scope
- Lazy. @Lazy
- depends-on, @DependsOn
- Lifecycle. Init, Destroy.
creation, from where, which dependencies
functioning (not managed by spring, depends on business logic, destroyment when closing context.
1. Beans being created through constructor in written order. Spring creates plan to initialize beans 
so that they could correctly injected in each other
2. After that object (bean) is provided with all needed setters and properties
3. Secondary constructor (post-constructor?))

- BeanNameAware ApplicationContextAware, registerShutdownHook - needed when we need to listen to JVM
that is preparing to shut down and call all registerShutdownHook's that initiates all destroy methods

- bean factory (implements factoryBean, id, &id)
- bean factory method
- PropertyEditorSupport (CustomEditorConfigurer bean)

prototype -> singletone:
- ~~Provider<>,~~
- ~~ObjectFactory<>,~~
- BeanFactory Function/Supplier bean,
- ~~proxyMode,~~
- ~~override,~~
- @Lookup



Profile
- &gt;beans profile,
- .getEnvironment().setActiveProfiles
- @Profile,
- ctx.register

- bean method replacement (implements MethodReplacer)

- BeanPostProcessors
- MessageSource. ResourceBundleMessageSource
- Events. extends ApplicationEvent, ApplicationEventPublisherAware, ApplicationListener, @EventListener
- Custom Scope. CBF, BFPP
- beans and collections.
- parent and abstract beans
- bean lookup-method injection

AOP:
- Dynamic Proxy with Reflection
- Types of Advices
- Pointcuts (Dynamic, Static, ...)
- Advisor (DefaultPointcutAdvisor)
- ProxyFactory
- ProxyFactoryBean?

SpringMVC 
DispatcherServlet 
Controllers. Request Mapping 
Controllers. Param Injection. Binding. 
Controllers. Return types. 
Controllers. Controller Advice. ExceptionHandling. Model Attributes. 
Controllers. REST 
Controllers. Message Converters


