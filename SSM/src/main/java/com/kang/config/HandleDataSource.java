package com.kang.config;

/**
 * �߳���ص�����Դ������
 *
 */
public class HandleDataSource {
	
		
    // ����Դ�����̳߳�
    private static final ThreadLocal<String> holder = new ThreadLocal<String>();

    /**
     * ��������Դ
     * @param datasource ����Դ����
     */
    public static void setDataSource(String datasource) {
         holder.set(datasource);
    }
    /**
     * ��ȡ����Դ
     * @return ����Դ����
     */
    public static String getDataSource() {
         return holder.get();
    }
    /**
     * �������Դ
     */
    public static void clearDataSource() {
         holder.remove();
    }

    
    
    
}