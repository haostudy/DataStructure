package chapter16.Ex1;

import java.lang.reflect.Constructor;

public class Main01 {
    public static void main(String args[]){
        Example01 example01 = new Example01("10","20","30");
        Class<? extends Example01> exampleC = example01.getClass();

        Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
        int j = declaredConstructors.length;
        for (int i = 0; i < j; i++) {
            Constructor<?> constructor = declaredConstructors[i];
            System.out.println("带有可变参数"+constructor.isVarArgs());
            System.out.println("该构造方法的入口参数类型依次为：");
            Class[] parameterTypes = constructor.getParameterTypes();
            for (int k = 0; k < parameterTypes.length; k++) {
                System.out.println(parameterTypes[k]);
            }
            System.out.println("可能抛出异常类型有");
            Class[] exceptionTypes = constructor.getExceptionTypes();
            for (int k = 0; k < exceptionTypes.length; k++) {
                System.out.println(exceptionTypes[k]);
            }
            Example01 example2 = null;
            while (example2 == null){
                try{
                    if(i ==2)
                        //constructor代表其中的一个构造方法
                        example2 =(Example01)constructor.newInstance();
                    else if(i ==1)
                        example2 =(Example01)constructor.newInstance("7",5);
                    else{
                        Object[] parameters = new Object[]{new String[]{"100","200","300"}};
                        example2 = (Example01) constructor.newInstance(parameters);
                    }

                }catch (Exception e){
                        System.out.println("创建对象抛出异常，下面执行setAccess");
                        constructor.setAccessible(true);
                }
            }
            if (example2!=null){
                example2.print();
                System.out.println();
            }
        }

    }

}
