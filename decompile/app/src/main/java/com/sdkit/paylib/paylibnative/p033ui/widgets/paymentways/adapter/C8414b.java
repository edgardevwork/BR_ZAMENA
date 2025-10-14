package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.viewobjects.C8426a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.b */
/* loaded from: classes6.dex */
public final class C8414b extends DiffUtil.Callback {

    /* renamed from: a */
    public final List f3889a;

    /* renamed from: b */
    public final List f3890b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.b$a */
    public static final class a {

        /* renamed from: a */
        public final C8426a f3891a;

        /* renamed from: b */
        public final C8426a f3892b;

        public a(C8426a oldItem, C8426a newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            this.f3891a = oldItem;
            this.f3892b = newItem;
        }

        /* renamed from: a */
        public final C8426a m3653a() {
            return this.f3892b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f3891a, aVar.f3891a) && Intrinsics.areEqual(this.f3892b, aVar.f3892b);
        }

        public int hashCode() {
            return this.f3892b.hashCode() + (this.f3891a.hashCode() * 31);
        }

        public String toString() {
            return "Change(oldItem=" + this.f3891a + ", newItem=" + this.f3892b + ')';
        }
    }

    public C8414b(List oldList, List newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.f3889a = oldList;
        this.f3890b = newList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        return Intrinsics.areEqual(this.f3889a.get(i), this.f3890b.get(i2));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        return ((C8426a) this.f3889a.get(i)).m3707b() == ((C8426a) this.f3890b.get(i2)).m3707b();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public Object getChangePayload(int i, int i2) {
        C8426a c8426a = (C8426a) this.f3889a.get(i);
        C8426a c8426a2 = (C8426a) this.f3890b.get(i2);
        if ((c8426a.m3706a() != c8426a2.m3706a() ? this : null) != null) {
            return new a(c8426a, c8426a2);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.f3890b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.f3889a.size();
    }
}
