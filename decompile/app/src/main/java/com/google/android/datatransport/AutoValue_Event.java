package com.google.android.datatransport;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;

/* loaded from: classes6.dex */
public final class AutoValue_Event<T> extends Event<T> {
    public final Integer code;
    public final EventContext eventContext;
    public final T payload;
    public final Priority priority;
    public final ProductData productData;

    public AutoValue_Event(@Nullable Integer num, T t, Priority priority, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        this.code = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.payload = t;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.priority = priority;
        this.productData = productData;
        this.eventContext = eventContext;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.priority;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public ProductData getProductData() {
        return this.productData;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public EventContext getEventContext() {
        return this.eventContext;
    }

    public String toString() {
        return "Event{code=" + this.code + ", payload=" + this.payload + ", priority=" + this.priority + ", productData=" + this.productData + ", eventContext=" + this.eventContext + WebvttCssParser.RULE_END;
    }

    public boolean equals(Object obj) {
        ProductData productData;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.code;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.payload.equals(event.getPayload()) && this.priority.equals(event.getPriority()) && ((productData = this.productData) != null ? productData.equals(event.getProductData()) : event.getProductData() == null)) {
                EventContext eventContext = this.eventContext;
                if (eventContext == null) {
                    if (event.getEventContext() == null) {
                        return true;
                    }
                } else if (eventContext.equals(event.getEventContext())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode()) * 1000003;
        ProductData productData = this.productData;
        int iHashCode2 = (iHashCode ^ (productData == null ? 0 : productData.hashCode())) * 1000003;
        EventContext eventContext = this.eventContext;
        return iHashCode2 ^ (eventContext != null ? eventContext.hashCode() : 0);
    }
}
