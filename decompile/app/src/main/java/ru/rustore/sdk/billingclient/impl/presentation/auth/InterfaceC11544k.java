package ru.rustore.sdk.billingclient.impl.presentation.auth;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.domain.model.UnauthorizedProductType;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.k */
/* loaded from: classes7.dex */
public interface InterfaceC11544k {

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.k$a */
    public static final class a implements InterfaceC11544k {

        /* renamed from: a */
        public final String f10574a;

        /* renamed from: b */
        public final UnauthorizedProductType f10575b;

        public a(String url, UnauthorizedProductType productType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(productType, "productType");
            this.f10574a = url;
            this.f10575b = productType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f10574a, aVar.f10574a) && this.f10575b == aVar.f10575b;
        }

        public final int hashCode() {
            return this.f10575b.hashCode() + (this.f10574a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(url=");
            sb.append((Object) ("Url(value=" + this.f10574a + ')'));
            sb.append(", productType=");
            sb.append(this.f10575b);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.k$b */
    public static final class b implements InterfaceC11544k {

        /* renamed from: a */
        public static final b f10576a = new b();
    }
}
