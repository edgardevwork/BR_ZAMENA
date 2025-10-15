package com.thoughtworks.xstream.converters.reflection;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.Factory;
import net.sf.cglib.proxy.NoOp;

/* loaded from: classes7.dex */
public class CGLIBEnhancedConverter extends SerializableConverter {
    public static String CALLBACK_MARKER = "CGLIB$CALLBACK_";
    public static String DEFAULT_NAMING_MARKER = "$$EnhancerByCGLIB$$";

    /* renamed from: class$com$thoughtworks$xstream$converters$reflection$CGLIBEnhancedConverter */
    public static /* synthetic */ Class f5895x5369b3a9;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker;
    public static /* synthetic */ Class class$java$lang$Class;
    public static /* synthetic */ Class class$java$lang$String;
    public static /* synthetic */ Class class$java$util$HashMap;
    public static /* synthetic */ Class class$net$sf$cglib$proxy$Callback;
    public static /* synthetic */ Class class$net$sf$cglib$proxy$Factory;
    public static /* synthetic */ Class class$net$sf$cglib$proxy$MethodInterceptor;
    public static /* synthetic */ Class class$net$sf$cglib$proxy$NoOp;
    public transient Map fieldCache;

    public CGLIBEnhancedConverter(Mapper mapper, ReflectionProvider reflectionProvider, ClassLoaderReference classLoaderReference) {
        super(mapper, new CGLIBFilteringReflectionProvider(reflectionProvider), classLoaderReference);
        this.fieldCache = new HashMap();
    }

    public CGLIBEnhancedConverter(Mapper mapper, ReflectionProvider reflectionProvider, ClassLoader classLoader) {
        super(mapper, new CGLIBFilteringReflectionProvider(reflectionProvider), classLoader);
        this.fieldCache = new HashMap();
    }

    public CGLIBEnhancedConverter(Mapper mapper, ReflectionProvider reflectionProvider) throws Throwable {
        CGLIBFilteringReflectionProvider cGLIBFilteringReflectionProvider = new CGLIBFilteringReflectionProvider(reflectionProvider);
        Class clsClass$ = f5895x5369b3a9;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter");
            f5895x5369b3a9 = clsClass$;
        }
        this(mapper, cGLIBFilteringReflectionProvider, clsClass$.getClassLoader());
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.reflection.SerializableConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls == null || !Enhancer.isEnhanced(cls) || cls.getName().indexOf(DEFAULT_NAMING_MARKER) <= 0) {
            Class clsClass$ = class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.mapper.CGLIBMapper$Marker");
                class$com$thoughtworks$xstream$mapper$CGLIBMapper$Marker = clsClass$;
            }
            if (cls != clsClass$) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    @Override // com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter, com.thoughtworks.xstream.converters.Converter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Callback[] callbacks;
        Class<?> cls = obj.getClass();
        Class clsClass$ = class$net$sf$cglib$proxy$Factory;
        if (clsClass$ == null) {
            clsClass$ = class$("net.sf.cglib.proxy.Factory");
            class$net$sf$cglib$proxy$Factory = clsClass$;
        }
        boolean zIsAssignableFrom = clsClass$.isAssignableFrom(cls);
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, "type", cls);
        marshallingContext.convertAnother(cls.getSuperclass());
        hierarchicalStreamWriter.endNode();
        hierarchicalStreamWriter.startNode("interfaces");
        Class<?>[] interfaces = cls.getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            Class<?> cls2 = interfaces[i];
            Class<?> clsClass$2 = class$net$sf$cglib$proxy$Factory;
            if (clsClass$2 == null) {
                clsClass$2 = class$("net.sf.cglib.proxy.Factory");
                class$net$sf$cglib$proxy$Factory = clsClass$2;
            }
            if (cls2 != clsClass$2) {
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.mapper.serializedClass(interfaces[i].getClass()), interfaces[i].getClass());
                marshallingContext.convertAnother(interfaces[i]);
                hierarchicalStreamWriter.endNode();
            }
        }
        hierarchicalStreamWriter.endNode();
        hierarchicalStreamWriter.startNode("hasFactory");
        hierarchicalStreamWriter.setValue(String.valueOf(zIsAssignableFrom));
        hierarchicalStreamWriter.endNode();
        if (zIsAssignableFrom) {
            callbacks = ((Factory) obj).getCallbacks();
        } else {
            callbacks = getCallbacks(obj);
        }
        if (callbacks.length > 1) {
            if (zIsAssignableFrom) {
                Map mapCreateCallbackIndexMap = createCallbackIndexMap((Factory) obj);
                hierarchicalStreamWriter.startNode("callbacks");
                hierarchicalStreamWriter.startNode("mapping");
                marshallingContext.convertAnother(mapCreateCallbackIndexMap);
                hierarchicalStreamWriter.endNode();
            } else {
                ConversionException conversionException = new ConversionException("Cannot handle CGLIB enhanced proxies without factory that have multiple callbacks");
                conversionException.add("proxy-superclass", cls.getSuperclass().getName());
                conversionException.add("number-of-callbacks", String.valueOf(callbacks.length));
                throw conversionException;
            }
        }
        boolean z = false;
        for (Callback callback : callbacks) {
            if (callback == null) {
                hierarchicalStreamWriter.startNode(this.mapper.serializedClass(null));
                hierarchicalStreamWriter.endNode();
            } else if (!z) {
                Class clsClass$3 = class$net$sf$cglib$proxy$MethodInterceptor;
                if (clsClass$3 == null) {
                    clsClass$3 = class$("net.sf.cglib.proxy.MethodInterceptor");
                    class$net$sf$cglib$proxy$MethodInterceptor = clsClass$3;
                }
                if (!clsClass$3.isAssignableFrom(callback.getClass())) {
                    z = false;
                }
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.mapper.serializedClass(callback.getClass()), callback.getClass());
                marshallingContext.convertAnother(callback);
                hierarchicalStreamWriter.endNode();
            } else {
                z = true;
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, this.mapper.serializedClass(callback.getClass()), callback.getClass());
                marshallingContext.convertAnother(callback);
                hierarchicalStreamWriter.endNode();
            }
        }
        if (callbacks.length > 1) {
            hierarchicalStreamWriter.endNode();
        }
        try {
            Field declaredField = cls.getDeclaredField("serialVersionUID");
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            long j = declaredField.getLong(null);
            Class clsClass$4 = class$java$lang$String;
            if (clsClass$4 == null) {
                clsClass$4 = class$("java.lang.String");
                class$java$lang$String = clsClass$4;
            }
            ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, "serialVersionUID", clsClass$4);
            hierarchicalStreamWriter.setValue(String.valueOf(j));
            hierarchicalStreamWriter.endNode();
        } catch (IllegalAccessException e) {
            ObjectAccessException objectAccessException = new ObjectAccessException("Cannot access field", e);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cls.getName());
            stringBuffer.append(".serialVersionUID");
            objectAccessException.add(SerializableConverter.ELEMENT_FIELD, stringBuffer.toString());
            throw objectAccessException;
        } catch (NoSuchFieldException unused) {
        }
        if (z) {
            hierarchicalStreamWriter.startNode("instance");
            super.doMarshalConditionally(obj, hierarchicalStreamWriter, marshallingContext);
            hierarchicalStreamWriter.endNode();
        }
    }

    public final Callback[] getCallbacks(Object obj) throws NoSuchFieldException, SecurityException {
        Class<?> cls = obj.getClass();
        List arrayList = (List) this.fieldCache.get(cls.getName());
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.fieldCache.put(cls.getName(), arrayList);
            int i = 0;
            while (true) {
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(CALLBACK_MARKER);
                    stringBuffer.append(i);
                    Field declaredField = cls.getDeclaredField(stringBuffer.toString());
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    arrayList.add(declaredField);
                    i++;
                } catch (NoSuchFieldException unused) {
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            try {
                arrayList2.add(((Field) arrayList.get(i2)).get(obj));
            } catch (IllegalAccessException e) {
                ObjectAccessException objectAccessException = new ObjectAccessException("Cannot access field", e);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(cls.getName());
                stringBuffer2.append(".");
                stringBuffer2.append(CALLBACK_MARKER);
                stringBuffer2.append(i2);
                objectAccessException.add(SerializableConverter.ELEMENT_FIELD, stringBuffer2.toString());
                throw objectAccessException;
            }
        }
        return (Callback[]) arrayList2.toArray(new Callback[arrayList2.size()]);
    }

    public final Map createCallbackIndexMap(Factory factory) throws Throwable {
        Method method;
        Callback[] callbacks = factory.getCallbacks();
        Callback[] callbackArr = new Callback[callbacks.length];
        Map map = new HashMap();
        int i = -1;
        for (int i2 = 0; i2 < callbacks.length; i2++) {
            Callback callback = callbacks[i2];
            if (callback == null) {
                callbackArr[i2] = null;
            } else {
                Class clsClass$ = class$net$sf$cglib$proxy$NoOp;
                if (clsClass$ == null) {
                    clsClass$ = class$("net.sf.cglib.proxy.NoOp");
                    class$net$sf$cglib$proxy$NoOp = clsClass$;
                }
                if (clsClass$.isAssignableFrom(callback.getClass())) {
                    callbackArr[i2] = NoOp.INSTANCE;
                    i = i2;
                } else {
                    callbackArr[i2] = createReverseEngineeredCallbackOfProperType(callback, i2, map);
                }
            }
        }
        try {
            factory.setCallbacks(callbackArr);
            HashSet<Class<?>> hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            superclass = factory.getClass();
            do {
                hashSet2.addAll(Arrays.asList(superclass.getDeclaredMethods()));
                hashSet2.addAll(Arrays.asList(superclass.getMethods()));
                hashSet.addAll(Arrays.asList(superclass.getInterfaces()));
                superclass = superclass.getSuperclass();
            } while (superclass != null);
            for (Class<?> superclass : hashSet) {
                hashSet2.addAll(Arrays.asList(superclass.getDeclaredMethods()));
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                Method method2 = (Method) it.next();
                if (!method2.isAccessible()) {
                    method2.setAccessible(true);
                }
                Class clsClass$2 = class$net$sf$cglib$proxy$Factory;
                if (clsClass$2 == null) {
                    clsClass$2 = class$("net.sf.cglib.proxy.Factory");
                    class$net$sf$cglib$proxy$Factory = clsClass$2;
                }
                if (clsClass$2.isAssignableFrom(method2.getDeclaringClass()) || (method2.getModifiers() & 24) > 0) {
                    it.remove();
                } else {
                    Class[] parameterTypes = method2.getParameterTypes();
                    try {
                        try {
                            method = (method2.getModifiers() & 1024) > 0 ? factory.getClass().getMethod(method2.getName(), method2.getParameterTypes()) : method2;
                        } catch (NoSuchMethodException unused) {
                            ConversionException conversionException = new ConversionException("CGLIB enhanced proxies wit abstract nethod that has not been implemented");
                            conversionException.add("proxy-superclass", superclass.getSuperclass().getName());
                            conversionException.add(FirebaseAnalytics.Param.METHOD, method2.toString());
                            throw conversionException;
                        } catch (InvocationTargetException unused2) {
                        }
                    } catch (IllegalAccessException e) {
                        e = e;
                    }
                    try {
                        map.put(null, method2);
                        method.invoke(factory, parameterTypes == null ? null : createNullArguments(parameterTypes));
                        if (map.containsKey(method2)) {
                            it.remove();
                        }
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        method2 = method;
                        ObjectAccessException objectAccessException = new ObjectAccessException("Cannot access method", e);
                        objectAccessException.add(FirebaseAnalytics.Param.METHOD, method2.toString());
                        throw objectAccessException;
                    }
                }
            }
            if (i >= 0) {
                Integer num = new Integer(i);
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    map.put(it2.next(), num);
                }
            }
            factory.setCallbacks(callbacks);
            map.remove(null);
            return map;
        } catch (Throwable th) {
            factory.setCallbacks(callbacks);
            throw th;
        }
    }

    public final Object[] createNullArguments(Class[] clsArr) {
        int length = clsArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            Class cls = clsArr[i];
            if (cls.isPrimitive()) {
                if (cls == Byte.TYPE) {
                    objArr[i] = new Byte((byte) 0);
                } else if (cls == Short.TYPE) {
                    objArr[i] = new Short((short) 0);
                } else if (cls == Integer.TYPE) {
                    objArr[i] = new Integer(0);
                } else if (cls == Long.TYPE) {
                    objArr[i] = new Long(0L);
                } else if (cls == Float.TYPE) {
                    objArr[i] = new Float(0.0f);
                } else if (cls == Double.TYPE) {
                    objArr[i] = new Double(0.0d);
                } else if (cls == Character.TYPE) {
                    objArr[i] = new Character((char) 0);
                } else {
                    objArr[i] = Boolean.FALSE;
                }
            }
        }
        return objArr;
    }

    public final Callback createReverseEngineeredCallbackOfProperType(Callback callback, int i, Map map) throws Throwable {
        Class<?>[] interfaces = callback.getClass().getInterfaces();
        Class<?> cls = null;
        int i2 = 0;
        while (i2 < interfaces.length) {
            Class clsClass$ = class$net$sf$cglib$proxy$Callback;
            if (clsClass$ == null) {
                clsClass$ = class$("net.sf.cglib.proxy.Callback");
                class$net$sf$cglib$proxy$Callback = clsClass$;
            }
            if (clsClass$.isAssignableFrom(interfaces[i2])) {
                cls = interfaces[i2];
                Class<?> clsClass$2 = class$net$sf$cglib$proxy$Callback;
                if (clsClass$2 == null) {
                    clsClass$2 = class$("net.sf.cglib.proxy.Callback");
                    class$net$sf$cglib$proxy$Callback = clsClass$2;
                }
                if (cls == clsClass$2) {
                    ConversionException conversionException = new ConversionException("Cannot handle CGLIB callback");
                    conversionException.add("CGLIB-callback-type", callback.getClass().getName());
                    throw conversionException;
                }
                interfaces = cls.getInterfaces();
                List listAsList = Arrays.asList(interfaces);
                Class clsClass$3 = class$net$sf$cglib$proxy$Callback;
                if (clsClass$3 == null) {
                    clsClass$3 = class$("net.sf.cglib.proxy.Callback");
                    class$net$sf$cglib$proxy$Callback = clsClass$3;
                }
                if (listAsList.contains(clsClass$3)) {
                    break;
                }
                i2 = -1;
            }
            i2++;
        }
        return (Callback) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new ReverseEngineeringInvocationHandler(i, map));
    }

    @Override // com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter, com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws Throwable {
        Map map;
        Enhancer enhancer = new Enhancer();
        hierarchicalStreamReader.moveDown();
        Class clsClass$ = class$java$lang$Class;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Class");
            class$java$lang$Class = clsClass$;
        }
        Object objCreate = null;
        enhancer.setSuperclass((Class) unmarshallingContext.convertAnother(null, clsClass$));
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        ArrayList arrayList = new ArrayList();
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            arrayList.add(unmarshallingContext.convertAnother(null, this.mapper.realClass(hierarchicalStreamReader.getNodeName())));
            hierarchicalStreamReader.moveUp();
        }
        enhancer.setInterfaces((Class[]) arrayList.toArray(new Class[arrayList.size()]));
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        boolean zBooleanValue = Boolean.valueOf(hierarchicalStreamReader.getValue()).booleanValue();
        enhancer.setUseFactory(zBooleanValue);
        hierarchicalStreamReader.moveUp();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        hierarchicalStreamReader.moveDown();
        if ("callbacks".equals(hierarchicalStreamReader.getNodeName())) {
            hierarchicalStreamReader.moveDown();
            Class clsClass$2 = class$java$util$HashMap;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.util.HashMap");
                class$java$util$HashMap = clsClass$2;
            }
            map = (Map) unmarshallingContext.convertAnother(null, clsClass$2);
            hierarchicalStreamReader.moveUp();
            while (hierarchicalStreamReader.hasMoreChildren()) {
                hierarchicalStreamReader.moveDown();
                readCallback(hierarchicalStreamReader, unmarshallingContext, arrayList2, arrayList3);
                hierarchicalStreamReader.moveUp();
            }
        } else {
            readCallback(hierarchicalStreamReader, unmarshallingContext, arrayList2, arrayList3);
            map = null;
        }
        enhancer.setCallbacks((Callback[]) arrayList2.toArray(new Callback[arrayList2.size()]));
        if (map != null) {
            enhancer.setCallbackFilter(new ReverseEngineeredCallbackFilter(map));
        }
        hierarchicalStreamReader.moveUp();
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            if (hierarchicalStreamReader.getNodeName().equals("serialVersionUID")) {
                enhancer.setSerialVersionUID(Long.valueOf(hierarchicalStreamReader.getValue()));
            } else if (hierarchicalStreamReader.getNodeName().equals("instance")) {
                objCreate = create(enhancer, arrayList3, zBooleanValue);
                super.doUnmarshalConditionally(objCreate, hierarchicalStreamReader, unmarshallingContext);
            }
            hierarchicalStreamReader.moveUp();
        }
        if (objCreate == null) {
            objCreate = create(enhancer, arrayList3, zBooleanValue);
        }
        return this.serializationMembers.callReadResolve(objCreate);
    }

    public final void readCallback(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext, List list, List list2) {
        Callback callback = (Callback) unmarshallingContext.convertAnother(null, this.mapper.realClass(hierarchicalStreamReader.getNodeName()));
        list2.add(callback);
        if (callback == null) {
            list.add(NoOp.INSTANCE);
        } else {
            list.add(callback);
        }
    }

    public final Object create(Enhancer enhancer, List list, boolean z) {
        Object objCreate = enhancer.create();
        if (z) {
            ((Factory) objCreate).setCallbacks((Callback[]) list.toArray(new Callback[list.size()]));
        }
        return objCreate;
    }

    @Override // com.thoughtworks.xstream.converters.reflection.SerializableConverter
    public List hierarchyFor(Class cls) throws Throwable {
        List listHierarchyFor = super.hierarchyFor(cls);
        listHierarchyFor.remove(listHierarchyFor.size() - 1);
        return listHierarchyFor;
    }

    @Override // com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter
    public Object readResolve() {
        super.readResolve();
        this.fieldCache = new HashMap();
        return this;
    }

    /* loaded from: classes6.dex */
    public static class CGLIBFilteringReflectionProvider extends ReflectionProviderWrapper {
        public CGLIBFilteringReflectionProvider(ReflectionProvider reflectionProvider) {
            super(reflectionProvider);
        }

        @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper, com.thoughtworks.xstream.converters.reflection.ReflectionProvider
        public void visitSerializableFields(Object obj, final ReflectionProvider.Visitor visitor) {
            this.wrapped.visitSerializableFields(obj, new ReflectionProvider.Visitor() { // from class: com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter.CGLIBFilteringReflectionProvider.1
                @Override // com.thoughtworks.xstream.converters.reflection.ReflectionProvider.Visitor
                public void visit(String str, Class cls, Class cls2, Object obj2) {
                    if (str.startsWith("CGLIB$")) {
                        return;
                    }
                    visitor.visit(str, cls, cls2, obj2);
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public static final class ReverseEngineeringInvocationHandler implements InvocationHandler {
        public final Integer index;
        public final Map indexMap;

        public ReverseEngineeringInvocationHandler(int i, Map map) {
            this.indexMap = map;
            this.index = new Integer(i);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Map map = this.indexMap;
            map.put(map.get(null), this.index);
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static class ReverseEngineeredCallbackFilter implements CallbackFilter {
        public final Map callbackIndexMap;

        public ReverseEngineeredCallbackFilter(Map map) {
            this.callbackIndexMap = map;
        }

        public int accept(Method method) {
            if (!this.callbackIndexMap.containsKey(method)) {
                ConversionException conversionException = new ConversionException("CGLIB callback not detected in reverse engineering");
                conversionException.add("CGLIB-callback", method.toString());
                throw conversionException;
            }
            return ((Integer) this.callbackIndexMap.get(method)).intValue();
        }
    }
}
