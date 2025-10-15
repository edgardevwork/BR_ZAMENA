package com.fasterxml.jackson.databind.util;

/* loaded from: classes3.dex */
public abstract class PrimitiveArrayBuilder<T> {
    public static final int INITIAL_CHUNK_SIZE = 12;
    public static final int MAX_CHUNK_SIZE = 262144;
    public static final int SMALL_CHUNK_SIZE = 16384;
    public Node<T> _bufferHead;
    public Node<T> _bufferTail;
    public int _bufferedEntryCount;
    public T _freeBuffer;

    public abstract T _constructArray(int i);

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T resetAndStart() {
        _reset();
        T t = this._freeBuffer;
        return t == null ? _constructArray(12) : t;
    }

    public final T appendCompletedChunk(T t, int i) {
        Node<T> node = new Node<>(t, i);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i;
        return _constructArray(i < 16384 ? i + i : i + (i >> 2));
    }

    public T completeAndClearBuffer(T t, int i) {
        int i2 = this._bufferedEntryCount + i;
        T t_constructArray = _constructArray(i2);
        int iCopyData = 0;
        for (Node<T> next = this._bufferHead; next != null; next = next.next()) {
            iCopyData = next.copyData(t_constructArray, iCopyData);
        }
        System.arraycopy(t, 0, t_constructArray, iCopyData, i);
        int i3 = iCopyData + i;
        if (i3 == i2) {
            return t_constructArray;
        }
        throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i3);
    }

    public void _reset() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public static final class Node<T> {
        public final T _data;
        public final int _dataLength;
        public Node<T> _next;

        public Node(T t, int i) {
            this._data = t;
            this._dataLength = i;
        }

        public T getData() {
            return this._data;
        }

        public int copyData(T t, int i) {
            System.arraycopy(this._data, 0, t, i, this._dataLength);
            return i + this._dataLength;
        }

        public Node<T> next() {
            return this._next;
        }

        public void linkNext(Node<T> node) {
            if (this._next != null) {
                throw new IllegalStateException();
            }
            this._next = node;
        }
    }
}
