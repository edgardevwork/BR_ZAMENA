package ru.rustore.sdk.billingclient.impl.domain.model;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.i */
/* loaded from: classes5.dex */
public interface InterfaceC11512i {

    /* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.i$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC11512i {

        /* renamed from: a */
        public static final a f10500a = new a();
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.i$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC11512i {

        /* renamed from: a */
        public final C11511h f10501a;

        public b(C11511h webAuthorizationInfo) {
            Intrinsics.checkNotNullParameter(webAuthorizationInfo, "webAuthorizationInfo");
            this.f10501a = webAuthorizationInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f10501a, ((b) obj).f10501a);
        }

        public final int hashCode() {
            return this.f10501a.hashCode();
        }

        public final String toString() {
            return "Success(webAuthorizationInfo=" + this.f10501a + ')';
        }
    }
}
