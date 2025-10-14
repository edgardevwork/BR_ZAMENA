package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.ClassLoaderReference;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.ReferencingMarshallingContext;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.core.util.SerializationMembers;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import java.io.Externalizable;
import java.io.IOException;
import java.io.NotActiveException;
import java.io.ObjectInputValidation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes6.dex */
public class ExternalizableConverter implements Converter {

    /* renamed from: class$com$thoughtworks$xstream$converters$reflection$ExternalizableConverter */
    public static /* synthetic */ Class f5896x1f9c5a2a;
    public static /* synthetic */ Class class$java$io$Externalizable;
    public final ClassLoaderReference classLoaderReference;
    public Mapper mapper;
    public transient SerializationMembers serializationMembers;

    public ExternalizableConverter(Mapper mapper, ClassLoaderReference classLoaderReference) {
        this.mapper = mapper;
        this.classLoaderReference = classLoaderReference;
        this.serializationMembers = new SerializationMembers();
    }

    public ExternalizableConverter(Mapper mapper, ClassLoader classLoader) {
        this(mapper, new ClassLoaderReference(classLoader));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExternalizableConverter(Mapper mapper) throws Throwable {
        Class clsClass$ = f5896x1f9c5a2a;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.converters.reflection.ExternalizableConverter");
            f5896x1f9c5a2a = clsClass$;
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

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != null && JVM.canCreateDerivedObjectOutputStream()) {
            Class clsClass$ = class$java$io$Externalizable;
            if (clsClass$ == null) {
                clsClass$ = class$("java.io.Externalizable");
                class$java$io$Externalizable = clsClass$;
            }
            if (clsClass$.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, final HierarchicalStreamWriter hierarchicalStreamWriter, final MarshallingContext marshallingContext) throws IllegalAccessException, NoSuchMethodException, SecurityException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objCallWriteReplace = this.serializationMembers.callWriteReplace(obj);
        if (objCallWriteReplace != obj && (marshallingContext instanceof ReferencingMarshallingContext)) {
            ((ReferencingMarshallingContext) marshallingContext).replace(obj, objCallWriteReplace);
        }
        if (objCallWriteReplace.getClass() != obj.getClass()) {
            String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("resolves-to");
            if (strAliasForSystemAttribute != null) {
                hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, this.mapper.serializedClass(objCallWriteReplace.getClass()));
            }
            marshallingContext.convertAnother(objCallWriteReplace);
            return;
        }
        try {
            CustomObjectOutputStream customObjectOutputStream = CustomObjectOutputStream.getInstance(marshallingContext, new CustomObjectOutputStream.StreamCallback() { // from class: com.thoughtworks.xstream.converters.reflection.ExternalizableConverter.1
                @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
                public void writeToStream(Object obj2) {
                    if (obj2 != null) {
                        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, ExternalizableConverter.this.mapper.serializedClass(obj2.getClass()), obj2.getClass());
                        marshallingContext.convertAnother(obj2);
                        hierarchicalStreamWriter.endNode();
                    } else {
                        hierarchicalStreamWriter.startNode("null");
                        hierarchicalStreamWriter.endNode();
                    }
                }

                @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
                public void writeFieldsToStream(Map map) {
                    throw new UnsupportedOperationException();
                }

                @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
                public void defaultWriteObject() {
                    throw new UnsupportedOperationException();
                }

                @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
                public void flush() {
                    hierarchicalStreamWriter.flush();
                }

                @Override // com.thoughtworks.xstream.core.util.CustomObjectOutputStream.StreamCallback
                public void close() {
                    throw new UnsupportedOperationException("Objects are not allowed to call ObjectOutput.close() from writeExternal()");
                }
            });
            ((Externalizable) objCallWriteReplace).writeExternal(customObjectOutputStream);
            customObjectOutputStream.popCallback();
        } catch (IOException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Cannot serialize ");
            stringBuffer.append(objCallWriteReplace.getClass().getName());
            stringBuffer.append(" using Externalization");
            throw new StreamException(stringBuffer.toString(), e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(final HierarchicalStreamReader hierarchicalStreamReader, final UnmarshallingContext unmarshallingContext) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IOException {
        Class requiredType = unmarshallingContext.getRequiredType();
        try {
            Constructor declaredConstructor = requiredType.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            final Externalizable externalizable = (Externalizable) declaredConstructor.newInstance(null);
            CustomObjectInputStream customObjectInputStream = CustomObjectInputStream.getInstance(unmarshallingContext, new CustomObjectInputStream.StreamCallback() { // from class: com.thoughtworks.xstream.converters.reflection.ExternalizableConverter.2
                @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
                public Object readFromStream() {
                    hierarchicalStreamReader.moveDown();
                    Object objConvertAnother = unmarshallingContext.convertAnother(externalizable, HierarchicalStreams.readClassType(hierarchicalStreamReader, ExternalizableConverter.this.mapper));
                    hierarchicalStreamReader.moveUp();
                    return objConvertAnother;
                }

                @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
                public Map readFieldsFromStream() {
                    throw new UnsupportedOperationException();
                }

                @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
                public void defaultReadObject() {
                    throw new UnsupportedOperationException();
                }

                @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
                public void registerValidation(ObjectInputValidation objectInputValidation, int i) throws NotActiveException {
                    throw new NotActiveException("stream inactive");
                }

                @Override // com.thoughtworks.xstream.core.util.CustomObjectInputStream.StreamCallback
                public void close() {
                    throw new UnsupportedOperationException("Objects are not allowed to call ObjectInput.close() from readExternal()");
                }
            }, this.classLoaderReference);
            externalizable.readExternal(customObjectInputStream);
            customObjectInputStream.popCallback();
            return this.serializationMembers.callReadResolve(externalizable);
        } catch (IOException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Cannot externalize ");
            stringBuffer.append(requiredType.getClass());
            throw new StreamException(stringBuffer.toString(), e);
        } catch (ClassNotFoundException e2) {
            throw new ConversionException("Cannot construct type", e2);
        } catch (IllegalAccessException e3) {
            throw new ObjectAccessException("Cannot construct type", e3);
        } catch (InstantiationException e4) {
            throw new ConversionException("Cannot construct type", e4);
        } catch (NoSuchMethodException e5) {
            throw new ConversionException("Missing default constructor of type", e5);
        } catch (InvocationTargetException e6) {
            throw new ConversionException("Cannot construct type", e6);
        }
    }

    private Object readResolve() {
        this.serializationMembers = new SerializationMembers();
        return this;
    }
}
