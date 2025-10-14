package com.fasterxml.jackson.core.p022io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

/* loaded from: classes8.dex */
public class IOContext {
    public byte[] _base64Buffer;
    public final BufferRecycler _bufferRecycler;
    public char[] _concatCBuffer;
    public final ContentReference _contentReference;
    public JsonEncoding _encoding;
    public final boolean _managedResource;
    public char[] _nameCopyBuffer;
    public byte[] _readIOBuffer;

    @Deprecated
    public final Object _sourceRef;
    public char[] _tokenCBuffer;
    public byte[] _writeEncodingBuffer;

    public IOContext(BufferRecycler bufferRecycler, ContentReference contentReference, boolean z) {
        this._bufferRecycler = bufferRecycler;
        this._contentReference = contentReference;
        this._sourceRef = contentReference.getRawContent();
        this._managedResource = z;
    }

    @Deprecated
    public IOContext(BufferRecycler bufferRecycler, Object obj, boolean z) {
        this(bufferRecycler, ContentReference.rawReference(obj), z);
    }

    public void setEncoding(JsonEncoding jsonEncoding) {
        this._encoding = jsonEncoding;
    }

    public IOContext withEncoding(JsonEncoding jsonEncoding) {
        this._encoding = jsonEncoding;
        return this;
    }

    public JsonEncoding getEncoding() {
        return this._encoding;
    }

    public boolean isResourceManaged() {
        return this._managedResource;
    }

    public ContentReference contentReference() {
        return this._contentReference;
    }

    @Deprecated
    public Object getSourceReference() {
        return this._sourceRef;
    }

    public TextBuffer constructTextBuffer() {
        return new TextBuffer(this._bufferRecycler);
    }

    public byte[] allocReadIOBuffer() {
        _verifyAlloc(this._readIOBuffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(0);
        this._readIOBuffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public byte[] allocReadIOBuffer(int i) {
        _verifyAlloc(this._readIOBuffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(0, i);
        this._readIOBuffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public byte[] allocWriteEncodingBuffer() {
        _verifyAlloc(this._writeEncodingBuffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(1);
        this._writeEncodingBuffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public byte[] allocWriteEncodingBuffer(int i) {
        _verifyAlloc(this._writeEncodingBuffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(1, i);
        this._writeEncodingBuffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public byte[] allocBase64Buffer() {
        _verifyAlloc(this._base64Buffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(3);
        this._base64Buffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public byte[] allocBase64Buffer(int i) {
        _verifyAlloc(this._base64Buffer);
        byte[] bArrAllocByteBuffer = this._bufferRecycler.allocByteBuffer(3, i);
        this._base64Buffer = bArrAllocByteBuffer;
        return bArrAllocByteBuffer;
    }

    public char[] allocTokenBuffer() {
        _verifyAlloc(this._tokenCBuffer);
        char[] cArrAllocCharBuffer = this._bufferRecycler.allocCharBuffer(0);
        this._tokenCBuffer = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public char[] allocTokenBuffer(int i) {
        _verifyAlloc(this._tokenCBuffer);
        char[] cArrAllocCharBuffer = this._bufferRecycler.allocCharBuffer(0, i);
        this._tokenCBuffer = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public char[] allocConcatBuffer() {
        _verifyAlloc(this._concatCBuffer);
        char[] cArrAllocCharBuffer = this._bufferRecycler.allocCharBuffer(1);
        this._concatCBuffer = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public char[] allocNameCopyBuffer(int i) {
        _verifyAlloc(this._nameCopyBuffer);
        char[] cArrAllocCharBuffer = this._bufferRecycler.allocCharBuffer(3, i);
        this._nameCopyBuffer = cArrAllocCharBuffer;
        return cArrAllocCharBuffer;
    }

    public void releaseReadIOBuffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._readIOBuffer);
            this._readIOBuffer = null;
            this._bufferRecycler.releaseByteBuffer(0, bArr);
        }
    }

    public void releaseWriteEncodingBuffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._writeEncodingBuffer);
            this._writeEncodingBuffer = null;
            this._bufferRecycler.releaseByteBuffer(1, bArr);
        }
    }

    public void releaseBase64Buffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._base64Buffer);
            this._base64Buffer = null;
            this._bufferRecycler.releaseByteBuffer(3, bArr);
        }
    }

    public void releaseTokenBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._tokenCBuffer);
            this._tokenCBuffer = null;
            this._bufferRecycler.releaseCharBuffer(0, cArr);
        }
    }

    public void releaseConcatBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._concatCBuffer);
            this._concatCBuffer = null;
            this._bufferRecycler.releaseCharBuffer(1, cArr);
        }
    }

    public void releaseNameCopyBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._nameCopyBuffer);
            this._nameCopyBuffer = null;
            this._bufferRecycler.releaseCharBuffer(3, cArr);
        }
    }

    public final void _verifyAlloc(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void _verifyRelease(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw wrongBuf();
        }
    }

    public final void _verifyRelease(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw wrongBuf();
        }
    }

    public final IllegalArgumentException wrongBuf() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
