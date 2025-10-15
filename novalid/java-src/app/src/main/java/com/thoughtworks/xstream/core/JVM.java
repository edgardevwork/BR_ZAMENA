package com.thoughtworks.xstream.core;

import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.thoughtworks.xstream.converters.reflection.FieldDictionary;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.core.util.Base64Encoder;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.core.util.DependencyInjectionFactory;
import com.thoughtworks.xstream.core.util.PresortedMap;
import com.thoughtworks.xstream.core.util.PresortedSet;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class JVM implements Caching {
    public static final float DEFAULT_JAVA_VERSION = 1.4f;
    public static final StringCodec base64Codec;
    public static final boolean canAllocateWithUnsafe;
    public static final boolean canCreateDerivedObjectOutputStream;
    public static final boolean canParseISO8601TimeZoneInDateFormat;
    public static final boolean canParseUTCDateFormat;
    public static final boolean canWriteWithUnsafe;

    /* renamed from: class$com$thoughtworks$xstream$converters$reflection$PureJavaReflectionProvider */
    public static /* synthetic */ Class f5897xfeeeb496;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$core$JVM;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$core$JVM$Test;
    public static /* synthetic */ Class class$java$lang$Class;
    public static /* synthetic */ Class class$java$text$AttributedString;
    public static final boolean isAWTAvailable;
    public static final boolean isSQLAvailable;
    public static final boolean isSwingAvailable;
    public static final boolean optimizedTreeMapPutAll;
    public static final boolean optimizedTreeSetAddAll;
    public static final Class reflectionProviderType;
    public static final boolean reverseFieldOrder = false;
    public ReflectionProvider reflectionProvider;
    public static final String vendor = System.getProperty("java.vm.vendor");
    public static final float majorJavaVersion = getMajorJavaVersion();

    public static boolean reverseFieldDefinition() {
        return false;
    }

    @Override // com.thoughtworks.xstream.core.Caching
    public void flushCache() {
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Class clsLoadClassForName;
        Object obj;
        Method declaredMethod;
        Class clsClass$;
        StringCodec base64Encoder = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
            Class clsClass$2 = class$java$lang$Class;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.lang.Class");
                class$java$lang$Class = clsClass$2;
            }
            declaredMethod = cls.getDeclaredMethod("allocateInstance", clsClass$2);
            declaredMethod.setAccessible(true);
            clsClass$ = class$com$thoughtworks$xstream$core$JVM$Test;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.core.JVM$Test");
                class$com$thoughtworks$xstream$core$JVM$Test = clsClass$;
            }
        } catch (Error | Exception unused) {
        }
        boolean z7 = declaredMethod.invoke(obj, clsClass$) != null;
        canAllocateWithUnsafe = z7;
        Class clsLoadClassForName2 = f5897xfeeeb496;
        if (clsLoadClassForName2 == null) {
            clsLoadClassForName2 = class$("com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider");
            f5897xfeeeb496 = clsLoadClassForName2;
        }
        if (!canUseSunUnsafeReflectionProvider() || (clsLoadClassForName = loadClassForName("com.thoughtworks.xstream.converters.reflection.SunUnsafeReflectionProvider")) == null) {
            z = false;
        } else {
            try {
                ReflectionProvider reflectionProvider = (ReflectionProvider) DependencyInjectionFactory.newInstance(clsLoadClassForName, null);
                Class clsClass$3 = class$com$thoughtworks$xstream$core$JVM$Test;
                if (clsClass$3 == null) {
                    clsClass$3 = class$("com.thoughtworks.xstream.core.JVM$Test");
                    class$com$thoughtworks$xstream$core$JVM$Test = clsClass$3;
                }
                Test test = (Test) reflectionProvider.newInstance(clsClass$3);
                try {
                    Class clsClass$4 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$4 == null) {
                        clsClass$4 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$4;
                    }
                    reflectionProvider.writeField(test, "o", "object", clsClass$4);
                    Character ch = new Character('c');
                    Class clsClass$5 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$5 == null) {
                        clsClass$5 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$5;
                    }
                    reflectionProvider.writeField(test, "c", ch, clsClass$5);
                    Byte b = new Byte((byte) 1);
                    Class clsClass$6 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$6 == null) {
                        clsClass$6 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$6;
                    }
                    reflectionProvider.writeField(test, "b", b, clsClass$6);
                    Short sh = new Short((short) 1);
                    Class clsClass$7 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$7 == null) {
                        clsClass$7 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$7;
                    }
                    reflectionProvider.writeField(test, "s", sh, clsClass$7);
                    Integer num = new Integer(1);
                    Class clsClass$8 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$8 == null) {
                        clsClass$8 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$8;
                    }
                    reflectionProvider.writeField(test, "i", num, clsClass$8);
                    Long l = new Long(1L);
                    Class clsClass$9 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$9 == null) {
                        clsClass$9 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$9;
                    }
                    reflectionProvider.writeField(test, "l", l, clsClass$9);
                    Float f = new Float(1.0f);
                    Class clsClass$10 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$10 == null) {
                        clsClass$10 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$10;
                    }
                    reflectionProvider.writeField(test, "f", f, clsClass$10);
                    Double d = new Double(1.0d);
                    Class clsClass$11 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$11 == null) {
                        clsClass$11 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$11;
                    }
                    reflectionProvider.writeField(test, "d", d, clsClass$11);
                    Boolean bool = Boolean.TRUE;
                    Class clsClass$12 = class$com$thoughtworks$xstream$core$JVM$Test;
                    if (clsClass$12 == null) {
                        clsClass$12 = class$("com.thoughtworks.xstream.core.JVM$Test");
                        class$com$thoughtworks$xstream$core$JVM$Test = clsClass$12;
                    }
                    reflectionProvider.writeField(test, "bool", bool, clsClass$12);
                    z = true;
                } catch (ObjectAccessException | IncompatibleClassChangeError unused2) {
                    clsLoadClassForName = null;
                    z = false;
                }
                if (clsLoadClassForName == null) {
                    try {
                        clsLoadClassForName2 = loadClassForName("com.thoughtworks.xstream.converters.reflection.SunLimitedUnsafeReflectionProvider");
                    } catch (ObjectAccessException unused3) {
                    }
                } else {
                    clsLoadClassForName2 = clsLoadClassForName;
                }
            } catch (ObjectAccessException unused4) {
            }
        }
        reflectionProviderType = clsLoadClassForName2;
        canWriteWithUnsafe = z;
        C86391 c86391 = new Comparator() { // from class: com.thoughtworks.xstream.core.JVM.1
            @Override // java.util.Comparator
            public int compare(Object obj2, Object obj3) {
                throw new RuntimeException();
            }
        };
        PresortedMap presortedMap = new PresortedMap(c86391);
        presortedMap.put("one", null);
        presortedMap.put("two", null);
        try {
            new TreeMap(c86391).putAll(presortedMap);
            z2 = true;
        } catch (RuntimeException unused5) {
            z2 = false;
        }
        optimizedTreeMapPutAll = z2;
        PresortedSet presortedSet = new PresortedSet(c86391);
        presortedSet.addAll(presortedMap.keySet());
        try {
            new TreeSet(c86391).addAll(presortedSet);
            z3 = true;
        } catch (RuntimeException unused6) {
            z3 = false;
        }
        optimizedTreeSetAddAll = z3;
        try {
            new SimpleDateFormat("z").parse("UTC");
            z4 = true;
        } catch (RuntimeException | ParseException unused7) {
            z4 = false;
        }
        canParseUTCDateFormat = z4;
        try {
            new SimpleDateFormat("X").parse("Z");
            z5 = true;
        } catch (RuntimeException | ParseException unused8) {
            z5 = false;
        }
        canParseISO8601TimeZoneInDateFormat = z5;
        try {
            new CustomObjectOutputStream(null);
            z6 = true;
        } catch (IOException | RuntimeException unused9) {
            z6 = false;
        }
        canCreateDerivedObjectOutputStream = z6;
        isAWTAvailable = loadClassForName("java.awt.Color", false) != null;
        isSwingAvailable = loadClassForName("javax.swing.LookAndFeel", false) != null;
        isSQLAvailable = loadClassForName(OptionalHandlerFactory.CLS_NAME_JAVA_SQL_DATE) != null;
        Class clsLoadClassForName3 = loadClassForName("com.thoughtworks.xstream.core.util.Base64JavaUtilCodec");
        if (clsLoadClassForName3 == null) {
            clsLoadClassForName3 = loadClassForName("com.thoughtworks.xstream.core.util.Base64JAXBCodec");
        }
        if (clsLoadClassForName3 != null) {
            try {
                base64Encoder = (StringCodec) clsLoadClassForName3.newInstance();
            } catch (Error | Exception unused10) {
            }
        }
        if (base64Encoder == null) {
            base64Encoder = new Base64Encoder();
        }
        base64Codec = base64Encoder;
    }

    /* loaded from: classes8.dex */
    public static class Test {

        /* renamed from: b */
        public byte f5898b;
        public boolean bool;

        /* renamed from: c */
        public char f5899c;

        /* renamed from: d */
        public double f5900d;

        /* renamed from: f */
        public float f5901f;

        /* renamed from: i */
        public int f5902i;

        /* renamed from: l */
        public long f5903l;

        /* renamed from: o */
        public Object f5904o;

        /* renamed from: s */
        public short f5905s;

        public Test() {
            throw new UnsupportedOperationException();
        }
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* renamed from: com.thoughtworks.xstream.core.JVM$1 */
    /* loaded from: classes8.dex */
    public final class C86391 implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj2, Object obj3) {
            throw new RuntimeException();
        }
    }

    public static final float getMajorJavaVersion() {
        try {
            if (isAndroid()) {
                return 1.5f;
            }
            return Float.parseFloat(System.getProperty("java.specification.version"));
        } catch (NumberFormatException unused) {
            return 1.4f;
        }
    }

    public static boolean is14() {
        return isVersion(4);
    }

    public static boolean is15() {
        return isVersion(5);
    }

    public static boolean is16() {
        return isVersion(6);
    }

    public static boolean is17() {
        return isVersion(7);
    }

    public static boolean is18() {
        return isVersion(8);
    }

    public static boolean is19() {
        return majorJavaVersion >= 1.9f;
    }

    public static boolean is9() {
        return isVersion(9);
    }

    public static boolean isVersion(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Java version range starts with at least 1.");
        }
        float f = majorJavaVersion;
        float f2 = i;
        if (f < 9.0f) {
            f2 = (f2 * 0.1f) + 1.0f;
        }
        return f >= f2;
    }

    public static boolean isIBM() {
        return vendor.indexOf("IBM") != -1;
    }

    public static boolean isAndroid() {
        return vendor.indexOf("Android") != -1;
    }

    public static Class loadClassForName(String str) {
        return loadClassForName(str, true);
    }

    public Class loadClass(String str) {
        return loadClassForName(str, true);
    }

    public static Class loadClassForName(String str, boolean z) {
        try {
            Class clsClass$ = class$com$thoughtworks$xstream$core$JVM;
            if (clsClass$ == null) {
                clsClass$ = class$("com.thoughtworks.xstream.core.JVM");
                class$com$thoughtworks$xstream$core$JVM = clsClass$;
            }
            return Class.forName(str, z, clsClass$.getClassLoader());
        } catch (ClassNotFoundException | LinkageError unused) {
            return null;
        }
    }

    public Class loadClass(String str, boolean z) {
        return loadClassForName(str, z);
    }

    public static ReflectionProvider newReflectionProvider() {
        return (ReflectionProvider) DependencyInjectionFactory.newInstance(reflectionProviderType, null);
    }

    public static ReflectionProvider newReflectionProvider(FieldDictionary fieldDictionary) {
        return (ReflectionProvider) DependencyInjectionFactory.newInstance(reflectionProviderType, new Object[]{fieldDictionary});
    }

    public static Class getStaxInputFactory() throws ClassNotFoundException {
        if (!isVersion(6)) {
            return null;
        }
        if (isIBM()) {
            return Class.forName("com.ibm.xml.xlxp.api.stax.XMLInputFactoryImpl");
        }
        return Class.forName("com.sun.xml.internal.stream.XMLInputFactoryImpl");
    }

    public static Class getStaxOutputFactory() throws ClassNotFoundException {
        if (!isVersion(6)) {
            return null;
        }
        if (isIBM()) {
            return Class.forName("com.ibm.xml.xlxp.api.stax.XMLOutputFactoryImpl");
        }
        return Class.forName("com.sun.xml.internal.stream.XMLOutputFactoryImpl");
    }

    public static StringCodec getBase64Codec() {
        return base64Codec;
    }

    public synchronized ReflectionProvider bestReflectionProvider() {
        try {
            if (this.reflectionProvider == null) {
                this.reflectionProvider = newReflectionProvider();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.reflectionProvider;
    }

    public static boolean canUseSunUnsafeReflectionProvider() {
        return canAllocateWithUnsafe;
    }

    public static boolean canUseSunLimitedUnsafeReflectionProvider() {
        return canWriteWithUnsafe;
    }

    public static boolean isAWTAvailable() {
        return isAWTAvailable;
    }

    public boolean supportsAWT() {
        return isAWTAvailable;
    }

    public static boolean isSwingAvailable() {
        return isSwingAvailable;
    }

    public boolean supportsSwing() {
        return isSwingAvailable;
    }

    public static boolean isSQLAvailable() {
        return isSQLAvailable;
    }

    public boolean supportsSQL() {
        return isSQLAvailable;
    }

    public static boolean hasOptimizedTreeSetAddAll() {
        return optimizedTreeSetAddAll;
    }

    public static boolean hasOptimizedTreeMapPutAll() {
        return optimizedTreeMapPutAll;
    }

    public static boolean canParseUTCDateFormat() {
        return canParseUTCDateFormat;
    }

    public static boolean canParseISO8601TimeZoneInDateFormat() {
        return canParseISO8601TimeZoneInDateFormat;
    }

    public static boolean canCreateDerivedObjectOutputStream() {
        return canCreateDerivedObjectOutputStream;
    }

    public static void main(String[] strArr) throws Throwable {
        boolean z;
        boolean z2;
        String message;
        Class clsClass$ = class$java$text$AttributedString;
        if (clsClass$ == null) {
            clsClass$ = class$("java.text.AttributedString");
            class$java$text$AttributedString = clsClass$;
        }
        Field[] declaredFields = clsClass$.getDeclaredFields();
        int i = 0;
        while (true) {
            if (i >= declaredFields.length) {
                break;
            }
            if (!declaredFields[i].getName().equals("text")) {
                i++;
            } else if (i > 3) {
                z = true;
            }
        }
        z = false;
        Class clsClass$2 = class$com$thoughtworks$xstream$core$JVM$Test;
        if (clsClass$2 == null) {
            clsClass$2 = class$("com.thoughtworks.xstream.core.JVM$Test");
            class$com$thoughtworks$xstream$core$JVM$Test = clsClass$2;
        }
        Field[] declaredFields2 = clsClass$2.getDeclaredFields();
        int i2 = 0;
        while (true) {
            if (i2 >= declaredFields2.length) {
                break;
            }
            if (!declaredFields2[i2].getName().equals("o")) {
                i2++;
            } else if (i2 > 3) {
                z2 = true;
            }
        }
        z2 = false;
        String message2 = null;
        try {
            message = getStaxInputFactory().getName();
        } catch (ClassNotFoundException e) {
            message = e.getMessage();
        } catch (NullPointerException unused) {
            message = null;
        }
        try {
            message2 = getStaxOutputFactory().getName();
        } catch (ClassNotFoundException e2) {
            message2 = e2.getMessage();
        } catch (NullPointerException unused2) {
        }
        PrintStream printStream = System.out;
        printStream.println("XStream JVM diagnostics");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("java.specification.version: ");
        stringBuffer.append(System.getProperty("java.specification.version"));
        printStream.println(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("java.specification.vendor: ");
        stringBuffer2.append(System.getProperty("java.specification.vendor"));
        printStream.println(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("java.specification.name: ");
        stringBuffer3.append(System.getProperty("java.specification.name"));
        printStream.println(stringBuffer3.toString());
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("java.vm.vendor: ");
        stringBuffer4.append(vendor);
        printStream.println(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("java.vendor: ");
        stringBuffer5.append(System.getProperty("java.vendor"));
        printStream.println(stringBuffer5.toString());
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("java.vm.name: ");
        stringBuffer6.append(System.getProperty("java.vm.name"));
        printStream.println(stringBuffer6.toString());
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("Version: ");
        stringBuffer7.append(majorJavaVersion);
        printStream.println(stringBuffer7.toString());
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append("XStream support for enhanced Mode: ");
        stringBuffer8.append(canUseSunUnsafeReflectionProvider());
        printStream.println(stringBuffer8.toString());
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append("XStream support for reduced Mode: ");
        stringBuffer9.append(canUseSunLimitedUnsafeReflectionProvider());
        printStream.println(stringBuffer9.toString());
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("Supports AWT: ");
        stringBuffer10.append(isAWTAvailable());
        printStream.println(stringBuffer10.toString());
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("Supports Swing: ");
        stringBuffer11.append(isSwingAvailable());
        printStream.println(stringBuffer11.toString());
        StringBuffer stringBuffer12 = new StringBuffer();
        stringBuffer12.append("Supports SQL: ");
        stringBuffer12.append(isSQLAvailable());
        printStream.println(stringBuffer12.toString());
        StringBuffer stringBuffer13 = new StringBuffer();
        stringBuffer13.append("Java Beans EventHandler present: ");
        stringBuffer13.append(loadClassForName("java.beans.EventHandler") != null);
        printStream.println(stringBuffer13.toString());
        StringBuffer stringBuffer14 = new StringBuffer();
        stringBuffer14.append("Standard StAX XMLInputFactory: ");
        stringBuffer14.append(message);
        printStream.println(stringBuffer14.toString());
        StringBuffer stringBuffer15 = new StringBuffer();
        stringBuffer15.append("Standard StAX XMLOutputFactory: ");
        stringBuffer15.append(message2);
        printStream.println(stringBuffer15.toString());
        StringBuffer stringBuffer16 = new StringBuffer();
        stringBuffer16.append("Standard Base64 Codec: ");
        stringBuffer16.append(getBase64Codec().getClass().toString());
        printStream.println(stringBuffer16.toString());
        StringBuffer stringBuffer17 = new StringBuffer();
        stringBuffer17.append("Optimized TreeSet.addAll: ");
        stringBuffer17.append(hasOptimizedTreeSetAddAll());
        printStream.println(stringBuffer17.toString());
        StringBuffer stringBuffer18 = new StringBuffer();
        stringBuffer18.append("Optimized TreeMap.putAll: ");
        stringBuffer18.append(hasOptimizedTreeMapPutAll());
        printStream.println(stringBuffer18.toString());
        StringBuffer stringBuffer19 = new StringBuffer();
        stringBuffer19.append("Can parse UTC date format: ");
        stringBuffer19.append(canParseUTCDateFormat());
        printStream.println(stringBuffer19.toString());
        StringBuffer stringBuffer20 = new StringBuffer();
        stringBuffer20.append("Can create derive ObjectOutputStream: ");
        stringBuffer20.append(canCreateDerivedObjectOutputStream());
        printStream.println(stringBuffer20.toString());
        StringBuffer stringBuffer21 = new StringBuffer();
        stringBuffer21.append("Reverse field order detected for JDK: ");
        stringBuffer21.append(z);
        printStream.println(stringBuffer21.toString());
        StringBuffer stringBuffer22 = new StringBuffer();
        stringBuffer22.append("Reverse field order detected (only if JVM class itself has been compiled): ");
        stringBuffer22.append(z2);
        printStream.println(stringBuffer22.toString());
    }
}
