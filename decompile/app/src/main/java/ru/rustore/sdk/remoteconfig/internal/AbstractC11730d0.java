package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.d0 */
/* loaded from: classes5.dex */
public abstract class AbstractC11730d0 {

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.d0$a */
    public static final class a extends AbstractC11730d0 {

        /* renamed from: a */
        public final C11708W f10914a;

        public a(C11708W networkConfigDto) {
            Intrinsics.checkNotNullParameter(networkConfigDto, "networkConfigDto");
            this.f10914a = networkConfigDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f10914a, ((a) obj).f10914a);
        }

        public final int hashCode() {
            return this.f10914a.hashCode();
        }

        public final String toString() {
            return "NotModified(networkConfigDto=" + this.f10914a + ')';
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.d0$b */
    public static final class b extends AbstractC11730d0 {

        /* renamed from: a */
        public final C11708W f10915a;

        public b(C11708W networkConfigDto) {
            Intrinsics.checkNotNullParameter(networkConfigDto, "networkConfigDto");
            this.f10915a = networkConfigDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f10915a, ((b) obj).f10915a);
        }

        public final int hashCode() {
            return this.f10915a.hashCode();
        }

        public final String toString() {
            return "Success(networkConfigDto=" + this.f10915a + ')';
        }
    }
}
