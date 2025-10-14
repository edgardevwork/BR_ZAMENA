package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.C8383e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.InterfaceC8379a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.C8386c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8387d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.C8407e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.InterfaceC8403a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8425k;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter.C8414b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.viewobjects.C8426a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.C8428b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8429c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.C8448d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.InterfaceC8445a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.C8451b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.InterfaceC8450a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.a */
/* loaded from: classes6.dex */
public final class C8413a extends RecyclerView.Adapter {

    /* renamed from: a */
    public List f3877a = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: b */
    public c f3878b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.a$a */
    public enum a {
        BISTRO_TYPE,
        CARD_TYPE,
        MOBILE_TYPE,
        SBOLPAY_TYPE,
        TBANK_TYPE,
        WEB_PAY_TYPE
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.a$b */
    public static class b extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.a$c */
    public interface c {
        /* renamed from: a */
        CoroutineScope mo3631a();

        /* renamed from: b */
        InterfaceC8450a mo3632b();

        /* renamed from: d */
        InterfaceC8445a mo3633d();

        /* renamed from: e */
        InterfaceC8387d mo3634e();

        /* renamed from: f */
        InterfaceC8379a mo3635f();

        /* renamed from: g */
        InterfaceC8403a mo3636g();

        /* renamed from: h */
        InterfaceC8429c mo3637h();
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.a$d */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3886a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3887b;

        static {
            int[] iArr = new int[InterfaceC8419e.a.values().length];
            try {
                iArr[InterfaceC8419e.a.WEBPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC8419e.a.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC8419e.a.SBOLPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC8419e.a.BISTRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC8419e.a.TBANK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterfaceC8419e.a.MOBILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3886a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.WEB_PAY_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[a.CARD_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[a.SBOLPAY_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[a.BISTRO_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[a.TBANK_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[a.MOBILE_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            f3887b = iArr2;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.a$e */
    public static final class e extends b {

        /* renamed from: a */
        public final ViewGroup f3888a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewGroup view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f3888a = view;
        }

        /* renamed from: a */
        public final void m3652a(boolean z) {
            ViewParent viewParent = this.f3888a;
            InterfaceC8425k interfaceC8425k = viewParent instanceof InterfaceC8425k ? (InterfaceC8425k) viewParent : null;
            if (interfaceC8425k != null) {
                interfaceC8425k.setSelection(z);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public b onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        a aVar = (a) ArraysKt___ArraysKt.getOrNull(a.values(), i);
        if (aVar == null) {
            throw new IllegalStateException("ItemType.values()[" + i + "] отсутствует!");
        }
        switch (d.f3887b[aVar.ordinal()]) {
            case 1:
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                C8451b c8451b = new C8451b(context, null, 0, 0, 14, null);
                c8451b.m3778a(m3646a().mo3632b(), m3646a().mo3631a());
                return new e(c8451b);
            case 2:
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                C8386c c8386c = new C8386c(context2, null, 0, 0, 14, null);
                c8386c.m3524a(m3646a().mo3634e(), m3646a().mo3631a());
                return new e(c8386c);
            case 3:
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                C8428b c8428b = new C8428b(context3, null, 0, 0, 14, null);
                c8428b.m3715a(m3646a().mo3637h(), m3646a().mo3631a());
                return new e(c8428b);
            case 4:
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
                C8383e c8383e = new C8383e(context4, null, 0, 0, 14, null);
                c8383e.m3505a(m3646a().mo3635f(), m3646a().mo3631a());
                return new e(c8383e);
            case 5:
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "parent.context");
                C8448d c8448d = new C8448d(context5, null, 0, 0, 14, null);
                c8448d.m3766a(m3646a().mo3633d(), m3646a().mo3631a());
                return new e(c8448d);
            case 6:
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "parent.context");
                C8407e c8407e = new C8407e(context6, null, 0, 0, 14, null);
                c8407e.m3621a(m3646a().mo3636g(), m3646a().mo3631a());
                return new e(c8407e);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSizeInv() {
        if (this.f3878b != null) {
            return this.f3877a.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        a aVar;
        switch (d.f3886a[((C8426a) this.f3877a.get(i)).m3707b().ordinal()]) {
            case 1:
                aVar = a.WEB_PAY_TYPE;
                break;
            case 2:
                aVar = a.CARD_TYPE;
                break;
            case 3:
                aVar = a.SBOLPAY_TYPE;
                break;
            case 4:
                aVar = a.BISTRO_TYPE;
                break;
            case 5:
                aVar = a.TBANK_TYPE;
                break;
            case 6:
                aVar = a.MOBILE_TYPE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return aVar.ordinal();
    }

    /* renamed from: a */
    public final c m3646a() {
        c cVar = this.f3878b;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("PaymentWaysAdapter::viewParamsOptional не должен быть null!".toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(b holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        e eVar = holder instanceof e ? (e) holder : null;
        if (eVar != null) {
            eVar.m3652a(((C8426a) this.f3877a.get(i)).m3706a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public void onBindViewHolder(b holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        for (Object obj : payloads) {
            if (obj instanceof C8414b.a) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.PaymentWaysDiffUtil.Change");
                boolean zM3706a = ((C8414b.a) obj).m3653a().m3706a();
                e eVar = holder instanceof e ? (e) holder : null;
                if (eVar != null) {
                    eVar.m3652a(zM3706a);
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: a */
    public final void m3649a(c parts) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f3878b = parts;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void m3650a(List paymentWays) {
        Intrinsics.checkNotNullParameter(paymentWays, "paymentWays");
        DiffUtil.calculateDiff(new C8414b(this.f3877a, paymentWays)).dispatchUpdatesTo(this);
        this.f3877a = paymentWays;
    }
}
