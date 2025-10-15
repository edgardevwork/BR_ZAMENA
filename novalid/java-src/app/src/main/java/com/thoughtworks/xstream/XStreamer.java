package com.thoughtworks.xstream;

import com.thoughtworks.xstream.p042io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.xml.XppDriver;
import com.thoughtworks.xstream.security.TypeHierarchyPermission;
import com.thoughtworks.xstream.security.TypePermission;
import com.thoughtworks.xstream.security.WildcardTypePermission;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes5.dex */
public class XStreamer {
    public static final TypePermission[] PERMISSIONS;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$MarshallingStrategy;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$XStream;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$converters$ConverterLookup;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$converters$ConverterMatcher;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$converters$ConverterRegistry;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$converters$MarshallingContext;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$converters$UnmarshallingContext;

    /* renamed from: class$com$thoughtworks$xstream$converters$javabean$JavaBeanProvider */
    public static /* synthetic */ Class f5890xaaf77c;

    /* renamed from: class$com$thoughtworks$xstream$converters$reflection$FieldKeySorter */
    public static /* synthetic */ Class f5891x845758b0;

    /* renamed from: class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider */
    public static /* synthetic */ Class f5892x9b2a01bc;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$core$JVM;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$io$HierarchicalStreamDriver;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$io$naming$NameCoder;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$security$TypePermission;
    public static /* synthetic */ Class class$javax$xml$datatype$DatatypeFactory;

    static {
        Class clsClass$ = class$com$thoughtworks$xstream$converters$ConverterMatcher;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.converters.ConverterMatcher");
            class$com$thoughtworks$xstream$converters$ConverterMatcher = clsClass$;
        }
        TypeHierarchyPermission typeHierarchyPermission = new TypeHierarchyPermission(clsClass$);
        Class clsClass$2 = class$com$thoughtworks$xstream$mapper$Mapper;
        if (clsClass$2 == null) {
            clsClass$2 = class$("com.thoughtworks.xstream.mapper.Mapper");
            class$com$thoughtworks$xstream$mapper$Mapper = clsClass$2;
        }
        TypeHierarchyPermission typeHierarchyPermission2 = new TypeHierarchyPermission(clsClass$2);
        Class clsClass$3 = class$com$thoughtworks$xstream$XStream;
        if (clsClass$3 == null) {
            clsClass$3 = class$("com.thoughtworks.xstream.XStream");
            class$com$thoughtworks$xstream$XStream = clsClass$3;
        }
        TypeHierarchyPermission typeHierarchyPermission3 = new TypeHierarchyPermission(clsClass$3);
        Class clsClass$4 = f5892x9b2a01bc;
        if (clsClass$4 == null) {
            clsClass$4 = class$("com.thoughtworks.xstream.converters.reflection.ReflectionProvider");
            f5892x9b2a01bc = clsClass$4;
        }
        TypeHierarchyPermission typeHierarchyPermission4 = new TypeHierarchyPermission(clsClass$4);
        Class clsClass$5 = f5890xaaf77c;
        if (clsClass$5 == null) {
            clsClass$5 = class$("com.thoughtworks.xstream.converters.javabean.JavaBeanProvider");
            f5890xaaf77c = clsClass$5;
        }
        TypeHierarchyPermission typeHierarchyPermission5 = new TypeHierarchyPermission(clsClass$5);
        Class clsClass$6 = f5891x845758b0;
        if (clsClass$6 == null) {
            clsClass$6 = class$("com.thoughtworks.xstream.converters.reflection.FieldKeySorter");
            f5891x845758b0 = clsClass$6;
        }
        TypeHierarchyPermission typeHierarchyPermission6 = new TypeHierarchyPermission(clsClass$6);
        Class clsClass$7 = class$com$thoughtworks$xstream$converters$ConverterLookup;
        if (clsClass$7 == null) {
            clsClass$7 = class$("com.thoughtworks.xstream.converters.ConverterLookup");
            class$com$thoughtworks$xstream$converters$ConverterLookup = clsClass$7;
        }
        TypeHierarchyPermission typeHierarchyPermission7 = new TypeHierarchyPermission(clsClass$7);
        Class clsClass$8 = class$com$thoughtworks$xstream$converters$ConverterRegistry;
        if (clsClass$8 == null) {
            clsClass$8 = class$("com.thoughtworks.xstream.converters.ConverterRegistry");
            class$com$thoughtworks$xstream$converters$ConverterRegistry = clsClass$8;
        }
        TypeHierarchyPermission typeHierarchyPermission8 = new TypeHierarchyPermission(clsClass$8);
        Class clsClass$9 = class$com$thoughtworks$xstream$io$HierarchicalStreamDriver;
        if (clsClass$9 == null) {
            clsClass$9 = class$("com.thoughtworks.xstream.io.HierarchicalStreamDriver");
            class$com$thoughtworks$xstream$io$HierarchicalStreamDriver = clsClass$9;
        }
        TypeHierarchyPermission typeHierarchyPermission9 = new TypeHierarchyPermission(clsClass$9);
        Class clsClass$10 = class$com$thoughtworks$xstream$MarshallingStrategy;
        if (clsClass$10 == null) {
            clsClass$10 = class$("com.thoughtworks.xstream.MarshallingStrategy");
            class$com$thoughtworks$xstream$MarshallingStrategy = clsClass$10;
        }
        TypeHierarchyPermission typeHierarchyPermission10 = new TypeHierarchyPermission(clsClass$10);
        Class clsClass$11 = class$com$thoughtworks$xstream$converters$MarshallingContext;
        if (clsClass$11 == null) {
            clsClass$11 = class$("com.thoughtworks.xstream.converters.MarshallingContext");
            class$com$thoughtworks$xstream$converters$MarshallingContext = clsClass$11;
        }
        TypeHierarchyPermission typeHierarchyPermission11 = new TypeHierarchyPermission(clsClass$11);
        Class clsClass$12 = class$com$thoughtworks$xstream$converters$UnmarshallingContext;
        if (clsClass$12 == null) {
            clsClass$12 = class$("com.thoughtworks.xstream.converters.UnmarshallingContext");
            class$com$thoughtworks$xstream$converters$UnmarshallingContext = clsClass$12;
        }
        TypeHierarchyPermission typeHierarchyPermission12 = new TypeHierarchyPermission(clsClass$12);
        Class clsClass$13 = class$com$thoughtworks$xstream$io$naming$NameCoder;
        if (clsClass$13 == null) {
            clsClass$13 = class$("com.thoughtworks.xstream.io.naming.NameCoder");
            class$com$thoughtworks$xstream$io$naming$NameCoder = clsClass$13;
        }
        TypeHierarchyPermission typeHierarchyPermission13 = new TypeHierarchyPermission(clsClass$13);
        Class clsClass$14 = class$com$thoughtworks$xstream$security$TypePermission;
        if (clsClass$14 == null) {
            clsClass$14 = class$("com.thoughtworks.xstream.security.TypePermission");
            class$com$thoughtworks$xstream$security$TypePermission = clsClass$14;
        }
        TypeHierarchyPermission typeHierarchyPermission14 = new TypeHierarchyPermission(clsClass$14);
        StringBuffer stringBuffer = new StringBuffer();
        Class clsClass$15 = class$com$thoughtworks$xstream$core$JVM;
        if (clsClass$15 == null) {
            clsClass$15 = class$("com.thoughtworks.xstream.core.JVM");
            class$com$thoughtworks$xstream$core$JVM = clsClass$15;
        }
        stringBuffer.append(clsClass$15.getPackage().getName());
        stringBuffer.append(".**");
        WildcardTypePermission wildcardTypePermission = new WildcardTypePermission(true, new String[]{stringBuffer.toString()});
        Class clsClass$16 = class$javax$xml$datatype$DatatypeFactory;
        if (clsClass$16 == null) {
            clsClass$16 = class$("javax.xml.datatype.DatatypeFactory");
            class$javax$xml$datatype$DatatypeFactory = clsClass$16;
        }
        PERMISSIONS = new TypePermission[]{typeHierarchyPermission, typeHierarchyPermission2, typeHierarchyPermission3, typeHierarchyPermission4, typeHierarchyPermission5, typeHierarchyPermission6, typeHierarchyPermission7, typeHierarchyPermission8, typeHierarchyPermission9, typeHierarchyPermission10, typeHierarchyPermission11, typeHierarchyPermission12, typeHierarchyPermission13, typeHierarchyPermission14, wildcardTypePermission, new TypeHierarchyPermission(clsClass$16)};
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public String toXML(XStream xStream, Object obj) throws ObjectStreamException {
        StringWriter stringWriter = new StringWriter();
        try {
            toXML(xStream, obj, stringWriter);
            return stringWriter.toString();
        } catch (ObjectStreamException e) {
            throw e;
        } catch (IOException e2) {
            throw new StreamException("Unexpected IO error from a StringWriter", e2);
        }
    }

    public void toXML(XStream xStream, Object obj, Writer writer) throws IOException {
        ObjectOutputStream objectOutputStreamCreateObjectOutputStream = new XStream().createObjectOutputStream(writer);
        try {
            objectOutputStreamCreateObjectOutputStream.writeObject(xStream);
            objectOutputStreamCreateObjectOutputStream.flush();
            xStream.toXML(obj, writer);
        } finally {
            objectOutputStreamCreateObjectOutputStream.close();
        }
    }

    public Object fromXML(String str) throws ObjectStreamException, ClassNotFoundException {
        try {
            return fromXML(new StringReader(str));
        } catch (ObjectStreamException e) {
            throw e;
        } catch (IOException e2) {
            throw new StreamException("Unexpected IO error from a StringReader", e2);
        }
    }

    public Object fromXML(String str, TypePermission[] typePermissionArr) throws ObjectStreamException, ClassNotFoundException {
        try {
            return fromXML(new StringReader(str), typePermissionArr);
        } catch (ObjectStreamException e) {
            throw e;
        } catch (IOException e2) {
            throw new StreamException("Unexpected IO error from a StringReader", e2);
        }
    }

    public Object fromXML(HierarchicalStreamDriver hierarchicalStreamDriver, String str) throws ObjectStreamException, ClassNotFoundException {
        try {
            return fromXML(hierarchicalStreamDriver, new StringReader(str));
        } catch (ObjectStreamException e) {
            throw e;
        } catch (IOException e2) {
            throw new StreamException("Unexpected IO error from a StringReader", e2);
        }
    }

    public Object fromXML(HierarchicalStreamDriver hierarchicalStreamDriver, String str, TypePermission[] typePermissionArr) throws ObjectStreamException, ClassNotFoundException {
        try {
            return fromXML(hierarchicalStreamDriver, new StringReader(str), typePermissionArr);
        } catch (ObjectStreamException e) {
            throw e;
        } catch (IOException e2) {
            throw new StreamException("Unexpected IO error from a StringReader", e2);
        }
    }

    public Object fromXML(Reader reader) throws IOException, ClassNotFoundException {
        return fromXML(new XppDriver(), reader);
    }

    public Object fromXML(Reader reader, TypePermission[] typePermissionArr) throws IOException, ClassNotFoundException {
        return fromXML(new XppDriver(), reader, typePermissionArr);
    }

    public Object fromXML(HierarchicalStreamDriver hierarchicalStreamDriver, Reader reader) throws IOException, ClassNotFoundException {
        return fromXML(hierarchicalStreamDriver, reader, PERMISSIONS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fromXML(HierarchicalStreamDriver hierarchicalStreamDriver, Reader reader, TypePermission[] typePermissionArr) throws IOException, ClassNotFoundException {
        XStream xStream = new XStream(hierarchicalStreamDriver);
        for (TypePermission typePermission : typePermissionArr) {
            xStream.addPermission(typePermission);
        }
        HierarchicalStreamReader hierarchicalStreamReaderCreateReader = hierarchicalStreamDriver.createReader(reader);
        try {
            ObjectInputStream objectInputStreamCreateObjectInputStream = ((XStream) xStream.createObjectInputStream(hierarchicalStreamReaderCreateReader).readObject()).createObjectInputStream(hierarchicalStreamReaderCreateReader);
            Object object = objectInputStreamCreateObjectInputStream.readObject();
            objectInputStreamCreateObjectInputStream.close();
            return object;
        } finally {
        }
    }

    public static TypePermission[] getDefaultPermissions() {
        return (TypePermission[]) PERMISSIONS.clone();
    }
}
