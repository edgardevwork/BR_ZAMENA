package com.sdkit.paylib.paylibnative.p033ui.utils;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.h */
/* loaded from: classes6.dex */
public final class C8373h extends ListAdapter {

    /* renamed from: a */
    public final Function2 f3678a;

    /* renamed from: b */
    public final Function3 f3679b;

    /* renamed from: c */
    public final Function0 f3680c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.h$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {

        /* renamed from: a */
        public static final a f3681a = new a();

        public a() {
            super(2, Object.class, "equals", "equals(Ljava/lang/Object;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object p0, Object obj) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Boolean.valueOf(p0.equals(obj));
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.h$b */
    /* loaded from: classes7.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f3682a = new b();

        public b() {
            super(0);
        }

        /* renamed from: a */
        public final void m3479a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3479a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.h$c */
    public static final class c extends DiffUtil.ItemCallback {

        /* renamed from: a */
        public final /* synthetic */ Function2 f3683a;

        /* renamed from: b */
        public final /* synthetic */ Function2 f3684b;

        public c(Function2 function2, Function2 function22) {
            this.f3683a = function2;
            this.f3684b = function22;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((Boolean) this.f3684b.invoke(oldItem, newItem)).booleanValue();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return ((Boolean) this.f3683a.invoke(oldItem, newItem)).booleanValue();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.h$d */
    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ViewBinding f3685a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f3685a = binding;
        }

        /* renamed from: a */
        public final ViewBinding m3480a() {
            return this.f3685a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8373h(Function2 bindData, Function3 inflateBinding, Function2 areItemsTheSame, Function2 areContentsTheSame, Function0 onLastItemBound) {
        super(new c(areItemsTheSame, areContentsTheSame));
        Intrinsics.checkNotNullParameter(bindData, "bindData");
        Intrinsics.checkNotNullParameter(inflateBinding, "inflateBinding");
        Intrinsics.checkNotNullParameter(areItemsTheSame, "areItemsTheSame");
        Intrinsics.checkNotNullParameter(areContentsTheSame, "areContentsTheSame");
        Intrinsics.checkNotNullParameter(onLastItemBound, "onLastItemBound");
        this.f3678a = bindData;
        this.f3679b = inflateBinding;
        this.f3680c = onLastItemBound;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Function3 function3 = this.f3679b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(parent.context)");
        return new d((ViewBinding) function3.invoke(layoutInflaterFrom, parent, Boolean.FALSE));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C8373h(Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Function2 function24 = (i & 4) != 0 ? a.f3681a : function22;
        this(function2, function3, function24, (i & 8) != 0 ? function24 : function23, (i & 16) != 0 ? b.f3682a : function0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i >= getItemCount() - 1) {
            this.f3680c.invoke();
        }
        Object data = getItem(i);
        Function2 function2 = this.f3678a;
        Intrinsics.checkNotNullExpressionValue(data, "data");
        function2.invoke(data, holder.m3480a());
    }
}
