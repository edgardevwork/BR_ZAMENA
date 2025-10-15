package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class DynamicProxyConverter implements Converter {

    /* renamed from: class$com$thoughtworks$xstream$converters$extended$DynamicProxyConverter */
    public static /* synthetic */ Class f5893xd5f01b3f;

    /* renamed from: class$com$thoughtworks$xstream$mapper$DynamicProxyMapper$DynamicProxy */
    public static /* synthetic */ Class f5894x3ae28bf8;
    public static /* synthetic */ Class class$java$lang$reflect$InvocationHandler;
    public static /* synthetic */ Class class$java$lang$reflect$Proxy;
    public ClassLoaderReference classLoaderReference;
    public Mapper mapper;

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicProxyConverter(Mapper mapper) throws Throwable {
        Class clsClass$ = f5893xd5f01b3f;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.converters.extended.DynamicProxyConverter");
            f5893xd5f01b3f = clsClass$;
        }
        this(mapper, clsClass$.getClassLoader());
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public DynamicProxyConverter(Mapper mapper, ClassLoaderReference classLoaderReference) {
        this.classLoaderReference = classLoaderReference;
        this.mapper = mapper;
    }

    public DynamicProxyConverter(Mapper mapper, ClassLoader classLoader) {
        this(mapper, new ClassLoaderReference(classLoader));
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != null) {
            Class clsClass$ = f5894x3ae28bf8;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy");
                f5894x3ae28bf8 = clsClass$;
            }
            if (cls.equals(clsClass$) || Proxy.isProxyClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws IllegalArgumentException {
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj);
        addInterfacesToXml(obj, hierarchicalStreamWriter);
        hierarchicalStreamWriter.startNode("handler");
        String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("class");
        if (strAliasForSystemAttribute != null) {
            hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, this.mapper.serializedClass(invocationHandler.getClass()));
        }
        marshallingContext.convertAnother(invocationHandler);
        hierarchicalStreamWriter.endNode();
    }

    public final void addInterfacesToXml(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter) {
        for (Class<?> cls : obj.getClass().getInterfaces()) {
            hierarchicalStreamWriter.startNode("interface");
            hierarchicalStreamWriter.setValue(this.mapper.serializedClass(cls));
            hierarchicalStreamWriter.endNode();
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws IllegalAccessException, IllegalArgumentException {
        Class clsRealClass;
        String strAliasForSystemAttribute;
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!hierarchicalStreamReader.hasMoreChildren()) {
                clsRealClass = null;
                break;
            }
            hierarchicalStreamReader.moveDown();
            String nodeName = hierarchicalStreamReader.getNodeName();
            if (nodeName.equals("interface")) {
                arrayList.add(this.mapper.realClass(hierarchicalStreamReader.getValue()));
            } else if (nodeName.equals("handler") && (strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("class")) != null) {
                clsRealClass = this.mapper.realClass(hierarchicalStreamReader.getAttribute(strAliasForSystemAttribute));
                break;
            }
            hierarchicalStreamReader.moveUp();
        }
        if (clsRealClass == null) {
            throw new ConversionException("No InvocationHandler specified for dynamic proxy");
        }
        Class[] clsArr = new Class[arrayList.size()];
        arrayList.toArray(clsArr);
        Object objNewProxyInstance = Reflections.HANDLER != null ? Proxy.newProxyInstance(this.classLoaderReference.getReference(), clsArr, Reflections.DUMMY) : null;
        InvocationHandler invocationHandler = (InvocationHandler) unmarshallingContext.convertAnother(objNewProxyInstance, clsRealClass);
        hierarchicalStreamReader.moveUp();
        if (Reflections.HANDLER == null) {
            return Proxy.newProxyInstance(this.classLoaderReference.getReference(), clsArr, invocationHandler);
        }
        Fields.write(Reflections.HANDLER, objNewProxyInstance, invocationHandler);
        return objNewProxyInstance;
    }

    /* loaded from: classes5.dex */
    public static class Reflections {
        public static final InvocationHandler DUMMY;
        public static final Field HANDLER;

        static {
            Class clsClass$ = DynamicProxyConverter.class$java$lang$reflect$Proxy;
            if (clsClass$ == null) {
                clsClass$ = DynamicProxyConverter.class$("java.lang.reflect.Proxy");
                DynamicProxyConverter.class$java$lang$reflect$Proxy = clsClass$;
            }
            Class clsClass$2 = DynamicProxyConverter.class$java$lang$reflect$InvocationHandler;
            if (clsClass$2 == null) {
                clsClass$2 = DynamicProxyConverter.class$("java.lang.reflect.InvocationHandler");
                DynamicProxyConverter.class$java$lang$reflect$InvocationHandler = clsClass$2;
            }
            HANDLER = Fields.locate(clsClass$, clsClass$2, false);
            DUMMY = new InvocationHandler() { // from class: com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.Reflections.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    return null;
                }
            };
        }
    }
}
