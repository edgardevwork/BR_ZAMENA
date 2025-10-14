package com.google.firebase.perf.p025v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes5.dex */
public interface CpuMetricReadingOrBuilder extends MessageLiteOrBuilder {
    long getClientTimeUs();

    long getSystemTimeUs();

    long getUserTimeUs();

    boolean hasClientTimeUs();

    boolean hasSystemTimeUs();

    boolean hasUserTimeUs();
}
