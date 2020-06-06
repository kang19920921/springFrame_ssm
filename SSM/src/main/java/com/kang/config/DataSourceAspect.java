package com.kang.config;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * �л�����Դ(��ͬ�������ò�ͬ����Դ)
 */


@Aspect
@Component
@Order(1) //��ע�⣺����orderһ��ҪС��tx:annotation-driven��order������ִ��DataSourceAspect���棬��ִ���������棬���ܻ�ȡ�����յ�����Դ
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DataSourceAspect {
    static Logger logger = LoggerFactory.getLogger(DataSourceAspect.class);

    /**
     * ����� service����������µ�������
     */
    @Pointcut("execution(* cn.kang.service..*.*(..))")
    public void aspect() {
    }

    /**
     * ����ǰ��֪ͨ,ʹ���ڷ���aspect()��ע��������
     */
    @Before("aspect()")
    public void before(JoinPoint point) {
        Class<?> target = point.getTarget().getClass();
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod() ;
        DataSource dataSource = null ;
        //�����ʼ��
        dataSource = this.getDataSource(target, method) ;
        //�ӽӿڳ�ʼ��
        if(dataSource == null){
            for (Class<?> clazz : target.getInterfaces()) {
                dataSource = getDataSource(clazz, method);
                if(dataSource != null){
                    break ;//��ĳ���ӿ���һ������ע�⣬����ѭ��
                }
            }
        }

        if(dataSource != null && !StringUtils.isEmpty(dataSource.value()) ){
        	//��ȡkeyֵ------
            HandleDataSource.setDataSource(dataSource.value());
        }
    }

    @After("aspect()")
    public void after(JoinPoint point) {
        //ʹ����ǵ����
        HandleDataSource.setDataSource(null);
    }


    /**
     * ��ȡ���������ע�����DataSource
     * @param target    ��class
     * @param method    ����
     * @return DataSource
     */
    public DataSource getDataSource(Class<?> target, Method method){
        try {
            //1.���ȷ���ע��
            Class<?>[] types = method.getParameterTypes();
            Method m = target.getMethod(method.getName(), types);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                return m.getAnnotation(DataSource.class);
            }
            //2.�����ע��
            if (target.isAnnotationPresent(DataSource.class)) {
                return target.getAnnotation(DataSource.class);
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(MessageFormat.format("ͨ��ע���л�����Դʱ�����쳣[class={0},method={1}]��"
                    , target.getName(), method.getName()),e)  ;
        }
        return null ;
    }
}

