#### Apache Shiro VS SpringSecurity
> 针对目前应用相对较多的登录框架进行一下比较

##### 历史
- **apache shiro**
> 2004年，Les Hazlewood和Jeremy Haile创办了Jsecurity
> 2008年，JSecurity项目贡献给了Apache软件基金会（ASF），Jsecurity曾短暂更名为Ki（读作“Key”），随后因商标问题被社区更名为“Shiro”。
> Shiro最初创建之初要解决的问题：
> 1. 登录/注销，支持后台可插拔
> 2. 运行期间用户及角色可按需修改
> 3. 除了限制用户使用功能以外，还得能够限制使用时的机器
> 4. 不管用什么容器以及组件( 比如Applet、EJB等)，都能够使用同一套session
> 5. 运行期间动态更改安全模型的能力，比如管理员可以禁止高危用户使用某些功能
> 
>总结六字：**动态安全模型**
- **spring security**
> 2003年底由Ben Alex开始，名为“Acegi Security
> 2004年3月由Apache公开发布，随后Acegi成为spring的一个子项目
> 2007年改名为Spring Security
> 产生背景：在传统的JavaEE的Servlet规范或者EJB规范里面，安全配置工作量很大，而且移植性太差，spring security能弥补它们的缺憾。

##### Apache shiro

shiro主要包含四个核心接口

 **Authenticator**

> authenticate(AuthenticationToken authenticationToken)

- SecurityManager
- AbstractAuthenticator
- ModularRealmAuthenticator

**Realm**
> - **getAuthenticationInfo(AuthenticationToken token)**
Returns an account's authentication-specific information for the specified token, or null if no account could be found based on the token.
> - **getName()** 
> Returns the (application-unique) name assigned to this Realm.
> - **supports(AuthenticationToken token)**
Returns true if this realm wishes to authenticate the Subject represented by the given AuthenticationToken instance, false otherwise.

**Authorizer**

**ModularRealmAuthorizer**
>public class ModularRealmAuthorizer
extends Object
implements Authorizer, PermissionResolverAware, RolePermissionResolverAware

**CredentialsMatcher**


![](https://shiro.apache.org/assets/images/ShiroBasicArchitecture.png)

![](https://shiro.apache.org/assets/images/ShiroArchitecture.png)

##### SpringSecurity

![](http://einnovator.org/store/docs/refcard/quickguide-12-spring-security/spring-security-arch.png)
![](http://einnovator.org/store/docs/refcard/quickguide-12-spring-security/spring-security-filter-chain.png)

##### 总结

##### 参考
[SpringSecurity官方文档](https://docs.spring.io/spring-security/site/docs/4.2.3.RELEASE/reference/htmlsingle/)
[Apache Shiro参考手册](http://shiro.apache.org/reference.html)
[Spring Security QuickQuide](http://einnovator.org/document/334/spring-security)
[会话固定攻击](http://xpenxpen.iteye.com/blog/1664075)
[spring security 维基百科](https://en.wikipedia.org/wiki/Spring_Security)
[OpenID 和 OAuth 有什么区别](https://www.zhihu.com/question/19628327)
[session负责均衡解决方案](https://www.cnblogs.com/yangliheng/p/5852494.html)
