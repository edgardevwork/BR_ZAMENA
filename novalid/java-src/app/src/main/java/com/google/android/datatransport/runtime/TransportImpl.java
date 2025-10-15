package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

/* loaded from: classes8.dex */
public final class TransportImpl<T> implements Transport<T> {
    public final String name;
    public final Encoding payloadEncoding;
    public final Transformer<T, byte[]> transformer;
    public final TransportContext transportContext;
    public final TransportInternal transportInternal;

    public static /* synthetic */ void lambda$send$0(Exception exc) {
    }

    public TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer<T, byte[]> transformer, TransportInternal transportInternal) {
        this.transportContext = transportContext;
        this.name = str;
        this.payloadEncoding = encoding;
        this.transformer = transformer;
        this.transportInternal = transportInternal;
    }

    @Override // com.google.android.datatransport.Transport
    public void send(Event<T> event) {
        schedule(event, new TransportScheduleCallback() { // from class: com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                TransportImpl.lambda$send$0(exc);
            }
        });
    }

    @Override // com.google.android.datatransport.Transport
    public void schedule(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
        this.transportInternal.send(SendRequest.builder().setTransportContext(this.transportContext).setEvent(event).setTransportName(this.name).setTransformer(this.transformer).setEncoding(this.payloadEncoding).build(), transportScheduleCallback);
    }

    public TransportContext getTransportContext() {
        return this.transportContext;
    }
}
