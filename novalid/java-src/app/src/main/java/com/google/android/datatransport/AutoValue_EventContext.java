package com.google.android.datatransport;

import androidx.annotation.Nullable;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.google.android.datatransport.EventContext;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class AutoValue_EventContext extends EventContext {
    public final byte[] experimentIdsClear;
    public final byte[] experimentIdsEncrypted;
    public final String pseudonymousId;

    public /* synthetic */ AutoValue_EventContext(String str, byte[] bArr, byte[] bArr2, C67311 c67311) {
        this(str, bArr, bArr2);
    }

    public AutoValue_EventContext(@Nullable String str, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        this.pseudonymousId = str;
        this.experimentIdsClear = bArr;
        this.experimentIdsEncrypted = bArr2;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public String getPseudonymousId() {
        return this.pseudonymousId;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public byte[] getExperimentIdsClear() {
        return this.experimentIdsClear;
    }

    @Override // com.google.android.datatransport.EventContext
    @Nullable
    public byte[] getExperimentIdsEncrypted() {
        return this.experimentIdsEncrypted;
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.pseudonymousId + ", experimentIdsClear=" + Arrays.toString(this.experimentIdsClear) + ", experimentIdsEncrypted=" + Arrays.toString(this.experimentIdsEncrypted) + WebvttCssParser.RULE_END;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventContext)) {
            return false;
        }
        EventContext eventContext = (EventContext) obj;
        String str = this.pseudonymousId;
        if (str != null ? str.equals(eventContext.getPseudonymousId()) : eventContext.getPseudonymousId() == null) {
            boolean z = eventContext instanceof AutoValue_EventContext;
            if (Arrays.equals(this.experimentIdsClear, z ? ((AutoValue_EventContext) eventContext).experimentIdsClear : eventContext.getExperimentIdsClear())) {
                if (Arrays.equals(this.experimentIdsEncrypted, z ? ((AutoValue_EventContext) eventContext).experimentIdsEncrypted : eventContext.getExperimentIdsEncrypted())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.pseudonymousId;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.experimentIdsClear)) * 1000003) ^ Arrays.hashCode(this.experimentIdsEncrypted);
    }

    public static final class Builder extends EventContext.Builder {
        public byte[] experimentIdsClear;
        public byte[] experimentIdsEncrypted;
        public String pseudonymousId;

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setPseudonymousId(String str) {
            this.pseudonymousId = str;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsClear(byte[] bArr) {
            this.experimentIdsClear = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.experimentIdsEncrypted = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext build() {
            return new AutoValue_EventContext(this.pseudonymousId, this.experimentIdsClear, this.experimentIdsEncrypted);
        }
    }
}
