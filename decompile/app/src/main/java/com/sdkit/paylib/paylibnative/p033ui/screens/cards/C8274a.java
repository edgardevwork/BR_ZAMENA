package com.sdkit.paylib.paylibnative.p033ui.screens.cards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestManager;
import com.sdkit.paylib.paylibnative.p033ui.databinding.C8178c;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.C8274a;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.viewobjects.C8280a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8395a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.a */
/* loaded from: classes6.dex */
public final class C8274a extends RecyclerView.Adapter {

    /* renamed from: a */
    public final RequestManager f2837a;

    /* renamed from: b */
    public final Function1 f2838b;

    /* renamed from: c */
    public final List f2839c;

    /* renamed from: d */
    public b f2840d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.a$a */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public C8395a f2841a;

        /* renamed from: b */
        public final C8178c f2842b;

        /* renamed from: c */
        public final /* synthetic */ C8274a f2843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8274a c8274a, View view, final Function1 onClick) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f2843c = c8274a;
            C8178c c8178cM2113a = C8178c.m2113a(view);
            Intrinsics.checkNotNullExpressionValue(c8178cM2113a, "bind(view)");
            this.f2842b = c8178cM2113a;
            c8178cM2113a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.sdkit.paylib.paylibnative.ui.screens.cards.a$a$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C8274a.a.m2619a(this.f$0, onClick, view2);
                }
            });
        }

        /* renamed from: a */
        public static final void m2619a(a this$0, Function1 onClick, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(onClick, "$onClick");
            C8395a c8395a = this$0.f2841a;
            if (c8395a != null) {
                onClick.invoke(c8395a);
            }
        }

        /* renamed from: a */
        public final void m2620a(C8280a cardItem) {
            Intrinsics.checkNotNullParameter(cardItem, "cardItem");
            C8395a c8395aM2684a = cardItem.m2684a();
            this.f2841a = c8395aM2684a;
            this.f2842b.getRoot().setBackgroundResource(cardItem.m2685b() ? C11403R.drawable.paylib_native_bg_widget_selected : C11403R.drawable.paylib_native_bg_widget_unselected);
            String strM3577b = c8395aM2684a.m3577b();
            if (strM3577b == null || StringsKt__StringsJVMKt.isBlank(strM3577b)) {
                this.f2842b.f2108c.setImageResource(C11403R.drawable.paylib_native_ic_card_placeholder);
            } else {
                this.f2843c.f2837a.load(c8395aM2684a.m3577b()).placeholder(C11403R.drawable.paylib_native_ic_card_placeholder).priority(Priority.HIGH).into(this.f2842b.f2108c);
            }
            this.f2842b.f2109d.setText(c8395aM2684a.m3578c());
            this.f2842b.f2107b.setText(c8395aM2684a.m3576a());
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.a$b */
    /* loaded from: classes8.dex */
    public interface b {
    }

    public C8274a(RequestManager requestManager, Function1 onItemClickListener) {
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.f2837a = requestManager;
        this.f2838b = onItemClickListener;
        this.f2839c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f2840d != null) {
            return this.f2839c.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((a) holder).m2620a((C8280a) this.f2839c.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(C11403R.layout.paylib_native_card_item_view, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context)\n   …item_view, parent, false)");
        return new a(this, viewInflate, this.f2838b);
    }

    /* renamed from: a */
    public final void m2617a(b parts) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f2840d = parts;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void m2618a(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f2839c.clear();
        this.f2839c.addAll(items);
        notifyDataSetChanged();
    }
}
