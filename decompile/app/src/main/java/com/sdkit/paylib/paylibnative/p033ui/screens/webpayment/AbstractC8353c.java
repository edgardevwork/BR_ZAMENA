package com.sdkit.paylib.paylibnative.p033ui.screens.webpayment;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8353c {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.c$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC8353c {

        /* renamed from: a */
        public static final a f3594a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC8353c {

        /* renamed from: a */
        public final String f3595a;

        public b(String str) {
            super(null);
            this.f3595a = str;
        }

        /* renamed from: a */
        public final String m3352a() {
            return this.f3595a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f3595a, ((b) obj).f3595a);
        }

        public int hashCode() {
            String str = this.f3595a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("Loading(userMessage="), this.f3595a, ')');
        }

        public /* synthetic */ b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.c$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC8353c {

        /* renamed from: a */
        public static final c f3596a = new c();

        public c() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.c$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC8353c {

        /* renamed from: a */
        public static final d f3597a = new d();

        public d() {
            super(null);
        }
    }

    public AbstractC8353c() {
    }

    public /* synthetic */ AbstractC8353c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
