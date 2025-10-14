package com.sdkit.paylib.paylibnetwork.api.domain.client;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J!\u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnetwork/api/domain/client/WebClientConfig;", "", "", "", "component1", "extraParams", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Map;", "getExtraParams", "()Ljava/util/Map;", SegmentConstantPool.INITSTRING, "(Ljava/util/Map;)V", "com-sdkit-assistant_paylib_network_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class WebClientConfig {

    /* renamed from: a, reason: from kotlin metadata */
    public final Map extraParams;

    public WebClientConfig() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebClientConfig copy$default(WebClientConfig webClientConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = webClientConfig.extraParams;
        }
        return webClientConfig.copy(map);
    }

    public final Map<String, String> component1() {
        return this.extraParams;
    }

    public final WebClientConfig copy(Map<String, String> extraParams) {
        return new WebClientConfig(extraParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WebClientConfig) && Intrinsics.areEqual(this.extraParams, ((WebClientConfig) other).extraParams);
    }

    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public int hashCode() {
        Map map = this.extraParams;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "WebClientConfig(extraParams=" + this.extraParams + ')';
    }

    public WebClientConfig(Map<String, String> map) {
        this.extraParams = map;
    }

    public /* synthetic */ WebClientConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
