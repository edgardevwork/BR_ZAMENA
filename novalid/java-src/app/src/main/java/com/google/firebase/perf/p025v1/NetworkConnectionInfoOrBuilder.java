package com.google.firebase.perf.p025v1;

import com.google.firebase.perf.p025v1.NetworkConnectionInfo;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes5.dex */
public interface NetworkConnectionInfoOrBuilder extends MessageLiteOrBuilder {
    NetworkConnectionInfo.MobileSubtype getMobileSubtype();

    NetworkConnectionInfo.NetworkType getNetworkType();

    boolean hasMobileSubtype();

    boolean hasNetworkType();
}
