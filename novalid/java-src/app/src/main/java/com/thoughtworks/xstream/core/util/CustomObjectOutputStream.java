package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.p042io.StreamException;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Map;

/* loaded from: classes8.dex */
public class CustomObjectOutputStream extends ObjectOutputStream {
    public static final String DATA_HOLDER_KEY;

    /* renamed from: class$com$thoughtworks$xstream$core$util$CustomObjectOutputStream */
    public static /* synthetic */ Class f5906x6b512ba6;
    public FastStack callbacks = new FastStack(1);
    public FastStack customFields = new FastStack(1);

    public interface StreamCallback {
        void close() throws IOException;

        void defaultWriteObject() throws IOException;

        void flush() throws IOException;

        void writeFieldsToStream(Map map) throws IOException;

        void writeToStream(Object obj) throws IOException;
    }

    static {
        Class clsClass$ = f5906x6b512ba6;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.core.util.CustomObjectOutputStream");
            f5906x6b512ba6 = clsClass$;
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

    public static synchronized CustomObjectOutputStream getInstance(DataHolder dataHolder, StreamCallback streamCallback) {
        CustomObjectOutputStream customObjectOutputStream;
        try {
            try {
                Object obj = DATA_HOLDER_KEY;
                customObjectOutputStream = (CustomObjectOutputStream) dataHolder.get(obj);
                if (customObjectOutputStream == null) {
                    customObjectOutputStream = new CustomObjectOutputStream(streamCallback);
                    dataHolder.put(obj, customObjectOutputStream);
                } else {
                    customObjectOutputStream.pushCallback(streamCallback);
                }
            } catch (IOException e) {
                throw new StreamException("Cannot create CustomObjectStream", e);
            } catch (SecurityException e2) {
                throw new ObjectAccessException("Cannot create CustomObjectStream", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return customObjectOutputStream;
    }

    public CustomObjectOutputStream(StreamCallback streamCallback) throws IOException, SecurityException {
        this.callbacks.push(streamCallback);
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

    @Override // java.io.ObjectOutputStream
    public void defaultWriteObject() throws IOException {
        peekCallback().defaultWriteObject();
    }

    @Override // java.io.ObjectOutputStream
    public void writeObjectOverride(Object obj) throws IOException {
        peekCallback().writeToStream(obj);
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeBoolean(boolean z) throws IOException {
        peekCallback().writeToStream(z ? Boolean.TRUE : Boolean.FALSE);
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeByte(int i) throws IOException {
        peekCallback().writeToStream(new Byte((byte) i));
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeInt(int i) throws IOException {
        peekCallback().writeToStream(new Integer(i));
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeChar(int i) throws IOException {
        peekCallback().writeToStream(new Character((char) i));
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeDouble(double d) throws IOException {
        peekCallback().writeToStream(new Double(d));
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeFloat(float f) throws IOException {
        peekCallback().writeToStream(new Float(f));
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeLong(long j) throws IOException {
        peekCallback().writeToStream(new Long(j));
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeShort(int i) throws IOException {
        peekCallback().writeToStream(new Short((short) i));
    }

    @Override // java.io.ObjectOutputStream, java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public void write(byte[] bArr) throws IOException {
        peekCallback().writeToStream(bArr);
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeChars(String str) throws IOException {
        peekCallback().writeToStream(str.toCharArray());
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        peekCallback().writeToStream(str);
    }

    @Override // java.io.ObjectOutputStream, java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public void write(int i) throws IOException {
        peekCallback().writeToStream(new Byte((byte) i));
    }

    @Override // java.io.ObjectOutputStream, java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        peekCallback().writeToStream(bArr2);
    }

    @Override // java.io.ObjectOutputStream, java.io.OutputStream, java.io.Flushable, java.io.ObjectOutput
    public void flush() throws IOException {
        peekCallback().flush();
    }

    @Override // java.io.ObjectOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.ObjectOutput
    public void close() throws IOException {
        peekCallback().close();
    }

    @Override // java.io.ObjectOutputStream
    public ObjectOutputStream.PutField putFields() {
        CustomPutField customPutField = new CustomPutField();
        this.customFields.push(customPutField);
        return customPutField;
    }

    @Override // java.io.ObjectOutputStream
    public void writeFields() throws IOException {
        peekCallback().writeFieldsToStream(((CustomPutField) this.customFields.pop()).asMap());
    }

    public class CustomPutField extends ObjectOutputStream.PutField {
        public final Map fields;

        public CustomPutField() {
            this.fields = new OrderRetainingMap();
        }

        public Map asMap() {
            return this.fields;
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void write(ObjectOutput objectOutput) throws IOException {
            CustomObjectOutputStream.this.peekCallback().writeToStream(asMap());
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, Object obj) {
            this.fields.put(str, obj);
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, byte b) {
            put(str, new Byte(b));
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, char c) {
            put(str, new Character(c));
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, double d) {
            put(str, new Double(d));
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, float f) {
            put(str, new Float(f));
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, int i) {
            put(str, new Integer(i));
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, long j) {
            put(str, new Long(j));
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, short s) {
            put(str, new Short(s));
        }

        @Override // java.io.ObjectOutputStream.PutField
        public void put(String str, boolean z) {
            put(str, z ? Boolean.TRUE : Boolean.FALSE);
        }
    }

    @Override // java.io.ObjectOutputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.ObjectOutputStream
    public void useProtocolVersion(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.ObjectOutputStream, java.io.DataOutput
    public void writeBytes(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.ObjectOutputStream
    public void writeUnshared(Object obj) {
        throw new UnsupportedOperationException();
    }
}
