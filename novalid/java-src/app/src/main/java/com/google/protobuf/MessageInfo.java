package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes7.dex */
public interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
