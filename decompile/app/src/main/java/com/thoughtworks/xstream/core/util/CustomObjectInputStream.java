package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.p042io.StreamException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;
import java.util.Map;

/* loaded from: classes8.dex */
public class CustomObjectInputStream extends ObjectInputStream {
    public static final String DATA_HOLDER_KEY;
    public static /* synthetic */ Class class$com$thoughtworks$xstream$core$util$CustomObjectInputStream;
    public FastStack callbacks;
    public final com.thoughtworks.xstream.core.ClassLoaderReference classLoaderReference;

    public interface StreamCallback {
        void close() throws IOException;

        void defaultReadObject() throws IOException;

        Map readFieldsFromStream() throws IOException;

        Object readFromStream() throws IOException;

        void registerValidation(ObjectInputValidation objectInputValidation, int i) throws InvalidObjectException, NotActiveException;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    static {
        Class clsClass$ = class$com$thoughtworks$xstream$core$util$CustomObjectInputStream;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.core.util.CustomObjectInputStream");
            class$com$thoughtworks$xstream$core$util$CustomObjectInputStream = clsClass$;
        }
        DATA_HOLDER_KEY = clsClass$.getName();
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static CustomObjectInputStream getInstance(DataHolder dataHolder, StreamCallback streamCallback) {
        return getInstance(dataHolder, streamCallback, (ClassLoader) null);
    }

    public static synchronized CustomObjectInputStream getInstance(DataHolder dataHolder, StreamCallback streamCallback, ClassLoader classLoader) {
        return getInstance(dataHolder, streamCallback, new com.thoughtworks.xstream.core.ClassLoaderReference(classLoader));
    }

    public static synchronized CustomObjectInputStream getInstance(DataHolder dataHolder, StreamCallback streamCallback, com.thoughtworks.xstream.core.ClassLoaderReference classLoaderReference) {
        CustomObjectInputStream customObjectInputStream;
        try {
            try {
                Object obj = DATA_HOLDER_KEY;
                customObjectInputStream = (CustomObjectInputStream) dataHolder.get(obj);
                if (customObjectInputStream == null) {
                    customObjectInputStream = new CustomObjectInputStream(streamCallback, classLoaderReference);
                    dataHolder.put(obj, customObjectInputStream);
                } else {
                    customObjectInputStream.pushCallback(streamCallback);
                }
            } catch (IOException e) {
                throw new StreamException("Cannot create CustomObjectStream", e);
            } catch (SecurityException e2) {
                throw new ObjectAccessException("Cannot create CustomObjectStream", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return customObjectInputStream;
    }

    public CustomObjectInputStream(StreamCallback streamCallback, com.thoughtworks.xstream.core.ClassLoaderReference classLoaderReference) throws IOException, SecurityException {
        FastStack fastStack = new FastStack(1);
        this.callbacks = fastStack;
        fastStack.push(streamCallback);
        this.classLoaderReference = classLoaderReference;
    }

    public CustomObjectInputStream(StreamCallback streamCallback, ClassLoader classLoader) throws IOException, SecurityException {
        this(streamCallback, new com.thoughtworks.xstream.core.ClassLoaderReference(classLoader));
    }

    public void pushCallback(StreamCallback streamCallback) {
        this.callbacks.push(streamCallback);
    }

    public StreamCallback popCallback() {
        return (StreamCallback) this.callbacks.pop();
    }

    public StreamCallback peekCallback() {
        return (StreamCallback) this.callbacks.peek();
    }

    @Override // java.io.ObjectInputStream
    public Class resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        ClassLoader reference = this.classLoaderReference.getReference();
        if (reference == null) {
            return super.resolveClass(objectStreamClass);
        }
        return Class.forName(objectStreamClass.getName(), false, reference);
    }

    @Override // java.io.ObjectInputStream
    public void defaultReadObject() throws IOException {
        peekCallback().defaultReadObject();
    }

    @Override // java.io.ObjectInputStream
    public Object readObjectOverride() throws IOException {
        return peekCallback().readFromStream();
    }

    @Override // java.io.ObjectInputStream
    public Object readUnshared() throws IOException, ClassNotFoundException {
        return readObject();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public boolean readBoolean() throws IOException {
        return ((Boolean) peekCallback().readFromStream()).booleanValue();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public byte readByte() throws IOException {
        return ((Byte) peekCallback().readFromStream()).byteValue();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public int readUnsignedByte() throws IOException {
        return ((Byte) peekCallback().readFromStream()).intValue() & 255;
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public int readInt() throws IOException {
        return ((Integer) peekCallback().readFromStream()).intValue();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public char readChar() throws IOException {
        return ((Character) peekCallback().readFromStream()).charValue();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public float readFloat() throws IOException {
        return ((Float) peekCallback().readFromStream()).floatValue();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public double readDouble() throws IOException {
        return ((Double) peekCallback().readFromStream()).doubleValue();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public long readLong() throws IOException {
        return ((Long) peekCallback().readFromStream()).longValue();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public short readShort() throws IOException {
        return ((Short) peekCallback().readFromStream()).shortValue();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return ((Short) peekCallback().readFromStream()).intValue() & 65535;
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public String readUTF() throws IOException {
        return (String) peekCallback().readFromStream();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        System.arraycopy((byte[]) peekCallback().readFromStream(), 0, bArr, i, i2);
    }

    @Override // java.io.ObjectInputStream, java.io.InputStream, java.io.ObjectInput
    public int read() throws IOException {
        return readUnsignedByte();
    }

    @Override // java.io.ObjectInputStream, java.io.InputStream, java.io.ObjectInput
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = (byte[]) peekCallback().readFromStream();
        if (bArr2.length != i2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Expected ");
            stringBuffer.append(i2);
            stringBuffer.append(" bytes from stream, got ");
            stringBuffer.append(bArr2.length);
            throw new StreamCorruptedException(stringBuffer.toString());
        }
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.ObjectInputStream
    public ObjectInputStream.GetField readFields() throws IOException {
        return new CustomGetField(peekCallback().readFieldsFromStream());
    }

    public class CustomGetField extends ObjectInputStream.GetField {
        public Map fields;

        public CustomGetField(Map map) {
            this.fields = map;
        }

        @Override // java.io.ObjectInputStream.GetField
        public ObjectStreamClass getObjectStreamClass() {
            throw new UnsupportedOperationException();
        }

        public final Object get(String str) {
            return this.fields.get(str);
        }

        @Override // java.io.ObjectInputStream.GetField
        public boolean defaulted(String str) {
            return !this.fields.containsKey(str);
        }

        @Override // java.io.ObjectInputStream.GetField
        public byte get(String str, byte b) {
            return defaulted(str) ? b : ((Byte) get(str)).byteValue();
        }

        @Override // java.io.ObjectInputStream.GetField
        public char get(String str, char c) {
            return defaulted(str) ? c : ((Character) get(str)).charValue();
        }

        @Override // java.io.ObjectInputStream.GetField
        public double get(String str, double d) {
            return defaulted(str) ? d : ((Double) get(str)).doubleValue();
        }

        @Override // java.io.ObjectInputStream.GetField
        public float get(String str, float f) {
            return defaulted(str) ? f : ((Float) get(str)).floatValue();
        }

        @Override // java.io.ObjectInputStream.GetField
        public int get(String str, int i) {
            return defaulted(str) ? i : ((Integer) get(str)).intValue();
        }

        @Override // java.io.ObjectInputStream.GetField
        public long get(String str, long j) {
            return defaulted(str) ? j : ((Long) get(str)).longValue();
        }

        @Override // java.io.ObjectInputStream.GetField
        public short get(String str, short s) {
            return defaulted(str) ? s : ((Short) get(str)).shortValue();
        }

        @Override // java.io.ObjectInputStream.GetField
        public boolean get(String str, boolean z) {
            return defaulted(str) ? z : ((Boolean) get(str)).booleanValue();
        }

        @Override // java.io.ObjectInputStream.GetField
        public Object get(String str, Object obj) {
            return defaulted(str) ? obj : get(str);
        }
    }

    @Override // java.io.ObjectInputStream
    public void registerValidation(ObjectInputValidation objectInputValidation, int i) throws InvalidObjectException, NotActiveException {
        peekCallback().registerValidation(objectInputValidation, i);
    }

    @Override // java.io.ObjectInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.ObjectInput
    public void close() throws IOException {
        peekCallback().close();
    }

    @Override // java.io.ObjectInputStream, java.io.InputStream, java.io.ObjectInput
    public int available() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.ObjectInputStream, java.io.DataInput
    public int skipBytes(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public long skip(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
