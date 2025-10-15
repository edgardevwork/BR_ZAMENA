package com.thoughtworks.xstream.core.util;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes8.dex */
public final class FastStack {
    public int pointer;
    public Object[] stack;

    public FastStack(int i) {
        this.stack = new Object[i];
    }

    public Object push(Object obj) {
        int i = this.pointer + 1;
        Object[] objArr = this.stack;
        if (i >= objArr.length) {
            resizeStack(objArr.length * 2);
        }
        Object[] objArr2 = this.stack;
        int i2 = this.pointer;
        this.pointer = i2 + 1;
        objArr2[i2] = obj;
        return obj;
    }

    public void popSilently() {
        Object[] objArr = this.stack;
        int i = this.pointer - 1;
        this.pointer = i;
        objArr[i] = null;
    }

    public Object pop() {
        Object[] objArr = this.stack;
        int i = this.pointer - 1;
        this.pointer = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public Object peek() {
        int i = this.pointer;
        if (i == 0) {
            return null;
        }
        return this.stack[i - 1];
    }

    public Object replace(Object obj) {
        Object[] objArr = this.stack;
        int i = this.pointer;
        Object obj2 = objArr[i - 1];
        objArr[i - 1] = obj;
        return obj2;
    }

    public void replaceSilently(Object obj) {
        this.stack[this.pointer - 1] = obj;
    }

    public int size() {
        return this.pointer;
    }

    public boolean hasStuff() {
        return this.pointer > 0;
    }

    public Object get(int i) {
        return this.stack[i];
    }

    public final void resizeStack(int i) {
        Object[] objArr = new Object[i];
        System.arraycopy(this.stack, 0, objArr, 0, Math.min(this.pointer, i));
        this.stack = objArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = 0; i < this.pointer; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.stack[i]);
        }
        stringBuffer.append(AbstractJsonLexerKt.END_LIST);
        return stringBuffer.toString();
    }
}
