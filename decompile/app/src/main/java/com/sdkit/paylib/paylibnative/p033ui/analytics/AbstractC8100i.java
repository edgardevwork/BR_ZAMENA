package com.sdkit.paylib.paylibnative.p033ui.analytics;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i */
/* loaded from: classes8.dex */
public abstract class AbstractC8100i {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC8100i {

        /* renamed from: a */
        public static final a f1753a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$a0 */
    /* loaded from: classes5.dex */
    public static final class a0 extends AbstractC8100i {

        /* renamed from: a */
        public static final a0 f1754a = new a0();

        public a0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC8100i {

        /* renamed from: a */
        public static final b f1755a = new b();

        public b() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$b0 */
    /* loaded from: classes5.dex */
    public static final class b0 extends AbstractC8100i {

        /* renamed from: a */
        public static final b0 f1756a = new b0();

        public b0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC8100i {

        /* renamed from: a */
        public static final c f1757a = new c();

        public c() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$c0 */
    /* loaded from: classes5.dex */
    public static final class c0 extends AbstractC8100i {

        /* renamed from: a */
        public static final c0 f1758a = new c0();

        public c0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC8100i {

        /* renamed from: a */
        public final String f1759a;

        /* renamed from: b */
        public final InterfaceC8419e.a f1760b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String purchaseId, InterfaceC8419e.a paymentWay) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(paymentWay, "paymentWay");
            this.f1759a = purchaseId;
            this.f1760b = paymentWay;
        }

        /* renamed from: a */
        public final InterfaceC8419e.a m1835a() {
            return this.f1760b;
        }

        /* renamed from: b */
        public final String m1836b() {
            return this.f1759a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f1759a, dVar.f1759a) && this.f1760b == dVar.f1760b;
        }

        public int hashCode() {
            return this.f1760b.hashCode() + (this.f1759a.hashCode() * 31);
        }

        public String toString() {
            return "PayButtonClicked(purchaseId=" + this.f1759a + ", paymentWay=" + this.f1760b + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$d0 */
    /* loaded from: classes5.dex */
    public static final class d0 extends AbstractC8100i {

        /* renamed from: a */
        public static final d0 f1761a = new d0();

        public d0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC8100i {

        /* renamed from: a */
        public static final e f1762a = new e();

        public e() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$e0 */
    /* loaded from: classes5.dex */
    public static final class e0 extends AbstractC8100i {

        /* renamed from: a */
        public static final e0 f1763a = new e0();

        public e0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC8100i {

        /* renamed from: a */
        public final String f1764a;

        /* renamed from: b */
        public final List f1765b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String purchaseId, List paymentMethods) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            this.f1764a = purchaseId;
            this.f1765b = paymentMethods;
        }

        /* renamed from: a */
        public final List m1837a() {
            return this.f1765b;
        }

        /* renamed from: b */
        public final String m1838b() {
            return this.f1764a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f1764a, fVar.f1764a) && Intrinsics.areEqual(this.f1765b, fVar.f1765b);
        }

        public int hashCode() {
            return this.f1765b.hashCode() + (this.f1764a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaySheetPaymentAvailableMethods(purchaseId=");
            sb.append(this.f1764a);
            sb.append(", paymentMethods=");
            return C8045g.m1489a(sb, this.f1765b, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$f0 */
    /* loaded from: classes5.dex */
    public static final class f0 extends AbstractC8100i {

        /* renamed from: a */
        public static final f0 f1766a = new f0();

        public f0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC8100i {

        /* renamed from: a */
        public final String f1767a;

        /* renamed from: b */
        public final String f1768b;

        /* renamed from: c */
        public final List f1769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String selectedAppBankName, String selectedAppPackageName, List installedApps) {
            super(null);
            Intrinsics.checkNotNullParameter(selectedAppBankName, "selectedAppBankName");
            Intrinsics.checkNotNullParameter(selectedAppPackageName, "selectedAppPackageName");
            Intrinsics.checkNotNullParameter(installedApps, "installedApps");
            this.f1767a = selectedAppBankName;
            this.f1768b = selectedAppPackageName;
            this.f1769c = installedApps;
        }

        /* renamed from: a */
        public final List m1839a() {
            return this.f1769c;
        }

        /* renamed from: b */
        public final String m1840b() {
            return this.f1767a;
        }

        /* renamed from: c */
        public final String m1841c() {
            return this.f1768b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual(this.f1767a, gVar.f1767a) && Intrinsics.areEqual(this.f1768b, gVar.f1768b) && Intrinsics.areEqual(this.f1769c, gVar.f1769c);
        }

        public int hashCode() {
            return this.f1769c.hashCode() + C8031b.m1429a(this.f1768b, this.f1767a.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaySheetPaymentSBP(selectedAppBankName=");
            sb.append(this.f1767a);
            sb.append(", selectedAppPackageName=");
            sb.append(this.f1768b);
            sb.append(", installedApps=");
            return C8045g.m1489a(sb, this.f1769c, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$g0 */
    /* loaded from: classes5.dex */
    public static final class g0 extends AbstractC8100i {

        /* renamed from: a */
        public static final g0 f1770a = new g0();

        public g0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC8100i {

        /* renamed from: a */
        public final List f1771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List packages) {
            super(null);
            Intrinsics.checkNotNullParameter(packages, "packages");
            this.f1771a = packages;
        }

        /* renamed from: a */
        public final List m1842a() {
            return this.f1771a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f1771a, ((h) obj).f1771a);
        }

        public int hashCode() {
            return this.f1771a.hashCode();
        }

        public String toString() {
            return C8045g.m1489a(new StringBuilder("PaySheetPaymentSBPMissedPackages(packages="), this.f1771a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$h0 */
    /* loaded from: classes5.dex */
    public static final class h0 extends AbstractC8100i {

        /* renamed from: a */
        public static final h0 f1772a = new h0();

        public h0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC8100i {

        /* renamed from: a */
        public static final i f1773a = new i();

        public i() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$i0 */
    /* loaded from: classes5.dex */
    public static final class i0 extends AbstractC8100i {

        /* renamed from: a */
        public static final i0 f1774a = new i0();

        public i0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC8100i {

        /* renamed from: a */
        public static final j f1775a = new j();

        public j() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$j0 */
    /* loaded from: classes5.dex */
    public static final class j0 extends AbstractC8100i {

        /* renamed from: a */
        public static final j0 f1776a = new j0();

        public j0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$k */
    /* loaded from: classes5.dex */
    public static final class k extends AbstractC8100i {

        /* renamed from: a */
        public final boolean f1777a;

        public k(boolean z) {
            super(null);
            this.f1777a = z;
        }

        /* renamed from: a */
        public final boolean m1843a() {
            return this.f1777a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f1777a == ((k) obj).f1777a;
        }

        public int hashCode() {
            boolean z = this.f1777a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return C8030a.m1428a(new StringBuilder("PaySheetSaveCardSelected(isSaveCardSelected="), this.f1777a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$k0 */
    /* loaded from: classes5.dex */
    public static final class k0 extends AbstractC8100i {

        /* renamed from: a */
        public static final k0 f1778a = new k0();

        public k0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC8100i {

        /* renamed from: a */
        public final String f1779a;

        /* renamed from: b */
        public final String f1780b;

        public l(String str, String str2) {
            super(null);
            this.f1779a = str;
            this.f1780b = str2;
        }

        /* renamed from: a */
        public final String m1844a() {
            return this.f1779a;
        }

        /* renamed from: b */
        public final String m1845b() {
            return this.f1780b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.areEqual(this.f1779a, lVar.f1779a) && Intrinsics.areEqual(this.f1780b, lVar.f1780b);
        }

        public int hashCode() {
            String str = this.f1779a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f1780b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaylibInvoiceLoadingFail(code=");
            sb.append(this.f1779a);
            sb.append(", status=");
            return C8032c.m1430a(sb, this.f1780b, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$l0 */
    /* loaded from: classes5.dex */
    public static final class l0 extends AbstractC8100i {

        /* renamed from: a */
        public static final l0 f1781a = new l0();

        public l0() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$m */
    /* loaded from: classes5.dex */
    public static final class m extends AbstractC8100i {

        /* renamed from: a */
        public static final m f1782a = new m();

        public m() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$n */
    /* loaded from: classes5.dex */
    public static final class n extends AbstractC8100i {

        /* renamed from: a */
        public static final n f1783a = new n();

        public n() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$o */
    /* loaded from: classes5.dex */
    public static final class o extends AbstractC8100i {

        /* renamed from: a */
        public final String f1784a;

        /* renamed from: b */
        public final String f1785b;

        public o(String str, String str2) {
            super(null);
            this.f1784a = str;
            this.f1785b = str2;
        }

        /* renamed from: a */
        public final String m1846a() {
            return this.f1784a;
        }

        /* renamed from: b */
        public final String m1847b() {
            return this.f1785b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Intrinsics.areEqual(this.f1784a, oVar.f1784a) && Intrinsics.areEqual(this.f1785b, oVar.f1785b);
        }

        public int hashCode() {
            String str = this.f1784a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f1785b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaylibSdkFailed(code=");
            sb.append(this.f1784a);
            sb.append(", traceId=");
            return C8032c.m1430a(sb, this.f1785b, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$p */
    /* loaded from: classes5.dex */
    public static final class p extends AbstractC8100i {

        /* renamed from: a */
        public final InterfaceC8419e.a f1786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC8419e.a paymentWay) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentWay, "paymentWay");
            this.f1786a = paymentWay;
        }

        /* renamed from: a */
        public final InterfaceC8419e.a m1848a() {
            return this.f1786a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f1786a == ((p) obj).f1786a;
        }

        public int hashCode() {
            return this.f1786a.hashCode();
        }

        public String toString() {
            return "PaymentWaySelected(paymentWay=" + this.f1786a + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$q */
    /* loaded from: classes5.dex */
    public static final class q extends AbstractC8100i {

        /* renamed from: a */
        public final String f1787a;

        /* renamed from: b */
        public final String f1788b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String source, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f1787a = source;
            this.f1788b = str;
        }

        /* renamed from: a */
        public final String m1849a() {
            return this.f1787a;
        }

        /* renamed from: b */
        public final String m1850b() {
            return this.f1788b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Intrinsics.areEqual(this.f1787a, qVar.f1787a) && Intrinsics.areEqual(this.f1788b, qVar.f1788b);
        }

        public int hashCode() {
            int iHashCode = this.f1787a.hashCode() * 31;
            String str = this.f1788b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaymentsError(source=");
            sb.append(this.f1787a);
            sb.append(", state=");
            return C8032c.m1430a(sb, this.f1788b, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$r */
    /* loaded from: classes5.dex */
    public static final class r extends AbstractC8100i {

        /* renamed from: a */
        public static final r f1789a = new r();

        public r() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$s */
    /* loaded from: classes5.dex */
    public static final class s extends AbstractC8100i {

        /* renamed from: a */
        public static final s f1790a = new s();

        public s() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$t */
    /* loaded from: classes5.dex */
    public static final class t extends AbstractC8100i {

        /* renamed from: a */
        public final String f1791a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String purchaseId) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.f1791a = purchaseId;
        }

        /* renamed from: a */
        public final String m1851a() {
            return this.f1791a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && Intrinsics.areEqual(this.f1791a, ((t) obj).f1791a);
        }

        public int hashCode() {
            return this.f1791a.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PaymentsLoading(purchaseId="), this.f1791a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$u */
    /* loaded from: classes5.dex */
    public static final class u extends AbstractC8100i {

        /* renamed from: a */
        public static final u f1792a = new u();

        public u() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$v */
    /* loaded from: classes5.dex */
    public static final class v extends AbstractC8100i {

        /* renamed from: a */
        public final String f1793a;

        /* renamed from: b */
        public final EnumC8092a f1794b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String purchaseId, EnumC8092a enumC8092a) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.f1793a = purchaseId;
            this.f1794b = enumC8092a;
        }

        /* renamed from: a */
        public final EnumC8092a m1852a() {
            return this.f1794b;
        }

        /* renamed from: b */
        public final String m1853b() {
            return this.f1793a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return Intrinsics.areEqual(this.f1793a, vVar.f1793a) && this.f1794b == vVar.f1794b;
        }

        public int hashCode() {
            int iHashCode = this.f1793a.hashCode() * 31;
            EnumC8092a enumC8092a = this.f1794b;
            return iHashCode + (enumC8092a == null ? 0 : enumC8092a.hashCode());
        }

        public String toString() {
            return "PaymentsPayFailed(purchaseId=" + this.f1793a + ", paymentMethod=" + this.f1794b + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$w */
    /* loaded from: classes5.dex */
    public static final class w extends AbstractC8100i {

        /* renamed from: a */
        public final String f1795a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String purchaseId) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.f1795a = purchaseId;
        }

        /* renamed from: a */
        public final String m1854a() {
            return this.f1795a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && Intrinsics.areEqual(this.f1795a, ((w) obj).f1795a);
        }

        public int hashCode() {
            return this.f1795a.hashCode();
        }

        public String toString() {
            return C8032c.m1430a(new StringBuilder("PaymentsPayLoading(purchaseId="), this.f1795a, ')');
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$x */
    /* loaded from: classes5.dex */
    public static final class x extends AbstractC8100i {

        /* renamed from: a */
        public final String f1796a;

        /* renamed from: b */
        public final EnumC8092a f1797b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String purchaseId, EnumC8092a enumC8092a) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
            this.f1796a = purchaseId;
            this.f1797b = enumC8092a;
        }

        /* renamed from: a */
        public final EnumC8092a m1855a() {
            return this.f1797b;
        }

        /* renamed from: b */
        public final String m1856b() {
            return this.f1796a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return Intrinsics.areEqual(this.f1796a, xVar.f1796a) && this.f1797b == xVar.f1797b;
        }

        public int hashCode() {
            int iHashCode = this.f1796a.hashCode() * 31;
            EnumC8092a enumC8092a = this.f1797b;
            return iHashCode + (enumC8092a == null ? 0 : enumC8092a.hashCode());
        }

        public String toString() {
            return "PaymentsPaySucceeded(purchaseId=" + this.f1796a + ", paymentMethod=" + this.f1797b + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$y */
    /* loaded from: classes5.dex */
    public static final class y extends AbstractC8100i {

        /* renamed from: a */
        public static final y f1798a = new y();

        public y() {
            super(null);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.i$z */
    /* loaded from: classes5.dex */
    public static final class z extends AbstractC8100i {

        /* renamed from: a */
        public static final z f1799a = new z();

        public z() {
            super(null);
        }
    }

    public AbstractC8100i() {
    }

    public /* synthetic */ AbstractC8100i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
