package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes7.dex */
public interface MessageInfoFactory {
    boolean isSupported(Class<?> clazz);

    MessageInfo messageInfoFor(Class<?> clazz);
}
